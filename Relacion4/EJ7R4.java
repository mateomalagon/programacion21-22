import java.util.Scanner;
public class EJ7R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
//Realiza un programa que calcule la media de tres notas.

  
  System.out.println("Introduce las tres notas:");
  double nota1 = s.nextDouble();
  double nota2 = s.nextDouble();
  double nota3 = s.nextDouble();
  
	double media = (nota1 + nota2 + nota3)/3.0;
  System.out.println("La nota media sale a un "+ media);
  }
}

