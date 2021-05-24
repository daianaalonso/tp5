package ej4.persistencia;

import ej4.modelo.Guardar;
import ej4.modelo.Publicacion;

import java.util.ArrayList;
import java.util.List;

public class GuardarMemoria implements Guardar {
    private final List<Publicacion> publicaciones;

    public GuardarMemoria() {
        publicaciones = new ArrayList<>();
    }

    @Override
    public void guardarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }
}
