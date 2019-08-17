package DataEstructures.List;

public class List<T>{
    // Attributes:
    private Node<T> head;
    private Node<T> tail;
    private Node<T> current;
    private int cont;

    // Constructor:
    public List(){
        head = new Node<T>();
        tail = new Node<T>();
        current = null;
        cont = 0;
    }

    // Functions of the class:

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
    
    
    //(E) Elimina elemento RECURSIVO:
    public Node<T> eliminaElemento(T elemento){
        return eliminaElemento(elemento, head.getNext());
    }
    
    private Node<T> eliminaElemento(T elemento, Node<T> actual){
        if(actual == null || actual.getElement().equals(elemento) )
            return actual;
        else{
            Node <T> next = eliminaElemento(elemento, actual.getNext());
            if(next.getElement().equals(elemento)){
                System.out.println(actual);
                actual.setNext(next.getNext());   
            }
            return actual;
        }
                    
    }
    
    //(E) Invierte elemento RECURSIVO:
    public void invierte(){
        invierte(head.getNext());
    }
    private Node<T> invierte (Node <T> actual){
        if(actual == null || actual.getNext() == null){
            head.setNext(actual);
            return actual;
        }
        Node <T> elSig = invierte (actual.getNext());
        elSig.setNext(actual);
        actual.setNext(null);
        return actual;
    }
    
    //(E) a) Cuenta elementos RECURSIVO: (Diego HD)
    public int cuentaElementos(){
        return cuentaElementos(0, head);
    }
    
    private int cuentaElementos(int n, Node<T> nodo){
        if(nodo == null)
            return n;
        else{
            n = n + 1;
            nodo = nodo.getNext();
            return cuentaElementos(n, nodo);
        }
    }
    
    //(E) a) Cuenta elementos RECURSIVO: (Prof Esponda)
    public int cuentaEl(){
        return cuentaElementos(0, head);
    }
    
    private int cuentaEl(Node<T> nodo){
        if(nodo == null)
            return 0;
        return cuentaEl(nodo.getNext()) + 1 ; //Utiliza la pila interna
    }
    
    //Invert elements RECURSION: (Diego HD)
    public void invertElements(){  
        if( !this.isEmpty() )
            invertElements(head, 0);
    }
    
    private void invertElements(Node<T> b, int movesB){
        if(b.getNext() == null){
            //Invoke the function to actually swap the nodes:
            invertElements(head.getNext(),b,movesB);   
        }
        else //Look for the last node and count how many nodes:
            invertElements(b.getNext(), movesB+1);         
    }
    
    private void invertElements(Node<T> a, Node<T> b, int movesB){
        if(movesB <= 0){ 
            // Base case.
        }
        else{
            //Decrease movement:
            movesB = movesB - 2;
        
            //Swap:
            T aux = a.getElement();
            a.setElement(b.getElement());
            b.setElement(aux);
            //System.out.println("a: " + a.getElement() +"\tb: " + b.getElement());
            
            //New nodes positions:
            b = a;
            a = a.getNext();
            for(int i=0 ; i<movesB ; i++)
                b = b.getNext(); 
            
            //Invoke recursive function:
            invertElements(a, b, movesB);
        }          
    }

    
    //** Number of elements recursive **// (Bruno Vitte)
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

    //** Delete element recursive **//  (Bruno Vitte)
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
    

    // ! Minimal funcionality   (Bruno Vitte)
    public String toString(){
        String cad = " List: { "; 
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