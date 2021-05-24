package ej4.modelo;

import java.util.List;

public interface Servicio {

    List<Publicacion> parsear(String json);
}
