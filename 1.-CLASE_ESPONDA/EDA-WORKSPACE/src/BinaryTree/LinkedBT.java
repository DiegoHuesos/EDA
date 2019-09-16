package BinaryTree;

import java.util.ArrayList;
import java.util.Iterator;

class LinkedBT <T> implements BinaryTreeADT <T>{
    NodeBT<T> root;
    

    @Override
    public boolean isEmpty() {
        if(root.getElement() == null)
            return true;
        else
           return false;
    }

    @Override
    public boolean contains(T dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T find(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //PREORDEN
    @Override
    public Iterator<T> preorden() {
      ArrayList<T> list  = new ArrayList<T>();
      preorden(root, list);
      return list.iterator();
    }
    
    private void preorden (NodeBT<T> actual, ArrayList<T> list) {
        if(actual == null)
            return;
        list.add(actual.getElement());
        preorden(actual.getIzq(), list);
        preorden(actual.getDer(), list);   
    }
    
    //INORDEN
    @Override
    public Iterator<T> inorden() {
      ArrayList<T> list  = new ArrayList<T>();
      inorden(root, list);
      return list.iterator();
    }
    
    private void inorden (NodeBT<T> actual, ArrayList<T> list) {
        if(actual == null)
            return;
        inorden(actual.getIzq(), list);
        list.add(actual.getElement());
        inorden(actual.getDer(), list);   
    }

    //POSTORDEN
    @Override
    public Iterator<T> postorden() {
      ArrayList<T> list  = new ArrayList<T>();
      postorden(root, list);
      return list.iterator();
    }
    
    private void postorden (NodeBT<T> actual, ArrayList<T> list) {
        if(actual == null)
            return;
        postorden(actual.getIzq(), list);
        postorden(actual.getDer(), list); 
        list.add(actual.getElement());
    }
    
    
    
    //Compañero
    public int altura(NodeBT<T> actual){
        NodeBT izq = actual.getIzq();
        NodeBT der = actual.getDer();
        if(izq==null || der==null){
            if(izq==null)
                return 1+altura(der);
            if(der==null)
                return 1+altura(izq);
            return 1;
        }
        return Math.max(altura(izq), altura(der));
    }
    
    //Esponda
    public int alturaEsponda(NodeBT<T>actual) {
        if(actual == null)
            return 0;
        return 1+ Math.max( alturaEsponda(actual.getIzq()),  alturaEsponda(actual.getIzq()));
    }
    
    //Diego //Hay que checarlo:
    public int largo(){
        int a = 0;
        int max=0;
        largo(root, a, max);
        return max;
    }
    private void largo(NodeBT<T> actual, int a, int max){
        
        NodeBT<T> izq = actual.getIzq() ;
        if( izq != null){
            a++;
            largo(actual, a, max);
        }
        else
            if(a > max)
                max = a;

        NodeBT<T> der = actual.getIzq() ;
        if(der != null){
            a++;
            largo(actual, a, max);
        }
        else
            if(a > max)
                max = a;
    }
    
}
