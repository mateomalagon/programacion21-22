import java.util.Scanner;
public class EJ11R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
/*Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.*/

  System.out.println("Introduce la hora y los minutos actuales (separados por espacio):");
  int hora = s.nextInt();
  int minuto = s.nextInt();
  
  int dia = hora*3600 + minuto*60;
  int queda = 86400 - dia;
  
  System.out.println("Quedan "+queda+" segundos para la próxima medianoche.");

      
    }
  }

