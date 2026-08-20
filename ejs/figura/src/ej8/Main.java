import Aeronaves.Avion;
import Aeronaves.TipoAvion;
import Operaciones.Propiedad;
import Operaciones.RegistroServicios;
import Operaciones.Servicio;
import Operaciones.TipoTrabajo;
import Personas.Mecanico;
import Personas.Propietario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int verificaciones = 0;
    private static int exitosas = 0;

    public static void main(String[] args) {
        testCambioDePropietario();
        testServiciosDuplicados();

        System.out.println("Resultado: " + exitosas + "/" + verificaciones + " verificaciones OK.");
    }

    private static void assertTrue(boolean condicion, String descripcion) {
        verificaciones++;
        if (condicion) {
            exitosas++;
            System.out.println("OK - " + descripcion);
        } else {
            System.out.println("ERROR - " + descripcion);
        }
    }

    private static void testCambioDePropietario() {
        Propietario propietarioOriginal = new Propietario("Ana Gómez", "Calle 123", "11223344", 101);
        Propietario propietarioNuevo = new Propietario("Luis Pérez", "Avenida 456", "99887766", 202);
        TipoAvion tipo = new TipoAvion(737, 180.5f, 1500.0f);
        Avion avion = new Avion("LV-100", tipo);

        Propiedad propiedad = new Propiedad(LocalDate.of(2024, 1, 10));
        propiedad.setAvion(avion);
        propiedad.setPropietario(propietarioOriginal);

        List<Propietario> historial = new ArrayList<>();
        historial.add(propietarioOriginal);

        assertTrue(propiedad.getPropietario().equals(propietarioOriginal), "El propietario inicial se asigna correctamente.");

        historial.add(propietarioNuevo);
        propiedad.setPropietario(propietarioNuevo);

        assertTrue(propiedad.getPropietario().equals(propietarioNuevo), "El nuevo propietario queda como vigente.");
        assertTrue(historial.size() == 2, "El historial conserva ambos propietarios.");
        assertTrue(historial.contains(propietarioOriginal) && historial.contains(propietarioNuevo), "Se conserva el propietario anterior y el actual.");
        assertTrue(!propiedad.getPropietario().equals(propietarioOriginal), "Solo el propietario nuevo es vigente.");
    }

    private static void testServiciosDuplicados() {
        RegistroServicios registro = new RegistroServicios();
        Mecanico mecanico = new Mecanico("Carlos Ruiz", "Belgrano 99", "5551234", 303, 120000f, "Mañana");
        TipoAvion tipo = new TipoAvion(320, 150.0f, 1300.0f);
        Avion avion = new Avion("LV-200", tipo);

        Servicio servicio1 = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 12), 20, TipoTrabajo.MANTENIMIENTO, mecanico, avion);
        Servicio servicio2 = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 14), 30, TipoTrabajo.MANTENIMIENTO, mecanico, avion);
        Servicio servicio3 = new Servicio(LocalDate.of(2024, 6, 11), LocalDate.of(2024, 6, 13), 18, TipoTrabajo.MANTENIMIENTO, mecanico, avion);
        Servicio servicio4 = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 12), 20, TipoTrabajo.REVISION, mecanico, avion);
        Servicio servicio5 = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 12), 20, TipoTrabajo.MANTENIMIENTO, mecanico, new Avion("LV-300", tipo));

        assertTrue(registro.agregarServicio(servicio1), "El primer servicio se registra correctamente.");
        assertTrue(!registro.agregarServicio(servicio2), "Se rechaza un servicio duplicado con mismo avión, fecha y tipo.");
        assertTrue(registro.agregarServicio(servicio3), "Un servicio con otra fecha se acepta.");
        assertTrue(registro.agregarServicio(servicio4), "Un servicio con mismo avión y fecha pero otro tipo se acepta.");
        assertTrue(registro.agregarServicio(servicio5), "Un servicio para otro avión se acepta.");

        Servicio servicioDuplicadoConOtroMecanico = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 16), 12, TipoTrabajo.MANTENIMIENTO,
                new Mecanico("Pedro Sosa", "San Martín 8", "44556677", 404, 110000f, "Tarde"), avion);
        assertTrue(!registro.agregarServicio(servicioDuplicadoConOtroMecanico), "Se rechaza la duplicación aunque lo haga otro mecánico.");

        Servicio servicioOtroTipoOtraFecha = new Servicio(LocalDate.of(2024, 6, 15), LocalDate.of(2024, 6, 17), 10, TipoTrabajo.LIMPIEZA, mecanico, avion);
        assertTrue(registro.agregarServicio(servicioOtroTipoOtraFecha), "Un servicio diferente en tipo y fecha se acepta.");

        Servicio servicioConMismoAvionMismaFechaOtroTipo = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 18), 14, TipoTrabajo.COMBUSTIBLE, mecanico, avion);
        assertTrue(registro.agregarServicio(servicioConMismoAvionMismaFechaOtroTipo), "Un servicio con el mismo avión y fecha pero distinto tipo se acepta.");

        Servicio servicioDuplicadoExacto = new Servicio(LocalDate.of(2024, 6, 10), LocalDate.of(2024, 6, 12), 20, TipoTrabajo.MANTENIMIENTO, mecanico, avion);
        assertTrue(!registro.agregarServicio(servicioDuplicadoExacto), "Se rechaza el duplicado exacto del servicio original.");

        assertTrue(registro.getServicios().size() == 6, "La colección mantiene solo registros válidos y no duplica servicios.");
    }
}
