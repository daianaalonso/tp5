package ej4.servicios;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ej4.modelo.Publicacion;
import ej4.modelo.Servicio;

import java.util.List;

public class GsonServicio implements Servicio {

    public List<Publicacion> parsear(String json) {
        return new Gson().fromJson(json, new TypeToken<List<Publicacion>>() {
        }.getType());
    }

}
