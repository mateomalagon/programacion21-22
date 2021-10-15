import java.util.Scanner;

public class EJ21R4 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media.  En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior.*/

double nota1 , nota2, notaf;


System.out.println("Introduce la nota del primer examen: ");
nota1 = x.nextDouble();
System.out.println("Introduce la nota del segundo examen: ");
nota2 = x.nextDouble();

notaf = (nota1 + nota2)/2;

if (notaf<5) {
  System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
  String aptitud = System.console().readLine();
if (aptitud.equals("apto")) {
  System.out.println("Tu nota de Programación es un 5");
  } else {
  System.out.println("Tu nota de Programación es un "+ notaf);
  }
}
if (notaf>=5) {
  System.out.println("Tu nota de Programación es un "+ notaf);
}
  }
}
