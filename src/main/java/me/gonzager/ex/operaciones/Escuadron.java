package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;

public class Escuadron {
    private int  capacidadOperativa = 10;
    private List<Dron> drones = new ArrayList<>();
    public int getCapacidadOperativa() {
        return capacidadOperativa;
    }

    public void setCapacidadOperativa(int capacidadOperativa) {
        this.capacidadOperativa = capacidadOperativa;
    }

    public void agregarDrones(Dron unDron){
        drones.add(unDron);
    }

    public List<Dron> getDrones() {
        return drones;
    }

    public boolean puedeOperar(Zona unaZona){
        boolean salida = false;
        for(Dron dron : drones){
            if(dron.esAvanzado()){
                salida = true;
            }
        }
        return salida &&  this.capacidadOperativa > unaZona.getTamaño() * 2;
    }
}
