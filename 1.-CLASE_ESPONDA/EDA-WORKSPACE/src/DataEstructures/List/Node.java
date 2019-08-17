package DataEstructures.List; 

public class Node<T>{
    // ! Attributes
    private T element;
    private Node<T> next;
    private Node<T> previus;

    // ! Constructor
    public Node(){
        element = null;
        next = null;
        previus = null;
    }

    public Node(T element){
        super();
        this.element = element;
    }

    // ! Functions of the class
    //** Get element **//
    public T getElement(){
        return this.element;
    }
    //** Set element **//
    public void setElement(T element){
        this.element = element;
    }
    //** Get Next **//
    public Node<T> getNext(){
        return this.next;
    }
    //** Set Next **//
    public void setNext(Node<T> next){
        this.next = next;
    }
    //** Get Previus **//
    public Node<T> getPrevius(){
        return this.previus;
    }
    //** Set Previus **//
    public void setPrevius(Node<T> previus){
        this.previus = previus;
    }

    // ! Minimal functionality
    public String toString(){
        return element.toString();
    }
}