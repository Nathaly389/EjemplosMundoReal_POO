public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void reservar() {
        disponible = false;
    }

    public void mostrarInfo() {
        System.out.println("Habitación Nº" + numero + " | Tipo: " + tipo + " | Disponible: " + disponible);
    }
}
