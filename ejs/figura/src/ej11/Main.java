import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Lider marta = new Lider("Marta Gómez", "San Martín 123", "261-4445566",
                LocalDate.of(1985, 4, 12), "27-12345678-3",
                LocalDate.of(2018, 2, 1), LocalDate.of(2020, 6, 1));

        Vendedor ana = new Vendedor("Ana López", "Belgrano 456", "261-4556677",
                LocalDate.of(1992, 9, 3), "27-23456789-1",
                LocalDate.of(2021, 3, 15));
        marta.coordinar(ana);

        Producto crema = new Producto("Crema Hidratante", 4500f);
        Producto shampoo = new Producto("Shampoo Natural", 3200f);

        ReunionGeneral ultimaReunion = new ReunionGeneral(LocalDate.of(2026, 7, 1), LocalDate.of(2026, 8, 1));

        Ticket ticket1 = ana.comprarProducto(LocalDate.of(2026, 7, 10), crema);
        Ticket ticket2 = ana.comprarProducto(LocalDate.of(2026, 7, 15), shampoo);

        Cliente laura = ana.agregarCliente("Laura Ruiz", "Alem 789", "261-4667788",
                LocalDate.of(1990, 1, 20), LocalDate.of(2022, 5, 10));
        ticket1.registrarClienteFinal(laura);

        System.out.println("Líder: " + marta.getNombre() + " - Equipo: " + marta.getEquipo().size() + " vendedor/es");
        System.out.println("Vendedor: " + ana.getNombre() + " - Tickets: " + ana.getTickets().size());
        System.out.println("Ticket #1: " + ticket1.getProducto().getNombre() + " - $" + ticket1.getPrecio() +
                " - Cliente: " + (ticket1.getClienteFinal() != null ? ticket1.getClienteFinal().getNombre() : "sin registrar"));
        System.out.println("Ticket #2: " + ticket2.getProducto().getNombre() + " - $" + ticket2.getPrecio() +
                " - Cliente: " + (ticket2.getClienteFinal() != null ? ticket2.getClienteFinal().getNombre() : "sin registrar"));
        System.out.println("Próxima reunión general: " + ultimaReunion.getFechaProximaReunion());
    }
}
