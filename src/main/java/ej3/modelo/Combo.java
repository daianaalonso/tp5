package ej3.modelo;

public class Combo implements Mezclar {
    private final String nombre;
    private final String contenido;
    private final double precio;

    public Combo(String nombre, String contenido, double precio) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.precio = precio;
    }

    @Override
    public double obtenerCosto() {
        return this.precio;
    }

    @Override
    public String obtenerContenido() {
        return nombre + ": " + contenido;
    }
}
