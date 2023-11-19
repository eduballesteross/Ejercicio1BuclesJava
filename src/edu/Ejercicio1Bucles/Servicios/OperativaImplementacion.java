package edu.Ejercicio1Bucles.Servicios;

import java.util.Scanner;

public class OperativaImplementacion implements OperativaInterfaz {



public int CapturaEnteroMesPlazo(String mensaje, Scanner scanner) {
	
	int numero;
	
	do {
	
		System.out.println(mensaje);
		while(!scanner.hasNextInt()){
			System.out.println("[ERROR] Introduzca un número entero válido");
			System.out.println(mensaje);
			scanner.next();
		}
		
		numero = scanner.nextInt();
		
		if (numero<=0) {
			  System.out.println("[ERROR] Debe ingresar un número entero correspondiente al número de meses que desee pagar el producto.");
		}
	
	}while (numero<=0);
		return numero;
	}



public void CalculaPlazos(int mesesPlazos) {
	
	for(int x = 10; x<mesesPlazos;x*=2 ) 
	{
		System.out.println(x);
	}
}
	

}