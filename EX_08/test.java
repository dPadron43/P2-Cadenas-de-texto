package test;
import java.util.*;
public class test {

	public static void main(String[] args) {
		 List<Integer> numeros = new ArrayList<>();
	        numeros.add(1);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(4);
	        numeros.add(5);
	        
	        
	        System.out.println("Iteración con expresión lambda:");
	        numeros.stream().forEach(System.out::println);
	        
	     
	}

}
