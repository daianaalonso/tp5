package ej1.modelo;

public class Economico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Motor economico arrancado");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor economico acelerado");
    }

    @Override
    public void apagar() {
        System.out.println("Motor economico apagado");
    }
}
