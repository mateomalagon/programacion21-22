import java.util.Scanner;

public class EJ11R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Realiza un conversor de Kb a Mb.*/
 
int kb;
double mb;
System.out.println("Kilobits a convertir: ");
kb = x.nextInt();
mb = kb*0.001;
System.out.println( kb +" Kilobits son "+ mb +" Megabits.");

  }
}
