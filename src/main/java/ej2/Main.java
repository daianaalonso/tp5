package ej2;

import ej2.modelo.Exportador;
import ej2.modelo.Report;
import ej2.modelo.ReportNoNulo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Exportador exportador = new ReportNoNulo(new Report("Reporte de prueba\n"));
        exportador.export(new File("C:\\Users\\Daiana\\Documentos\\Objetos2\\reporte.txt"));
    }
}
