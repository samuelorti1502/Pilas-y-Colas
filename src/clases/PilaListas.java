package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel David Ortiz
 */
public class PilaListas {

    private ArrayList<Object> pila;
    
    public PilaListas(){
        pila = new ArrayList<Object>();
    }

    public void push(Object dato) {
        //System.out.println(dato);
        pila.add(dato);
    }

    public Object pop() {
        if (isEmpty()) {
            //throw new IllegalStateException("Pila vacia");
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return pila.remove(pila.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) {
            //throw new IllegalStateException("Pila vacia");
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return pila.get(pila.size() - 1);
    }

    public boolean isEmpty() {
        return pila.size() == 0;
    }
    
    public int size(){
        return pila.size();
    }

}
