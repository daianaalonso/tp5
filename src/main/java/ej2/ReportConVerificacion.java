package ej2;

import java.io.File;

public class ReportConVerificacion extends DecoradorReport {

    public ReportConVerificacion(String reporte) {
        super(reporte);
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
    }
}
