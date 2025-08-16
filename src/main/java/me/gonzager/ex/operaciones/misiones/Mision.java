package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public interface Mision {

    boolean esAvanzadoEnMision(Dron drone);

    String nombre();
    int bonus();
    
}
