package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class Exploracion implements Mision {

    @Override
    public int bonus() {
        return 0;
    }

    @Override
    public boolean esAvanzadoEnMision(Dron drone) {
        return drone.eficienciaOperativa() % 2 == 0;
    }

    @Override
    public String nombre() {
        return "exploracion";
    }
    

}
