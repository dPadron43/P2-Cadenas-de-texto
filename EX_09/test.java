package test;
import java.util.*;
public class test {

	public static void main(String[] args) {
		
			
		 List<Integer> tr = new ArrayList<Integer>();
	        tr.add(10);
	        tr.add(20);
	        tr.add(30);
	        tr.add(40);
	  
	        Object[] objetos = tr.toArray();
	  
	        for (Object obj : objetos)
	            System.out.print(obj + " ");
		
	}

}
