package me.gonzager.ex.operaciones;

public class Sensor {
    private int capacidad;
    private double durabilidad;
    private boolean tieneBuenaTecnologia;
    public Sensor(int capacidad, double durabilidad, boolean tieneBuenaTecnologia) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.tieneBuenaTecnologia = tieneBuenaTecnologia;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public double getDurabilidad() {
        return durabilidad;
    }
    public boolean tieneBuenaTecnologia() {
        return tieneBuenaTecnologia;
    }
    

    
}
