package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;


public abstract class Dron {
    private Integer autonomia;
    private Integer nivelProcesamiento;
    private Mision mision;

    public boolean esAvanzado(){
        return false;
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public Integer getNivelProcesamiento() {
        return nivelProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public double eficienciaOperativa(){ 
        return autonomia * 10 + mision.bonus();
    }
}
