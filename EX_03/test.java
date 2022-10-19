import java.util.*;
public class test {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String frase;
		char letra;
		
		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();
		
		System.out.println("Que letra quieres saber su posicion?");
		letra = sc.next().charAt(0);
		
		for(int i=0;i<frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				System.out.println("la posicion de la letra es: " + i);
			}
		}
		
		
		
	
	
	}

}
