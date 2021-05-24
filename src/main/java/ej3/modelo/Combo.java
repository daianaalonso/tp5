package ej3.modelo;

public class Combo implements Mezclar {
    private String nombre;
    private String contenido;
    private double precio;

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
        return nombre +": "+ contenido;
    }
}
