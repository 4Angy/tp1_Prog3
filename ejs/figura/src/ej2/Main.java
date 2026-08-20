package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Crear continente
        Ejercicio2.Continente americaSur = new Ejercicio2.Continente("América del Sur");

        // Crear países
        Pais argentina = new Ejercicio2.Pais("Argentina", americaSur);
        americaSur.agregarPais(argentina);

        Pais chile = new Pais("Chile", americaSur);
        americaSur.agregarPais(chile);

        Pais uruguay = new Pais("Uruguay", americaSur);
        americaSur.agregarPais(uruguay);

        // Crear provincias en Argentina
        Provincia buenosAires = argentina.crearProvincia("Buenos Aires");
        Provincia mendoza = argentina.crearProvincia("Mendoza");

        // Crear provincias en Chile
        Provincia santiago = chile.crearProvincia("Santiago");
        Provincia valparaiso = chile.crearProvincia("Valparaíso");

        // Crear provincias en Uruguay
        Provincia montevideo = uruguay.crearProvincia("Montevideo");

        // Crear ciudades
        Ciudad ciudadBA = new Ciudad("Ciudad de Buenos Aires");
        Ciudad ciudadMendoza = new Ciudad("Ciudad de Mendoza");
        Ciudad ciudadSantiago = new Ciudad("Ciudad de Santiago");
        Ciudad ciudadValparaiso = new Ciudad("Ciudad de Valparaíso");
        Ciudad ciudadMontevideo = new Ciudad("Ciudad de Montevideo");

        // Agregar ciudades a provincias
        buenosAires.getCiudades().add(ciudadBA);
        mendoza.getCiudades().add(ciudadMendoza);
        santiago.getCiudades().add(ciudadSantiago);
        valparaiso.getCiudades().add(ciudadValparaiso);
        montevideo.getCiudades().add(ciudadMontevideo);

        // Asignar capitales provinciales
        buenosAires.setCapital(ciudadBA);
        mendoza.setCapital(ciudadMendoza);
        santiago.setCapital(ciudadSantiago);
        valparaiso.setCapital(ciudadValparaiso);
        montevideo.setCapital(ciudadMontevideo);

        // Asignar capitales nacionales
        argentina.setCapital(buenosAires);
        chile.setCapital(santiago);
        uruguay.setCapital(montevideo);

        // 🚨 Provincias limítrofes válidas (dentro del mismo país)
        santiago.limitarCon(valparaiso);      // Chile

        // 🚨 Provincias limítrofes inválidas (entre países distintos)
        try {
            mendoza.limitarCon(santiago); // Argentina vs Chile
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer provincias limítrofes: " + e.getMessage());
        }

        try {
            buenosAires.limitarCon(montevideo); // Argentina vs Uruguay
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer provincias limítrofes: " + e.getMessage());
        }

        // Definir países limítrofes
        argentina.limitaCon(chile);
        argentina.limitaCon(uruguay);
        chile.limitaCon(argentina);
        uruguay.limitaCon(argentina);

        // 🚨 capital provincial inválida
        try {
            Ciudad ciudadFalsa = new Ciudad("Ciudad Inventada");
            mendoza.setCapital(ciudadFalsa);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar capital provincial: " + e.getMessage());
        }

        System.out.println("Programa finalizado correctamente.");

        // Mostrar toda la información del continente
        americaSur.mostrarInformacion();
    }
}



