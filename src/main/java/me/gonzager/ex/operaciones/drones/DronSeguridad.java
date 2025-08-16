package me.gonzager.ex.operaciones.drones;

public class DronSeguridad extends Dron{
    @Override
    public boolean esAvanzado() {
        return this.getNivelProcesamiento() > 50;
    }
    
}
