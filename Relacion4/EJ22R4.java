import java.util.Scanner;

public class EJ22R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
  
/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.*/

int minutosf;

  System.out.println("Introduce el día:");
    String dia = System.console().readLine();
  System.out.println("Introduce la hora:");
    int hora = s.nextInt();
  System.out.println("Introduce minutos:");
    int minuto = s.nextInt();

if (dia.equals("lunes")) {
  minutosf = ((3*24 + 15)*60)+(1440-(( hora *60)+ minuto ));
  System.out.println("Quedan "+ minutosf +" minutos para que comience el finde.");
}
if (dia.equals("martes")) {
  minutosf = ((2*24 + 15)*60)+(1440-(( hora *60)+ minuto ));
  System.out.println("Quedan "+ minutosf +" minutos para que comience el finde.");
}
if (dia.equals("miercoles")) {
  minutosf = ((24 + 15)*60)+(1440-(( hora *60)+ minuto ));
  System.out.println("Quedan "+ minutosf +" minutos para que comience el finde.");
}
if (dia.equals("jueves")) {
  minutosf = ((15)*60)+(1440-(( hora *60)+ minuto ));
  System.out.println("Quedan "+ minutosf +" minutos para que comience el finde.");
}
if (dia.equals("viernes")) {
  minutosf = (900-(( hora *60)+ minuto ));
  System.out.println("Quedan "+ minutosf +" minutos para que comience el finde.");
}
    }
  }
