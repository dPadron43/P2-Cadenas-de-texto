import java.util.*;
public abstract class test {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
	    String nombre;
	    String apellido1;
	    String apellido2;
	    String iniciales;
	    
	    System.out.println("Adelante por favor introduce tu nombre");
	    System.out.print("Nombre: ");
	    nombre = scanner.nextLine();
	    System.out.print("Primer apellido: ");
	    apellido1 = scanner.nextLine();
	    System.out.print("Segundo apellido: ");
	    apellido2 = scanner.nextLine();
	    
	    nombre = nombre.substring(0,1);
	    
	    System.out.println("Las iniciales son: "  + apellido1 +(" ") + apellido2 +(", ") + nombre + ("."));

		
		
		
	}

}
