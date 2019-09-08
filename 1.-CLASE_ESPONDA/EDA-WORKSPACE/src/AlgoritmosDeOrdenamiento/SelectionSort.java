/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDeOrdenamiento;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author huesos
 */
public class SelectionSort {
    
    
    public void selectionSort ( int [] arr ){
        int min, aux, pos;
        for(int i=0; i<arr.length; i++){
            min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min])
                    min= j;
            }
            aux = arr[i];
            arr[i] = arr[min];
            arr[min] = aux;
        }
    }
    
    public void insertionSort ( int [] arr ){
        for(int i=0; i<arr.length-1; i++){
            int rec = i;
            int pos = i+1;
            int obj;
            while( rec>=0 && arr[rec] > arr[pos]){
                obj= arr[rec];
                arr[rec] = arr[pos];
                arr[pos] =obj;
                rec--;
                pos--;
            }
        }
    }
    
    public void bubbleSortClasico ( int [] arr ){
        int aux;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if( arr[j] > arr[j+1]){
                    aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        
    }
    
    public void bubbleSortDiego ( int [] arr ){
        int aux;
        boolean flag = false;
        
        while(!flag){
            flag=true;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    flag = false;
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }     
        }
        
    }
    
    
    
    public void bubbleSortDiegoOptimizado ( int [] arr ){
        int aux;
        int j=1;
        boolean flag = false;
        
        while(!flag && j>=0){
            flag=true;
            for(int i=0; i<arr.length-j; i++){
                if(arr[i+1] < arr[i]){
                    flag = false;
                    aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
            j++;
        }       
    }
    

    public void quickSort(int [] arr){
        quickSort(arr, 0, arr.length);
    }
    
    private void quickSort(int [] arr, int low, int high){
        if(low < high){
            int posPivot=partition(low, high, arr);
            quickSort(arr, low, posPivot);
            quickSort(arr, posPivot+1, high);
        }
    }
    
    public int partition (int low, int high, int [] arr){
        int pivot = arr[low];
        int i=low, j=high;
        
        while( i < j ){
            do{
                i++;
            }while(arr[i] <= pivot);
            
            do
                j--;
            while(arr[j] > pivot);
                
            
            
            if(i<j)
                swap(arr, i, j);
        }
        swap(arr, low, j);
        
        return j;
    }
    
    private void swap(int [] arr, int a, int b){
        int aux = arr[a];
        arr[a] = arr[b];
        arr[b] = aux;
    }
      
    
    public String print(int [] a){
        String str = "";
        for(int i=0; i<a.length; i++)
            str+=a[i]+" ";
        return str;
    }
    
    public static void main (String [] args){
        int [] a = {4,9, 7, 3, 1, 2, 10, 0};
        
        SelectionSort s = new SelectionSort( );
        
        System.out.println(s.print(a));
        //s.bubbleSortDiegoOptimizado(a);
        //System.out.println(s.print(a));
        
        System.out.println(s.print(a));
        
    }
}
