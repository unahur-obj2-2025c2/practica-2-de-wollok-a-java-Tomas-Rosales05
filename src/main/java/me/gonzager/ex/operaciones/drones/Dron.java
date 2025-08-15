package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.Sensor;
import me.gonzager.ex.operaciones.misiones.Mision;
import me.gonzager.ex.operaciones.misiones.Vigilancia;

public abstract class Dron {
    private Double autonomia;
    private int nivelProcesamiento;
    private Mision mision;
    private boolean esAvanzado = false;
    
    public Dron(Double autonomia, int nivelProcesamiento, Mision mision, boolean esAvanzado){
        this.autonomia = autonomia;
        this.nivelProcesamiento = nivelProcesamiento;
        this.mision = mision;
        this.esAvanzado = esAvanzado;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }

    public Double getAutonomia() {
        return autonomia;
    }

    public int getNivelProcesamiento() {
        return nivelProcesamiento;
    }

    public Mision getMision() {
        return mision;
    }

    public void setNivelProcesamiento(int nivelProcesamiento) {
        this.nivelProcesamiento = nivelProcesamiento;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public boolean esAvanzado() {
        return esAvanzado;
    }
    
    public double eficienciaOperativa(){
        double eficiencia = autonomia * 100;
        if( mision.getTipoMision() == "transporte" ){
            eficiencia = eficiencia + + 100;
        }
        else if (mision.getTipoMision() == "vigilancia"){
            Vigilancia v = (Vigilancia) mision;
            for(Sensor  sensor : v.getSensores() ){
                if( sensor.tieneBuenaTecnologia()){
                    eficiencia = eficiencia + sensor.getCapacidad() * 2;
                }
            eficiencia = eficiencia + sensor.getCapacidad();
            }
        }
        return eficiencia;  
    }
}
