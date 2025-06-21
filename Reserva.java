public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        habitacion.reservar(); // Marca la habitación como no disponible
    }

    public void mostrarReserva() {
        System.out.println("Reserva realizada:");
        cliente.mostrarDatos();
        habitacion.mostrarInfo();
    }
}
