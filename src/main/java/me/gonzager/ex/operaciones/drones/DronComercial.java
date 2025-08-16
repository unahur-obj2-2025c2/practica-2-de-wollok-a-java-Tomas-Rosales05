package me.gonzager.ex.operaciones.drones;

public class DronComercial extends Dron {

    @Override
    public double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }

}
