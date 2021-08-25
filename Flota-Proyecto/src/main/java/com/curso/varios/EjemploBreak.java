package com.curso.varios;

public class EjemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		int x2=1;
		int x3=1;
		
		while (x<21) {
								
			System.out.println(x);
							x++;
		}
		
				
		
		while (x2<21) {
			
			if (x2 % 2 == 0) {
				System.out.println(x2+"par");
			} else {
				System.out.println(x2+"impar");
			}
						
							x++;
		}
		
		
while (x3<21) {
			
	//System.out.println(x3);
	
	if (x3==7) {
		
		System.out.println("");
		x3++;
		continue;
		
	}
	
			if (x3 % 2 == 0) {
				System.out.println(x3+"par");
			} else {
				System.out.println(x3+"impar");
			}
						
							x++;
		}
		
		
		
		

// con form 5 veces mostrar las lñetras de la a la F


for (int i = 0; i < 5; i++) {
	for (int j = (byte)'A'; j <= (byte)'F'; j++) {
		System.out.print((char)j);
		if (j=='E') break; 
			
			System.out.println();
				
	}
	
}


	}

}
