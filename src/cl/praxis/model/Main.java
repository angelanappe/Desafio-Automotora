package cl.praxis.model;

public class Main {
    public static void main(String[] args) {

        //para el vuelto del taxi
        Taxi taxi = new Taxi("Rojo", "ABCD-12", 800);
        System.out.println("Vuelto taxi1: " + taxi.pagarPasaje(500)); //devuelve monto original(800)
        System.out.println("Vuelto taxi2: " + taxi.pagarPasaje(2000)); //vuelto = 1200

        //para asientos en el bus
        Bus bus = new Bus("Azul", "EFGH-34", 25);
        System.out.println("\nAsientos disponibles en el bus: " + bus.getCantidadDeAsientos());

        //para los atributos del minibus
        Minibus minibus = new Minibus("Amarillo", "IJKL-56", 20, "Escolar");
        minibus.imprimeBus();

        //instanciando vendedor y cliente:
        Vendedor vendedor = new Vendedor("12345678-9", "Juan", 34, "Avenida 1");
        Cliente cliente = new Cliente("12312345-6", "Juana", 35);

        Tienda tienda = new Tienda(vendedor, taxi, 100);
        System.out.println(tienda.existeStock());
    }
}