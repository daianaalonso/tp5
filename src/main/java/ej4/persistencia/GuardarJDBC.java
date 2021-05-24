package ej4.persistencia;

import ej4.modelo.Guardar;
import ej4.modelo.Publicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarJDBC implements Guardar {
    private Guardar guardar;

    public GuardarJDBC(Guardar guardar) {
        this.guardar = guardar;
    }

    @Override
    public void guardarPublicacion(Publicacion publicacion) {
        Connection conexion;
        try {
            conexion = obtenerConexion();
            PreparedStatement st = conexion
                    .prepareStatement("Insert into publicaciones (user_id, id, titulo, cuerpo) values(?, ?, ?, ?)");
            st.setInt(1, publicacion.getUserId());
            st.setInt(2, publicacion.getId());
            st.setString(3, publicacion.getTitle());
            st.setString(4, publicacion.getBody());
            st.executeUpdate();
            st.close();
            conexion.close();
        } catch (SQLException e) {
            throw new RuntimeException("No se pudo guardar la publicacion", e);
        }
    }

    private Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bd_alonso?useSSL=false";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }

}
