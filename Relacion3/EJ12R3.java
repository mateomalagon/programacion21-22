import java.util.Scanner;

public class EJ12R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.*/
 
double nota1 , nota2, notaf;

System.out.println("Introduce la nota del primer examen: ");
nota1 = x.nextDouble();
System.out.println("¿Qué nota quieres sacar en el trimestre? ");
notaf = x.nextDouble();
nota2 = (notaf-nota1*0.4)/(0.6);
System.out.println("Para sacar un "+notaf+ " tendrás que sacara un "+nota2+" en el siguiente examen. ");

  }
}

