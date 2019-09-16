package eda_viernes;

/**
*Diego Hernández Delgado
*CU: 176262
*EDA: Gamboa
*Fecha: 21/08/2019
*Ejercicio: nombre de archivo como argumento[0] para sumar datos.
*Nota: ejecutar: java leeArchivo2 datos.txt
*/

import java.io.*;
import java.util.Scanner;

public class leeArchivo2{
	public static void main (String [] args){
		
		try{
			File fileIncome = new File(args[0]);
			Scanner readFile = new Scanner ( fileIncome );
			int lines = Integer.parseInt( readFile.next() ) ;
			int numSuma, n1, n2, suma;
			System.out.println("Ejercicio 2: DiegoHD (176262)");
			for(int i=0; i<lines; i++){
				numSuma = i+1;
				n1 = Integer.parseInt( readFile.next() );
				n2 = Integer.parseInt( readFile.next() );
				suma = n1 + n2;
				System.out.println("Suma" + numSuma + ": " + n1 + "+" + n2+ " = " + suma );
			}
		}
		catch( Exception e ){
			System.out.println( "Error: No hay números para sumar\n" + e.getMessage() );
		}		
	}
}
