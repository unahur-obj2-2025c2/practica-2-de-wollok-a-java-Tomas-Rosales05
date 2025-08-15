package me.gonzager.ex.operaciones;
public class Zona {
    private int tamaño;
    private int cantidadOperaciones;
    public Zona(int tamaño, int cantidadOperaciones) {
        this.tamaño = tamaño;
        this.cantidadOperaciones = cantidadOperaciones;
    }
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    public void setCantidadOperaciones(int cantidadOperaciones) {
        this.cantidadOperaciones = cantidadOperaciones;
    }
    public int getTamaño() {
        return tamaño;
    }
    public int getCantidadOperaciones() {
        return cantidadOperaciones;
    }
    
}
