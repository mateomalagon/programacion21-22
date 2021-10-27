import java.util.Scanner;

public class EJ7R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Escribe un programa que calcule el total de una factura a partir de la base
imponible.
*/

float precio;

System.out.print("Total de los artículos sin IVA: ");
precio = x.nextFloat();
System.out.printf("Base Imponible: %-8.2f\n",precio);
  System.out.printf("IVA que se le suma: %-8.2f\n",(precio * 0.21));
  System.out.println("--------------------------");
  System.out.printf("Total ************ %-8.2f\n",(precio * 1.21));
	}
}
