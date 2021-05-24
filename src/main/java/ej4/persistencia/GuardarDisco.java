package ej4.persistencia;

import ej4.modelo.Guardar;
import ej4.modelo.Publicacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class GuardarDisco implements Guardar {
    private final String path;
    private Guardar guardar;

    public GuardarDisco(String path, Guardar guardar) {
        this.path = path;
        this.guardar = guardar;
    }

    @Override
    public void guardarPublicacion(Publicacion publicacion) {
        try {
            File archivo = new File(path);
            Writer writer = new FileWriter(archivo, true);
            writer.write(publicacion.getUserId() + "|| " + publicacion.getId() + "|| " +
                    publicacion.getTitle() + "|| " + publicacion.getBody() + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("No pudo guardarse la publicacion.", e);
        }
    }
}
