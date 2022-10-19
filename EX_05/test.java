import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una contraseña: ");
		String passwd = sc.next();
		boolean mayusc= false;
		boolean minusc = false;
		boolean num = false;
		boolean simbolo = false;
		boolean fuerte = false;
		
		if(passwd.length()>8) {
		for(int i = 0; i<passwd.length(); i++) {
			char p = passwd.charAt(i);
			if(Character.isUpperCase(p)) {
				mayusc = true;
			}else if(Character.isLowerCase(p)) {
				minusc = true;
			}else if(Character.isDigit(p)) {
				num = true;
			}else {
				simbolo = true;
			}
		}
	}
		if(mayusc && minusc && num && simbolo) {
			fuerte = true;
		}
		if(fuerte) {
			System.out.println("La contraseña es fuerte");
		}else {
			System.out.println("La contraseña no es fuerte");
		}
		
		
		
		
		
		
		
	}

}
