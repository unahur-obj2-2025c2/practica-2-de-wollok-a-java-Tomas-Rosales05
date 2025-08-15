package me.gonzager.ex.operaciones.misiones;

public abstract class Mision {
    private String tipoMision;
    
    public Mision(String tipoMision) {
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
    }
    
}
