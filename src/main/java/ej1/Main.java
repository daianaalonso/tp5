package ej1;

import ej1.modelo.*;

public class Main {
    public static void main(String[] args) {

        Motor motorComun = new Comun();
        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();

        Motor motorEconomico = new Economico();
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        Motor motorElectrico = new ElectricoAdaptador(new Electrico());
        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();
    }
}
