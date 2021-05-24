package ej4.modelo;

import java.util.List;

public class Blog {
    private Call call;
    private Servicio servicio;
    private Guardar guardar;

    public Blog(Call call, Servicio servicio, Guardar guardar) {
        this.call = call;
        this.servicio = servicio;
        this.guardar = guardar;
    }

    public void obtenerPublicaciones() {
        List<Publicacion> publicaciones = servicio.parsear(call.run());
        for (Publicacion p : publicaciones) {
            guardar.guardarPublicacion(p);
        }
    }
}
