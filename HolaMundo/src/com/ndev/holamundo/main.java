package com.ndev.holamundo;

public class main {
	public static void main (String[] args){
		
		int exit = 0;
		do {
			
		
			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.err.println("");
			System.out.println("Selecciona el numero de la opción deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
	
				
				switch (entrada) {
				case 1:
					System.out.println("entraste a Movies");
					exit = 1;
					break;
				case 2:
					System.out.println("entraste a Series");
					exit = 1;
					break;
				case 3:
					System.out.println("entraste a Books");
					exit = 1;
					break;
				case 4:
					System.out.println("entraste a Magazines");
					exit = 1;
					break;
				case 0:
					System.out.println("saliste del sistema!");
					exit = 0;
					break;

				default:
					System.out.println("Opción no disponible");
					exit  = 1;
					break;
				}
				
			}	while(exit != 0);
			
	}
	

}
}
