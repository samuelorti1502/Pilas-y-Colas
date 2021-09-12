package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel David Ortiz
 */
public class ColaArreglo {

    Object cola[];
    int item = 0, max;
    private boolean limite = true;

    public ColaArreglo(int max){
        this.max = max;
        cola= new Object[max];
    }
    
    public void push(String n) {
        System.out.println(item);
        if (item < this.max) {
            System.out.println("Push... " + n);
            cola[item] = n;
            item++;
            setLimite(true);
        }else{
            //JOptionPane.showMessageDialog(null, "Excedio el limite de la cola");
            setLimite(false);
        }
    }

    public void pop() {
        if (item > 0) {
            System.out.println("Pop... " + cola[0]);
            cola[0] = null;
            for (int i = 1; i < item; i++) {
                cola[i - 1] = cola[i];
            }
            item--;
        } else {
            System.out.println("La cola se encuentra vacia");
        }
    }

    public String peek() {
        String p = "";

        if (cola[0] != null) {
            p += cola[0];
        } else {
            p = "La cola se encuentra vacia";
        }
        return p;
    }
    
    public int size(){
        return this.max;
    }

    public boolean isLimite() {
        return limite;
    }

    public void setLimite(boolean limite) {
        this.limite = limite;
    }

}
