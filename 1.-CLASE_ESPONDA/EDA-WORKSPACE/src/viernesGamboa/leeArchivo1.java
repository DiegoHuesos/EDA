package viernesGamboa;

/*
*Diego Hernández Delgado
*CU: 176262
*EDA: Gamboa
*Ejercicio1: leer numeros como STDIN para sumarlos.
*Nota: ejecutar: java leeArchivo1 < datos.txt
*/

import java.io.*;
import java.util.Scanner;

public class leeArchivo1{
	public static void main (String [] args){
		Scanner lectura = new Scanner( System.in );
		int t = Integer.parseInt( lectura.next() );
		int numSuma, n1, n2, suma;
		System.out.println("Ejercicio 2: DiegoHD (176262)");
		for(int i = 0; i<t; i++){
			numSuma = i+1;
			n1 = Integer.parseInt( lectura.next() ); 
			n2 = Integer.parseInt( lectura.next() );
			suma = n1 + n2;
			System.out.println("Suma" + numSuma + ": " + n1 + "+" + n2 + " = " + suma );
		}
		
	}
}