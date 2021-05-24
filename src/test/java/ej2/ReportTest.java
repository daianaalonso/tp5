package ej2;
import ej2.modelo.Exportador;
import ej2.modelo.Report;
import ej2.modelo.ReportNoNulo;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReportTest {
    private final File archivo = new File ("reporte.txt");
    private final String mensajeEsperado = "Reporte de prueba\n";

    @Test
    void verificarMensaje() throws IOException {
        Exportador exportador = new ReportNoNulo(new Report(mensajeEsperado));
        exportador.export(archivo);
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));){
            assertEquals(mensajeEsperado, reader.readLine());
        }
    }
}
