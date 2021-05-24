package ej2;

import java.io.File;

public abstract class DecoradorReport implements Exportador {

    public DecoradorReport() {
    }

    public abstract void export(File file);
}
