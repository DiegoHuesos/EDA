package BinaryTree;

import java.util.Iterator;


public interface BinaryTreeADT <T> {
    public boolean isEmpty();
    public boolean contains(T dato);
    public int size();
    public T find (T elemento);
    public Iterator <T> inorden();
    public Iterator <T> postorden();
    public Iterator <T> preorden();
    
}
