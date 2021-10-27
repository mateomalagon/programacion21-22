import java.util.Scanner;

public class EJ9R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Escribe un programa que calcule el volumen de un cono según la fórmula 
  V =(1/3)*π*r'2*h */
 
double radio, altura, volumen;

System.out.println("Radio de la base del cono en centímetros: ");
radio = x.nextDouble();
System.out.println("Altura del cono también en centímetros: ");
altura = x.nextDouble();
volumen = (1.0/3) * 3.14 * radio * radio * altura;
System.out.println("El volumen del cono es de "+volumen+" centímetros cúbicos.");

  }
}
