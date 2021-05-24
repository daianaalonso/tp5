package ej2.modelo;

import java.io.File;

public class ReportSinSobreescribir implements Exportador {
    private final Exportador exportador;

    public ReportSinSobreescribir(Exportador exportador) {
        this.exportador = exportador;
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.exportador.export(file);
    }
}
