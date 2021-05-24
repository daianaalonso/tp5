package ej1.modelo;

public class Comun implements Motor {

    @Override
    public void arrancar() {
        System.out.println("Motor comun arrancado");
    }

    @Override
    public void acelerar() {
        System.out.println("Motor comun acelerado");
    }

    @Override
    public void apagar() {
        System.out.println("Motor comun apagado");
    }
}
