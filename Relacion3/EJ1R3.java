import java.util.Scanner;

public class EJ1R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación.*/

float numero1;
float numero2;
System.out.print("Dame un número: ");
numero1 = x.nextFloat();
System.out.print("Dame otro número: ");
numero2 = x.nextFloat();
System.out.printf("El resultado es: "+ (numero1*numero2));
	}
}
