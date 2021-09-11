package clases;

/**
 *
 * @author Samuel David Ortiz
 */
public class PilaArreglo2 {
    private int item = 0, max;
    Object pila[];
    
    public PilaArreglo2(int max){
        this.max = max;
        pila = new Object[max];
    }
    
    public void push(String dato){
        if(item < this.max){
            pila[item] = dato;
            item++;
            System.out.println("Dato " + dato + "Item " + item);
        }
    }
    
    public String peek(){
        String ultimo = "";
        if(item > 0){
            ultimo = "Ultimo " + pila[item-1];
        }else{
            ultimo = ("No hay elementos en la pila");
        }
        return ultimo;
    }
    
    public void pop(){
        if(item > 0){
            for (int i = 0; i > pila.length; i++) {
                pila[i-1] = pila[i];
            }
            item++;
        }
    }
    
}
