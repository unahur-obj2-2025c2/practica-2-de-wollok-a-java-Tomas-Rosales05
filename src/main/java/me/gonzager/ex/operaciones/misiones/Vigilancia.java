package me.gonzager.ex.operaciones.misiones;

import java.util.ArrayList;
import java.util.List;

import me.gonzager.ex.operaciones.Sensor;

public class Vigilancia extends Mision{
    private List<Sensor> sensores = new ArrayList<>();

    public Vigilancia(String tipoMision, List<Sensor> sensores) {
        super("vigilancia");
        this.sensores = sensores;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public void agregarSensor(Sensor unSensor){
        sensores.add(unSensor);
    }
}
