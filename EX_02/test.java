import java.util.*;
public class test {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text1, text2;   
		
		System.out.println("Introduce la primera cadena: ");
		text1 = sc.next();
		
		System.out.println("Introduce la segunda cadena: ");
		text2 = sc.next();

		for(int i=0; i<palabra(text1, text2); i++){
			
		if(i<text1.length()) {
			System.out.print(text1.charAt(i));
			}
		
		if (i< text2.length()) {
			System.out.print(text2.charAt(i));
			}
			
		}	
		
	}
		
		public static int palabra(String text1, String text2) {
			int longitud;
			if(text1.length()>text2.length()) {
				longitud = text1.length();
			}else {
				longitud = text2.length();
			}
			
			return longitud;
			
		}

}
