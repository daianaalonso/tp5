package ej2;

import ej2.modelo.Exportador;
import ej2.modelo.Report;
import ej2.modelo.ReportNoNulo;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {

    @Test
    void verificarMensaje() throws IOException {
        File archivo = new File("reporte.txt");
        String mensajeEsperado = "Reporte de prueba";
        Exportador exportador = new ReportNoNulo(new Report(mensajeEsperado));
        exportador.export(archivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            assertEquals(mensajeEsperado, reader.readLine());
        }
    }
}
