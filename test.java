import java.util.List;
import java.util.ArrayList;
public class test{
    public static void main(String[] args) {
    // Declaración de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
ArrayList<String>      AL = new ArrayList<String>();
// Añade el elemento al ArrayList
     AL.add("Elemento");
// Añade el elemento al ArrayList en la posición 'n'
     AL.add(n, "Elemento 2");
// Devuelve el numero de elementos del ArrayList
     AL.size();
// Devuelve el elemento que esta en la posición '2' del ArrayList
     AL.get(2);
// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
     AL.contains("Elemento");
// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
     AL.indexOf("Elemento");
// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
     AL.lastIndexOf("Elemento");
// Borra el elemento de la posición '5' del ArrayList   
     AL.remove(5); 
// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
     AL.remove("Elemento");
//Borra todos los elementos de ArrayList   
     AL.clear();
// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
     AL.isEmpty();  
// Copiar un ArrayList 
ArrayList arrayListCopia = (ArrayList)      AL.clone();  
// Pasa el ArrayList a un Array 
Object[] array =      AL.toArray();  
    }
}