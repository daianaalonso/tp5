package ej2;

import java.io.File;

public abstract class DecoradorReport extends Report {

    public DecoradorReport(String reporte) {
        super(reporte);
    }

    public abstract void export(File file);
}
