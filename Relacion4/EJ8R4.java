import java.util.Scanner;
public class EJ8R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
/*Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).*/
  
  System.out.println("Introduce las tres notas:");
  double nota1 = s.nextDouble();
  double nota2 = s.nextDouble();
  double nota3 = s.nextDouble();
  
	double media = (nota1 + nota2 + nota3)/3.0;
  
  if ((media >= 0) && (media < 5)) {
    System.out.println("La nota media sale a un "+media+", insuficiente");
  } else {
  if ((media >= 5) && (media < 6)) {
    System.out.println("La nota media sale a un "+media+", suficiente");
  } else { 
  if ((media >= 6) && (media < 7)) {
    System.out.println("La nota media sale a un "+media+", bien");
  } else {  
  if ((media >= 7) && (media < 9)) {
    System.out.println("La nota media sale a un "+media+", notable");
  } else {
    System.out.println("La nota media sale a un "+media+", sobresaliente");
          } 
        }
      }
    }
  }
}

