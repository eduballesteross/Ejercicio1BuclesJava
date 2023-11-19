package edu.Ejercicio1Bucles.Controladores;

import java.util.Scanner;

import edu.Ejercicio1Bucles.Servicios.OperativaImplementacion;
import edu.Ejercicio1Bucles.Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OperativaInterfaz operativaI = new OperativaImplementacion();
		Scanner sc = new Scanner(System.in);
		
		
		int mesesPlazo;
		long pagoInicial=10;
		long totalPagado;
	
		mesesPlazo= operativaI.CapturaEnteroMesPlazo("Introduzca el número de meses en los que deseas pagar el producto: ", sc);
		
	
		for (int x = 1; x <= mesesPlazo; x++) {
		    System.out.println("Pago número " + x);
		    
		    double numPago = pagoInicial;  
		    
		    for (int i = 1; i <= x; i++) {
		        System.out.println("   Pago " + i + ": " + numPago + " €");
		        numPago *= 2;  
		        
		        
		    	}
		}
	
		  System.out.println("El coste total ha sido de " + pagoInicial+ "€");
		
	}
}
