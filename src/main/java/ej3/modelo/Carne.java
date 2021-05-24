package ej3.modelo;

public class Carne implements Mezclar {
    private final Mezclar mezclar;
    private final String contenido;
    private final double precio;

    public Carne(String contenido, double precio, Mezclar mezclar) {
        this.mezclar = mezclar;
        this.contenido = contenido;
        this.precio = precio;
    }

    @Override
    public double obtenerCosto() {
        return mezclar.obtenerCosto() + precio;
    }

    @Override
    public String obtenerContenido() {
        return mezclar.obtenerContenido() + " + " + contenido;
    }
}
