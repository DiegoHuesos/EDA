/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursiveExercises;

/**
 *
 * @author huesos
 */
public class RecursiveExercises {
    
    public RecursiveExercises(){
       //Constructor 
    }
    
    //EJERCICIO 1: Dada una cadena con n caracteres, realizar un método que escriba en pantalla sus n! permutaciones:
    // Ej. "1,2,3" -> 123, 132, 213, 231, 312, 321
    public String permutar (String str){
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        return permutar(res, str, temp);
    }
    
    private String permutar(StringBuilder res, String str, StringBuilder temp){
        for(int i=0; i<str.length(); i++){
            temp.append( str.charAt(i) );
            String word = str.substring(0, i) + str.substring(i+1);
            permutar(res, word, temp);
            temp.deleteCharAt( temp.length()-1 );
        }
        
        if(str.length() == 0)
            res.append(temp).append("\n");
        return res.toString();
    }
    
    /*
    EJERCICIO 2: Dadas 2 cadenas s1 y s2, encontrar cuál es el mínimo de operaciones (distancia) 
    para convertir s1 en s2 donde las operaciones posibles son:
    
        *Sustitución: cambiar un caracter por otro 
        *Remoción: borrar un caracter de alguna
        *Adición: agregar un caracter  
    */
    
    public int distanceWords(String s1, String s2 ){
        return distanceWords(s1, s2, 0,  Math.max(s1.length(),s2.length())  );
    }
    
    private int distanceWords(String s1, String s2, int cont, int max){
        
        if( s1.length()==0 || s2.length()==0)
            return cont + s1.length() + s2.length();  
         
        if(cont >= max)
            return max;
            
        if(s1.charAt(0) == s2.charAt(0))
            return distanceWords(s1.substring(1), s2.substring(1), cont, max);  
        
        //Sustituir
        int r1 = distanceWords(s1.substring(1), s2.substring(1), cont+1, max);
        //Borrar
        int r2 = distanceWords(s1.substring(1), s2, cont+1, max);
        //Añadir
        int r3 = distanceWords(s1, s2.substring(1), cont+1, max);
        
        //Regresar el menor:
        return Math.min(Math.min(r1, r2), r3); 
    }
    
   
    
    
    
    //MAIN:
    public static void main ( String [] args ) {
        RecursiveExercises obj = new RecursiveExercises();
        
        System.out.println("PRUEBA PERMUTACIONES:");
        System.out.println(obj.permutar("123"));
        System.out.println("\n");
        
        System.out.println("PRUEBA WORD DISTANCE:");
        System.out.println( "Words distance: "+obj.distanceWords("", "Diego") +"    (ø, Diego)" );
        System.out.println( "Words distance: "+obj.distanceWords("i", "Diego") +"   (i, Diego)");
        System.out.println( "Words distance: "+obj.distanceWords("Dieg", "Diego") +"    (Dieg, Diego)");
        System.out.println( "Words distance: "+obj.distanceWords("ogeiD", "Diego") +"   (ogeiD, Diego)");
        System.out.println( "Words distance: "+obj.distanceWords("go", "Diego") +"  (go, Diego)");
        System.out.println("\n");
    }
    
}
