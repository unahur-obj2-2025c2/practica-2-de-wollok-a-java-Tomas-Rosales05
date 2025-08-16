package me.gonzager.ex.operaciones.misiones;

import me.gonzager.ex.operaciones.drones.Dron;

public class Transporte implements Mision {

	@Override
	public boolean esAvanzadoEnMision(Dron drone) {
        return drone.getAutonomia() > 50;
	}

	@Override
	public String nombre() {
		return "transporte";
	}

	@Override
	public int bonus() {
		return 0;
	}

}
