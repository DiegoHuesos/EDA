/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author huesos
 */
public class NodeBT <T>{
    T element;
    NodeBT<T> izq, der;
    
    public NodeBT( T el ){
        element = el;
        izq=null;
        der=null;
    }
    
    public int numDescendientes(){
        int hijos = 0;
        if(izq != null)
            hijos += 1 + izq.numDescendientes();
        if(der != null)
            hijos += 1 + der.numDescendientes();
        return hijos;
    }
    
    public T getElement(){
        return this.element;
    }
    
    public NodeBT <T> getIzq(){
        return this.izq;
    }
    
    public NodeBT <T> getDer(){
        return this.der;
    }

}
