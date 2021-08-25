package com.curso.flota;

import com.curso.flota.dominio.Caja;
import com.curso.flota.dominio.Camion;
import com.curso.flota.dominio.Vehiculo;

public class Application
{
	public static void main( String[] args )
	{
		
		//uso de una clase
		//crear una instancia de la clase(objeto)
		
		Vehiculo v =new Vehiculo(200.0,"B7777");
		Vehiculo v2 =new Vehiculo(3200.0,"B7777");
		Vehiculo v3=v;
		
		int nota=8;
		
		// v,v2,v3 son variables de referencia que puntan aun obejto de 
		// de la clase vehiculo

		System.out.printf("Carga maxima es %f y nota %d",v2.getCargaMaxima(),nota);

		
		generador(v2,nota);
		
		System.out.printf("Carga maxima es %f y nota %d %n",v2.getCargaMaxima(),nota);
		
		
		//mostrar los datros de un vehiculo
		
		System.out.printf("Carga maxima es %f y nota %d %n",v2.getMatricula(),v2.getCargaMaxima());

		
		System.out.println(".... cargo una caja de 500 kg en v2");
		v2.cargar(new Caja(500));
		System.out.println(v2);
		System.out.println(".... cargo una caja de 70 kg en v2");
		v2.cargar(new Caja(70));
		System.out.println(v2);
		
		
		double d = Vehiculo.CARGA_MAXIMA_DEFECTO;
	    double dd= v2.CARGA_MAXIMA_DEFECTO;
	}

	
	/*private static void generador(Vehiculo v, int nota) {
	
		
		Vehiculo v4=v;
		nota=9;
		 v4.setCargaMaxima(555.0);
	//	Vehiculo v5 = new Vehiculo (4000,"BUUU");
		
				
	}*/
	
//Vehiculo[] lista=new Vehiculo[3];
	
	lista [0]= new Camion (1000,"c111",5);
	lista [1]= new Barcaza (1000,"b111");
	lista [2]= new Camion (1000,"d111",2);
	
	new InformeFlota().informeConsumo(lista);
	
	Vehiculo micamion=new Camion(44,"",7);
	
	
}

}


	