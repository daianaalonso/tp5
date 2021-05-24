package ej2.modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Report implements Exportador {
    private final String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        try {
            Writer writer = new FileWriter(file, true);
            writer.write(reporte);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("No pudo guardarse el reporte", e);
        }
    }
}
