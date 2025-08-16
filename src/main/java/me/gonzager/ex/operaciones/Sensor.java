package me.gonzager.ex.operaciones;

public final class Sensor {
    private final int capacidad;
    private final int durabilidad;
    private final boolean tieneBuenaTecnologia;
    public Sensor(int capacidad, int durabilidad, boolean tieneBuenaTecnologia) {
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
