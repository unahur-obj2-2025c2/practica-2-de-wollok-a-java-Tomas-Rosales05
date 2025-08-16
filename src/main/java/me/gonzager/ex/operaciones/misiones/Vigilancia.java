package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Sensor;
import me.gonzager.ex.operaciones.drones.Dron;

public class Vigilancia implements Mision{
    private List<Sensor> sensores = new ArrayList<>();

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void agregarSensor(Sensor unSensor){
        sensores.add(unSensor);
    }

    @Override
    public boolean esAvanzadoEnMision(Dron drone) {
        boolean salida = false;
        if (sensores != null){
            for(Sensor s : sensores){
                if (s.getDurabilidad() > s.getCapacidad() * 2){
                    salida = true;
                }
            }
        }
        return salida;
    }

    @Override
    public String nombre() {
        return "vigilancia";
    }

    @Override
    public int bonus(){
        int extra = 0;
        if (sensores != null){
            for(Sensor s : sensores){
                if (s.tieneBuenaTecnologia()){
                    extra = s.getCapacidad() * 2;
                    break;
                }
                else{
                    extra = s.getCapacidad();
                }
            }
        }
        return extra;    
    }

}
