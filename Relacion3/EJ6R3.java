import java.util.Scanner;

public class EJ6R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Escribe un programa que calcule el área de un triángulo.
*/


float base;
float altura;
System.out.print("Dame la base en centímetros: ");
base = x.nextFloat();
System.out.print("Dame la altura: ");
altura = x.nextFloat();
System.out.println("El área resultante son "+ ((base*altura)/2) +" centímetros cuadrados.");
	}
}
