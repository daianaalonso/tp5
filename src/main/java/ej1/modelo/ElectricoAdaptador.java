package ej1.modelo;

public class ElectricoAdaptador implements Motor {
    private final Electrico electrico;

    public ElectricoAdaptador(Electrico electrico) {
        this.electrico = electrico;
    }

    @Override
    public void arrancar() {
        this.electrico.conectar();
        this.electrico.activar();
    }

    @Override
    public void acelerar() {
        this.electrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        this.electrico.detener();
        this.electrico.desconectar();
    }
}
