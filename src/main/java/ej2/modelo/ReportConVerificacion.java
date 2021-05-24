package ej2.modelo;

import java.io.File;

public class ReportConVerificacion implements Exportador {

    private final Exportador exportador;

    public ReportConVerificacion(Exportador exportador) {
        this.exportador = exportador;
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
