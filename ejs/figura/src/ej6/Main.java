import Especies.*;
import Individuos.*;
import Individuos.Roles.*;
import Lugar.*;
import Transporte.*;
import otros.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Comunidad Autónoma
        ComunidadAutonoma mendoza = new ComunidadAutonoma("Mendoza", "Secretaría de Ambiente");

        // Parque y áreas (creadas dentro del Parque)
        Parque aconcagua = new Parque("Parque Nacional Aconcagua", LocalDate.of(1983, 9, 28));
        Area zonaNorte = aconcagua.agregarArea("Zona Norte", 120.5);
        Area zonaSur = aconcagua.agregarArea("Zona Sur", 95.3);
        mendoza.agregarParque(aconcagua);

        // Entradas
        Entrada entrada1 = new Entrada(1, "Acceso Norte", "09:00-18:00");
        Entrada entrada2 = new Entrada(2, "Acceso Sur", "08:00-17:00");
        aconcagua.agregarEntrada(entrada1);
        aconcagua.agregarEntrada(entrada2);

        // Especies en áreas
        Herbivoro guanaco = new Herbivoro("Lama guanicoe", "Guanaco", "Primavera");
        Carnivoro puma = new Carnivoro("Puma concolor", "Puma", "Invierno");
        Vegetal lenga = new Vegetal("Nothofagus pumilio", "Lenga", true);
        lenga.setPeriodoFloracion("Verano");

        zonaNorte.agregarEspecie(guanaco, 25);
        zonaNorte.agregarEspecie(puma, 8);
        zonaSur.agregarEspecie(lenga, 120);

        // Visitantes
        Visitante visitante1 = new Visitante("33333333C", "Carlos López", "Profesor");
        Visitante visitante2 = new Visitante("44444444D", "María Torres", "Ingeniera");

        // Registrar visitas en entradas
        entrada1.registrarVisita(visitante1);
        entrada2.registrarVisita(visitante2);

        // Alojamientos y excursiones
        Alojamiento refugio = new Alojamiento("Refugio Aconcagua", 50, "3 estrellas");
        aconcagua.agregarAlojamiento(refugio);

        Excursion excursion1 = new Excursion("EXC001", LocalDate.of(2026, 8, 20), LocalTime.of(10, 0));
        excursion1.agregarAlojamiento(refugio);
        excursion1.inscribirVisitante(visitante1);
        excursion1.inscribirVisitante(visitante2);

        // Habitaciones y reservas
        Habitacion hab1 = new Habitacion("Habitación 1", 2);
        Reserva reserva1 = new Reserva(visitante1, hab1, LocalDate.of(2026, 8, 19), LocalDate.of(2026, 8, 21));
        hab1.agregarReserva(reserva1);

        // Personal con overlapping roles
        Personal juan = new Personal("11111111A", "Juan Pérez", "C/ Falsa 123", "600000000", 3000f, "SS12345");
        juan.agregarRol(new RolCelador(aconcagua, entrada1));
        juan.agregarRol(new RolGuarda(zonaNorte, aconcagua, new Vehiculo("Camioneta 4x4", "ABC-123")));
        RolInvestigador rolInvestigador = new RolInvestigador("Lic. en Biología", aconcagua);
        juan.agregarRol(rolInvestigador);

        // Proyecto e investigación ternaria
        Proyecto proyectoFauna = new Proyecto("Estudio de fauna silvestre", 500000,
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 12, 31));
        proyectoFauna.agregarEspecie(guanaco);
        proyectoFauna.agregarEspecie(puma);

        Investigacion investigacion = new Investigacion(rolInvestigador, proyectoFauna, Arrays.asList(guanaco, puma));

        // Mostrar información
        System.out.println("Comunidad Autónoma: " + mendoza.getParques().get(0).getComunidades().get(0).getNombre());
        System.out.println("Parque: " + aconcagua.getNombre() + " | Declarado: " + aconcagua.getFechaDeclaracion());

        System.out.println("\nÁreas:");
        for (Area a : aconcagua.getAreas()) {
            System.out.println(" - " + a.getNombre() + " (" + a.getKm2() + " km2)");
            for (IndividuosPorArea registro : a.getIndividuosPorArea()) {
                Especie e = registro.getEspecie();
                System.out.println("   Especie: " + e.getNombreVulgar() + " (" + e.getNombreCientifico() +
                        ") | Individuos: " + registro.getCantidadIndividuos());
            }
        }

        System.out.println("\nEntradas:");
        for (Entrada e : aconcagua.getEntradas()) {
            System.out.println(" - Entrada nº" + e.getNumero() + " (" + e.getUbicacion() + ") Horario: " + e.getHorario());
            System.out.println("   Visitantes registrados:");
            for (Visitante v : e.getVisitas()) {
                System.out.println("     " + v.getNombre() + " (" + v.getProfesion() + ")");
            }
        }

        System.out.println("\nAlojamiento: " + refugio.getNombre() + " | Capacidad: " + refugio.getCapacidad() + " | Categoría: " + refugio.getCategoria());
        System.out.println("Excursiones organizadas:");
        System.out.println(" - Código: " + excursion1.getCodigo() + " | Día: " + LocalDate.of(2026, 8, 20) + " | Hora: " + LocalTime.of(10, 0));
        System.out.println("   Visitantes inscritos:");
        for (Visitante v : excursion1.getVisitantes()) {
            System.out.println("     " + v.getNombre() + " (" + v.getProfesion() + ")");
        }

        System.out.println("\nHabitaciones y reservas:");
        for (Reserva r : hab1.getReservas()) {
            System.out.println(" - " + r.getVisitante().getNombre() + " reservó " + r.getHabitacion().getNombre() +
                    " desde " + r.getFechaInicio() + " hasta " + r.getFechaFin());
        }

        System.out.println("\nPersonal:");
        juan.mostrarInfo();

        System.out.println("\nInvestigación:");
        investigacion.mostrarInvestigacion();
    }
}
