package EX_06;
import java.util.*;
public class test {

	public static void main(String[] args) {
        CambioConversion pCambio = new CambioConversion();
        Scanner sc = new Scanner(System.in);
        char caracter;        
       
            System.out.println("Escriba el carácter a pasar a Ascii: ");
            caracter = sc.next().charAt(0);
            pCambio.aAscii(caracter);
            System.out.println("ASCII: " + caracter + " es equivalente a: " + pCambio.getAscii());
            
        }
    }
    


class CambioConversion{
    private int cambio;
    private char caracter;
    
    public void aAscii(char caracter) {
            cambio = (int)caracter;
    }
    
    public void aCaracter(int numero) {
        caracter = (char)numero;
    }
    
    public int getAscii(){
        return cambio;
    }
    public char getCaracter() {
        return caracter;
    }

}
