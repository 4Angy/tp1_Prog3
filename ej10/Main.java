import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear sede con 2 complejos
        Sede sede = new Sede(0, 100000.0f, null);

        Polideportivo poli = new Polideportivo("Av. Principal 123", "Jefe Poli");
        Monodeportivo mono = new Monodeportivo("Calle Secundaria 45", "Jefe Mono", new Deporte("Fútbol"));

        sede.agregarComplejo(poli);
        sede.agregarComplejo(mono);

        // Agregar áreas a complejos
        Deporte atletismo = new Deporte("Atletismo");
        Deporte natacion = new Deporte("Natación");
        Deporte futbol = new Deporte("Fútbol");
        poli.agregarArea(atletismo, "Centro");
        poli.agregarArea(natacion, "Esquina N-E");
        // registrar también en la lista de deportes del polideportivo
        poli.agregarDeporte(atletismo);
        poli.agregarDeporte(natacion);
        mono.agregarArea(futbol, "Cancha principal");

        // Crear eventos
        Evento carrera = new Evento(LocalDate.of(2026,8,20), 2, 8);
        Evento partido = new Evento(LocalDate.of(2026,8,21), 1, 22);

        // Asociar eventos a complejos
        poli.agregarEvento(carrera);
        mono.agregarEvento(partido);

        // Comisarios
        Comisario ana = new Comisario("Ana Pérez", "12345678");
        Comisario juan = new Comisario("Juan Ruiz", "87654321");

        // Materiales
        Material porterias = new Material("Porterías", "Juego de porterías reglamentarias");
        Material vallas = new Material("Vallas", "Vallas para atletismo");

        // Relacionar comisarios y materiales con eventos (N:M)
        partido.agregarComisario(ana);
        partido.agregarComisario(juan);
        carrera.agregarComisario(ana); // Ana en dos eventos

        partido.agregarMaterial(porterias);
        carrera.agregarMaterial(vallas);

        // Mostrar info y verificaciones simples
        sede.mostrarInfo();
        System.out.println("--- Detalle de eventos ---");
        carrera.mostrarInfo();
        partido.mostrarInfo();

        System.out.println("--- Comisarios ---");
        ana.mostrarInfo();
        juan.mostrarInfo();

        System.out.println("--- Materiales ---");
        porterias.mostrarInfo();
        vallas.mostrarInfo();

        // Verificaciones (simples)
        boolean ok = true;
        ok &= (sede.getComplejos().size() == 2);
        ok &= (poli.getDeportes().size() == 2);
        ok &= (mono.getDeporteUnico() != null && mono.getDeporteUnico().getNombre().equals("Fútbol"));
        ok &= (poli.getEventos().contains(carrera));
        ok &= (mono.getEventos().contains(partido));
        ok &= (partido.getComisarios().size() == 2);
        ok &= (carrera.getComisarios().size() == 1);
        ok &= (ana.getEventos().size() == 2);
        ok &= (porterias.getEventos().size() == 1 && porterias.getEventos().contains(partido));
        ok &= (vallas.getEventos().size() == 1 && vallas.getEventos().contains(carrera));

        System.out.println("Verificaciones rápidas: " + (ok ? "OK" : "FALTAN") );
    }
}
