import java.util.Scanner;

public class EJ5R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
//Escribe un programa que calcule el área de un rectángulo.


float lado1;
float lado2;
System.out.print("Dame un lado en centímetros: ");
lado1 = x.nextFloat();
System.out.print("Dame el otro lado: ");
lado2 = x.nextFloat();
System.out.println("El área resultante son "+ (lado1*lado2) +" centímetros cuadrados.");
	}
}
