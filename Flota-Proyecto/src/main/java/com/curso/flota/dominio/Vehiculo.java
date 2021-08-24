package com.curso.flota.dominio;

import java.io.Serializable;

/**
 *  Clase que modela datos de un vechiculo
 *  la carga maxima permitida se asigna en Kg
 * @author USER
 * @version 1.0.0
 *
 */

public class Vehiculo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//atributos
		
	private double cargaMaxima;
	private String matricula;
	private double cargaActual;
	private int numCajas;
	
	// constructores
	public Vehiculo(double cargaMaxima,String matricula) {
		super();
		this.cargaMaxima = cargaMaxima;
		this.matricula=matricula;
		this.cargaActual=0;
		this.numCajas=0;
		
	}
	//metodos getters y setters
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	
			
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getCargaActual() {
		return cargaActual;
	}
	
	public int getNumCajas() {
		return numCajas;
	}
	
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	
	public void cargar (Caja caja) {
		
		
		if ( (caja.getPeso() + this.cargaActual ) > this.cargaMaxima ){
			//throw exception
			System.out.println("No se pudo añadir caja. Exceso de carga");
		}	else {
			this.cargaActual += caja.getPeso();
			this.numCajas ++;
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [cargaMaxima=" + cargaMaxima + ", matricula=" + matricula + ", cargaActual=" + cargaActual
				+ ", numCajas=" + numCajas + "]";
	}
	
	

	
	
	

}
