public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Nataly Cabrera", "1723456789");

        // Crear habitación
        Habitacion hab1 = new Habitacion(101, "Doble");

        // Ver estado antes de la reserva
        hab1.mostrarInfo();

        // Crear reserva
        Reserva reserva1 = new Reserva(cliente1, hab1);

        // Mostrar detalles de la reserva
        reserva1.mostrarReserva();
    }
}
