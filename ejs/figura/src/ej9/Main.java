import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Museo museo = new Museo();

        Pintura laNoche = new Pintura(1, "La Noche Estrellada", "Óleo post-impresionista",
                LocalDate.of(1889, 6, 1), "Francia", "europea", "post-impresionismo", "post-impresionista",
                "óleo", "lienzo");
        laNoche.setPertenencia(new Permanente(LocalDate.of(1975, 3, 12), 50000f, true));
        museo.agregarObjetoArte(laNoche);

        ColeccionExterna louvre = new ColeccionExterna("Museo del Louvre", "público",
                "Museo nacional francés", "Rue de Rivoli, París", "+33-1-4020-5317", "Dirección de Préstamos");
        Escultura venus = new Escultura(2, "Venus de Milo (réplica)", "Mármol clásico",
                LocalDate.of(-100, 1, 1), "Grecia", "griega", "helenístico", "clásico",
                "mármol", 2.03f, 900f);
        venus.setPertenencia(new EnPrestamo(LocalDate.of(2026, 1, 10), LocalDate.of(2026, 12, 31), louvre));
        museo.agregarObjetoArte(venus);

        Exposicion muestraTemporal = new Exposicion("Clásicos del Arte", LocalDate.of(2026, 3, 1), LocalDate.of(2026, 9, 1));
        muestraTemporal.exhibir(laNoche);
        muestraTemporal.exhibir(venus);
        museo.agregarExposicion(muestraTemporal);

        museo.mostrarInformacion();
    }
}
