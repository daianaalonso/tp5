package ej2.modelo;

import java.io.File;

public class ReportNoNulo implements Exportador {
    private final Exportador exportador;

    public ReportNoNulo(Exportador exportador) {
        this.exportador = exportador;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        this.exportador.export(file);
    }
}
