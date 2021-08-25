package com.curso.inter;

public class Aeropuerto {
public static void main(String[] args) {
Aeropuerto aeropuertoCiudad = new Aeropuerto();
Helicoptero helicoptero = new Helicoptero();
HidroAvion hAvion = new HidroAvion();

Aeropuerto aeropuertoLondres = null;
aeropuertoLondres.darPermisoAterrizar(helicoptero);
aeropuertoLondres.darPermisoAterrizar(hAvion);
}

private void darPermisoAterrizar(ObjetoVolador v) {
v.aterrizar();
}
}

