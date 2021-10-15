import java.util.Scanner;
public class EJ9R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax^2 + bx + c = 0).*/

  
  System.out.println("Introduce las incógnitas A, B y C:");
  double a = s.nextDouble();
  double b = s.nextDouble();
  double c = s.nextDouble();
  double x = ((-c)/b);
  if (a == 0.0) {
    System.out.println("X es igual a "+x);
  } else {
	double x1 = ((-b) + Math.sqrt ((b*b)-(4*a*c)))/(2 *a);
  double x2 = ((-b) - Math.sqrt ((b*b)-(4*a*c)))/(2 *a);
  System.out.println("El primer resultado es "+ x1);
  System.out.println("Y el segundo "+ x2);
      
    }
  }
}
