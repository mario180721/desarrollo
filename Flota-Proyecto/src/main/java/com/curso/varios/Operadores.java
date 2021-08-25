package com.curso.varios;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		
		a++;
		
		int b=a++;// b vale 9 porque primera asigna a en b y lugo inic a
				
		System.out.println(b);
		
		int c =++a; //  c vale 10 y a vale 10
					// primero incrementa y luego asigna en c

		System.out.println(c);
		
		// and y or cortocircuitado
		
		//&  operabit a bit (numrto) y && and cortocircuitado booleano
		
		
		int grande=200;
		byte peque =(byte) grande;
		
		System.out.println(peque); //el casting  corta tamaño, tener cuidado con tamaño de datos
		
		
		
		
	}

}
