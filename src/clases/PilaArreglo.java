package clases;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel David Ortiz
 */
public class PilaArreglo {
    
    Stack<Object> pila = new Stack<>();

    public PilaArreglo() {
        pila = new Stack<>();
    }

    public void push(Object dato) {
        pila.push(dato);
    }

    public Object pop() {
        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return pila.pop();
    }

    public Object peek1() {
        if (pila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pila vacia");
        }
        return pila.peek();
    }
    public int size(){
        return pila.size();
    }
    

}
