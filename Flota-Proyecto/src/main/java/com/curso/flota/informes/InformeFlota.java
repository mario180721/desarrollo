package com.curso.flota.informes;

import com.curso.flota.dominio.Vehiculo;

public class InformeFlota {

	
	private void generar() {
		// TODO Auto-generated method stub
		
	//	Vehiculo v= new Vehiculo (0,"uiyu"); 

			
		
	}
	
	
	public void informeConsumo(Vehiculo[]flota) {
		
		System.out.println("....Informe de consumos flota...");
		System.out.println("consumos por vehiculos");
		
		double total =0;
		
		for (Vehiculo f : flota) {
			
			double consumo =f.calcularFuel();
			total +=consumo;
			
			System.out.println(f.getMatricula()+":"+consumo);
			
		}
		
		System.out.println("...................");
		System.out.println("Total de consumo"+total);
		System.out.println("............");
		
	}
}



class AsistenteInforme{}