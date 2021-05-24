package ej2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Report {
    private final String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        try {
            Writer writer = new FileWriter(file, true);
            writer.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
