import java.io.*;
import java.util.Scanner;

public class leeArchivo2{
	public static void main (String [] args){
		File fileIncome = new File(args[0]);
		
		try{
			Scanner readFile = new Scanner ( fileIncome );
			int lines = Integer.parseInt( readFile.next() ) ;
			int n=0;
			for(int i=0; i<lines; i++){
				n= Integer.parseInt( readFile.next() )  +  Integer.parseInt( readFile.next() );	
				System.out.println("Suma[" + i + "]:" + n );
			}
		}
		catch( Exception e ){
			System.out.println( e.getMessage() );
		}		
	}
}
