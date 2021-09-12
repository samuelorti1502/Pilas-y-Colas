package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Samuel David Ortiz
 */
public class PilaArreglo2 {

    Object cola[];
    int item = 0, max;
    private boolean limite = true;

    public PilaArreglo2(int max){
        this.max = max;
        cola= new Object[max];
    }
    
    public void push(String n) {
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
            System.out.println("Pop... " + cola[max-1]);
            cola[max-1] = null;
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

        if (cola[max-1] != null) {
            p += cola[max-1];
        } else {
            p = "La cola se encuentra vacia";
        }
        return p;
    }
    
    public int size(){
        return this.max-1;
    }

    public boolean isLimite() {
        return limite;
    }

    public void setLimite(boolean limite) {
        this.limite = limite;
    }

}
