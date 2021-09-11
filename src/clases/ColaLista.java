package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel David Ortiz
 */
public class ColaLista {
    private ArrayList<Object> cola;
    
    public ColaLista(){
        cola = new ArrayList<Object>();
    }

    public void push(Object dato) {
        //System.out.println(dato);
        cola.add(dato);
    }

    public Object pop() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cola vacia");
        }
        return cola.remove(cola.size() - cola.size());
    }

    public Object peek() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cola vacia");
        }
        return cola.get(cola.size() - cola.size());
    }

    public boolean isEmpty() {
        return cola.size() == 0;
    }
    
    public int size(){
        return cola.size();
    }
}
