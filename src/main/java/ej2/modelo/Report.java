package ej2.modelo;

import java.io.*;

public class Report implements Exportador {
    private final String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(reporte);
        } catch (IOException e) {
            throw new RuntimeException("No pudo guardarse el reporte", e);
        }
    }
}
