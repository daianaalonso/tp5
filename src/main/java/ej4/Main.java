package ej4;

import ej4.modelo.Blog;
import ej4.persistencia.GuardarDisco;
import ej4.persistencia.GuardarJDBC;
import ej4.persistencia.GuardarMemoria;
import ej4.servicios.GsonServicio;
import ej4.servicios.RestCall;

public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog(new RestCall("https://jsonplaceholder.typicode.com/posts"), new GsonServicio(),
                new GuardarJDBC(new GuardarDisco("publicaciones.txt", new GuardarMemoria())));

        Blog blog1 = new Blog(new RestCall("https://jsonplaceholder.typicode.com/posts"), new GsonServicio(),
                new GuardarDisco("publicaciones.txt", new GuardarMemoria()));

        Blog blog2 = new Blog(new RestCall("https://jsonplaceholder.typicode.com/posts"), new GsonServicio(),
                new GuardarJDBC(new GuardarMemoria()));

        Blog blog3 = new Blog(new RestCall("https://jsonplaceholder.typicode.com/posts"), new GsonServicio(),
                new GuardarDisco("publicaciones.txt", new GuardarJDBC(new GuardarMemoria())));

        blog.obtenerPublicaciones();
        blog1.obtenerPublicaciones();
        blog2.obtenerPublicaciones();
        blog3.obtenerPublicaciones();
    }
}
