import java.util.Scanner;

public class EJ4R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado.
*/

float numero1;
float numero2;
System.out.print("Dame un número: ");
numero1 = x.nextFloat();
System.out.print("Dame otro número: ");
numero2 = x.nextFloat();
System.out.println("El resultado de la suma es: "+ (numero1+numero2));
System.out.println("El de la resta es: "+ (numero1-numero2));
System.out.println("El de la multiplicación es: "+ (numero1*numero2));
System.out.println("Y el de la división es: "+ (numero1/numero2));
	}
}
