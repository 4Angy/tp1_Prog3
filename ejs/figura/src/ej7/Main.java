import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estacion lasLenas = new Estacion("Las Leñas", "Contacto Las Leñas", "Ruta 222", "2627-471100", "1200", "29");
        Pista pistaPrincipal = lasLenas.crearPista(1, 3200f, "roja");
        Pista tramoAlto = lasLenas.crearPista(2, 800f, "negra");
        pistaPrincipal.seComponeDe(tramoAlto);

        Federacion fedMendoza = new Federacion("Federación de Ski de Mendoza", 250);
        fedMendoza.agregarEstacion(lasLenas);

        Participante juan = new Participante(30111222, "Juan Pérez", LocalDate.of(2001, 5, 10), 25, fedMendoza);

        Grupo grupoA = new Grupo(1, "Marcos Díaz");
        grupoA.agregarParticipante(juan);

        Campeonato campeonato = new Campeonato();
        Prueba slalom = campeonato.crearPrueba("Slalom Gigante", "Alpino", "2026-08-25", lasLenas);
        slalom.setGanador(juan.getNombre());
        slalom.setTiempoGanador(95.42f);

        Registro registro = new Registro("R001", "2026-08-25", 95.42f, 1, slalom);
        registro.setParticipante(juan);
        registro.setGrupo(grupoA);

        System.out.println("Prueba: " + slalom.getNombre() + " en " + slalom.getEstacion().getNombre());
        System.out.println("Ganador: " + slalom.getGanador() + " - Tiempo: " + slalom.getTiempoGanador());
        System.out.println("Registro " + registro.getCodigo() + " - Posición: " + registro.getPosicion());
        System.out.println("Pistas de " + lasLenas.getNombre() + ": " + lasLenas.getPistas().size());
    }
}
