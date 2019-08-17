package List;

public class List<T>{
    // ! Attributes
    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;
    private int cont;

    // ! Constructor
    public List(){
        head = new Node<T>();
        tail = new Node<T>();
        current = null;
        cont = 0;
    }

    // ! Functions of the class
    //** Return if the list is empty **//
    public boolean isEmpty(){
        return head.getNext() == null;
    }
    //** Return the number of elements **//
    public int size(){
        return cont;
    }
    //** Add a new element **//
    public void add(T element){
        Node<T> aux = new Node<T>(element);
        if(isEmpty()){
            head.setNext(aux);
            current = head.getNext();
            tail.setPrevius(current);
        } else {
            current.setNext(aux);
            current = current.getNext();
            tail.setPrevius(current);
        }
        cont++;
    }
    
    // ? Classroom Excercises
    //** Invert list using recursivity and changing links **//
    public void invRvLink(){
        if(!isEmpty()){
            invRvLink(head.getNext());
        }
    }
    private void invRvLink(Node<T> n){
        if(n.getNext() == null){
            head.setNext(n);
        } else {
            invRvLink(n.getNext());
            n.getNext().setNext(n);
            n.setNext(null);
        }
        //System.out.println(n.toString());
    }

    //** Invert list using recursivity and changing elements **//
    public void invRvElement(){
        if(!isEmpty()){
            invRvElement(head.getNext());
        }
    }
    private void invRvElement(Node<T> n){
        T element = n.getElement();
        if(n.getNext() == null){
            current = head.getNext();
            current.setElement(element);
            current = current.getNext();
        } else {
            invRvElement(n.getNext());
            current.setElement(element);
            current = current.getNext();
        }
    }

    //** Number of elements recursive **//
    public int sizeRv(){
        int i = 0;
        if(!isEmpty()){
            i = sizeRv(head.getNext(), ++i);
        }
        return i;
    }
    private int sizeRv(Node<T> n, int j){
        if(n.getNext() == null){
            return j;
        }else{
            return sizeRv(n.getNext(), ++j);
        }
    }

    //** Delete element recursive **//
    public boolean deleteElementRv(T dato){
        boolean res = false;
        if(!isEmpty()){
            res = deleteElementRv(head, dato, res);
        }
        return res;
    }
    private boolean deleteElementRv(Node<T> n, T dato, boolean res){
        if(n.getNext() == null)
            return res;
        else{
            if(n.getNext().getElement().equals(dato)){
                n.setNext(n.getNext().getNext());
                return true;
            }else{
                return deleteElementRv(n.getNext(), dato, res);
            }
        }
    }
    

    // ! Minimal funcionality
    public String toString(){
        String cad = "{ List: "; 
        if(isEmpty()){
            cad += "EMPTY ";
        } else {
            Node<T> aux = head.getNext();
            //int i = 0;
            while(aux != null){
                //System.out.println(i);
                cad += aux.toString() + ", ";
                aux = aux.getNext();
                //i++;
            }
        }
        cad += "}";
        return cad;
    }
}