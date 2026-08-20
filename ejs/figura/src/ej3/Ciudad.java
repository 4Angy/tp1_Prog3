public class Ciudad {
    private int habitantes;
    private final MontoRecaudado montoRecaudado;

    public Ciudad(int habitantes, float imp1, float imp2, float imp3, float imp4, float imp5, float costosDeMantenimiento) {
        this.habitantes = habitantes;
        this.montoRecaudado = new MontoRecaudado(imp1, imp2, imp3, imp4, imp5, costosDeMantenimiento);
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public MontoRecaudado getMontoRecaudado() {
        return montoRecaudado;
    }

    public boolean estaEnDeficit() {
        return montoRecaudado.estaEnDeficit();
    }

    public void mostrarInformacion() {
        System.out.println("    Ciudad (" + habitantes + " habitantes) - En déficit: " + estaEnDeficit());
    }
}
