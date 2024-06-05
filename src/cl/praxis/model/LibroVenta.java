package cl.praxis.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta; //“01102020”

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directorio = new File("ficheros");
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        String nombreArchivo = "ficheros/" + nombreVenta + ".txt";
        File archivo = new File(nombreArchivo);

        if (archivo.exists()) { //validar que el archivo exista
            System.out.println("El archivo ya existe.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            writer.write("Patente del vehículo: " + vehiculo.getPatente() + "\n");
            writer.write("Edad del cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la venta: " + fechaVenta + "\n");
            writer.write("Nombre de la venta: " + nombreVenta + "\n");
            System.out.println("Venta guardada exitosamente en " + nombreArchivo + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
