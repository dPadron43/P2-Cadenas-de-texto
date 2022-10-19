package test;
import java.util.*;
public class test {

	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
  
        lista.add(10);
        lista.add(15);
        lista.add(30);
        lista.add(20);
        lista.add(5);
  
        System.out.println("La lista es: \n"+ lista);
  
        Iterator<Integer> iter = lista.iterator();
 
        System.out.println("\nLos valores del iterador" + " de la lista  son: ");
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}