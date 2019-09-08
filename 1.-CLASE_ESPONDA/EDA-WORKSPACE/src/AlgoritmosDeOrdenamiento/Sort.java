
package AlgoritmosDeOrdenamiento;

import java.util.List;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.T;


public class Sort {
    
    
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
    
    //Para que un hacker no abuse de mi método 
    //hay que agarrar un número aleatorio
    //O(n^2)
    public void quickSort(int [] arr){
        quickSort(arr, 0, arr.length-1);
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
            
            do{
                j--;
            }while(arr[j] > pivot);
            
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
      
    //MergeSort Recursivo
    //O(n)
    public void mergeSort(T [] arr, int mi){
        mergeSort(arr, arr);
    }
    
    private void mergeSort(List arr){
        if(arr.size() == 0 || arr.size() == 1){
            return;
        }else{
            //Divido
            List izq =   arr.subList(0, arr.size()/2 );   
            List der =  arr.subList(arr.size()/2 , arr.size() );
            //Llamada recursiva a cada mitad:
            mergeSort(izq);
            mergeSort(der);
            //Mezcla los dos arreglos en uno:
            mergeList(izq, der);
        }
    }
    public void mergeMicha(String arr, int mitad, int fin){
        String aux = arr.substring(mitad+1, fin);
        int i;
        int iSup= mitad+1;
        int jInf= 0;
        while(jInf<mitad+1 || iSup<fin){
            if( arr.charAt(jInf) < aux.charAt(iSup) ){
                arr.replace();
            }
        }
    }
    //MergeSort Mixcoac-Profe
    //O(n)
    public void mergeSortA(int [] arr){
        if(arr == null || arr.length == 0 || arr.length == 1)
            return;

        int pot=0;
        int inc= (int) Math.pow(2, pot);
        int i=0, fi=0;
        int j=1, fj=1;
        
        while(inc <= arr.length/2){
            while(  fj <= arr.length){
                //merge(i,fi, j, fj);

                i += inc*2;
                fi += inc*2;
                j += inc*2;
                fj += inc*2;
            }
            inc = (int) Math.pow(2, pot+1);
            i=0;
            fi+= inc;
            j=fi+1;
            fj+=4;
        }
        
    }
    
    public void mergeInd(int [] arr, int i, int fi, int j, int fj){
        while(i<fi || j<fj){
            if(arr[i] < arr[j]){
                i++;
            }else{
                
            }
           
        }
    }
    public ArrayList<Integer> mergeList(List<Integer> a, List<Integer> b){
        ArrayList <Integer> list = new ArrayList();
        while( a.size() > 0 && b.size() > 0 ){
            if(a.get(0) < b.get(0)){
                list.add(a.get(0));
                a.remove(0);
            }
            else{
                list.add(b.get(0));
                b.remove(0);
            }
        }
        
        list.addAll(a);
        list.addAll(b);
        return list;
    }
    
    
    public String print(int [] a){
        String str = "";
        for(int i=0; i<a.length; i++)
            str+=a[i]+" ";
        return str;
    }
    
    
    
    
    public static void main (String [] args){
        int [] a = {4,9, 7, 3, 1, 2, 10, 0};
        
        Sort s = new Sort( );
        /*
        System.out.println(s.print(a));
        //s.bubbleSortDiegoOptimizado(a);
        //System.out.println(s.print(a));
        s.quickSort(a);
        System.out.println(s.print(a));
        */
        
        ArrayList<Integer> l1 = new ArrayList();
        l1.add(1); 
        l1.add(3); 
        l1.add(2); 
        l1.add(50); 
        l1.add(22); 
        l1.add(9); 
        l1.add(5); 
        l1.add(4); 
        System.out.println(l1.toString());
        
        s.mergeSort(l1);
    }
}
