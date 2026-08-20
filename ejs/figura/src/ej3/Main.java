public class Main {
    public static void main(String[] args) {
        Pais argentina = new Pais("Argentina");

        Ejercicio2.Provincia mendoza = argentina.crearProvincia(1800000);
        mendoza.crearCiudad(115000, 20000, 15000, 10000, 5000, 3000, 40000);
        mendoza.crearCiudad(60000, 5000, 4000, 3000, 2000, 1000, 30000);
        mendoza.crearCiudad(45000, 4000, 3000, 2000, 1000, 500, 25000);

        Ejercicio2.Provincia sanJuan = argentina.crearProvincia(680000);
        sanJuan.crearCiudad(112000, 25000, 20000, 15000, 10000, 5000, 50000);

        argentina.mostrarInformacion();
    }
}
