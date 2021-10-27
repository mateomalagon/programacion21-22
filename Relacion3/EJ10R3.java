import java.util.Scanner;

public class EJ10R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
/*Realiza un conversor de Mb a Kb.*/
 
int mb, kb;

System.out.println("Megabits a convertir: ");
mb = x.nextInt();
kb = mb*1024;
System.out.println( mb +" Megabits son "+ kb +" Kilobits.");

  }
}

