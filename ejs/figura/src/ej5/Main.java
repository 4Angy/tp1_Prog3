public class Main {
    public static void main(String[] args) {
        Ciudad mendoza = new Ciudad("Mendoza");

        Restaurante laParrilla = new Restaurante();
        mendoza.agregarRestaurante(laParrilla);

        Sucursal sucursalCentro = laParrilla.crearSucursal("Centro");
        Sucursal sucursalGodoyCruz = laParrilla.crearSucursal("Godoy Cruz");

        Plato asado = new Plato("Asado");
        Plato empanadas = new Plato("Empanadas");

        PlatoSucursal asadoCentro = sucursalCentro.ofrecerPlato(asado);
        sucursalCentro.ofrecerPlato(empanadas);
        sucursalGodoyCruz.ofrecerPlato(asado);

        Persona ana = new Persona("Ana");
        ana.frecuentar(laParrilla);
        ana.leGusta(asadoCentro);

        System.out.println("Ciudad: " + mendoza.getNombre());
        System.out.println("Restaurantes: " + mendoza.getRestaurantes().size());
        System.out.println("Sucursales de La Parrilla: " + laParrilla.getSucursales().size());
        System.out.println("Platos en el menú del Centro: " + sucursalCentro.getMenu().size());
        System.out.println(ana.getNombre() + " frecuenta " + ana.getRestaurantesFrecuentados().size() + " restaurante/s");
        System.out.println(ana.getNombre() + " tiene " + ana.getPlatosQueLeGustan().size() + " plato/s favorito/s");
    }
}
