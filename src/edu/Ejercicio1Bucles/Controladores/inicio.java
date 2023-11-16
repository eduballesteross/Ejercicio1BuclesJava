package edu.Ejercicio1Bucles.Controladores;

import java.text.DecimalFormat;
import java.util.Scanner;

import edu.Ejercicio1Bucles.Servicios.OperativaImplementacion;
import edu.Ejercicio1Bucles.Servicios.OperativaInterfaz;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		OperativaInterfaz operativaI = new OperativaImplementacion();
		Scanner sc = new Scanner(System.in);
		
		double costeCompra;
		int mesesPlazo;
	
		costeCompra = operativaI.CapturaDoubleCosteCompra("Introduzca el coste del producto a pagar: ", sc);
		
		mesesPlazo= operativaI.CapturaEnteroMesPlazo("Introduzca el número de meses en los que deseas pagar el producto: ", sc);
		
		
		double costePlazos;
		
		//Hacemos que el numero double solo muestre dos decimales.
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		costePlazos=(costeCompra/mesesPlazo);
		String doubleDosDecimales = df.format(costePlazos);
		
		System.out.print("Deberá pagar "+ doubleDosDecimales + " euros por mes durante " +mesesPlazo+ " meses");
		
	}

}
