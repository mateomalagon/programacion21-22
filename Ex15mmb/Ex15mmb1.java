import java.util.Scanner;
public class Ex15mmb1 {
  public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     
  //Mateo Malagón Beltrán a 8 de noviembre de 2021
  /*Este programa calcula el número de vueltas que ha dado la tierra sobre sí misma
   * durante los años que el usuario introduzca */
   
  long years=0;
  long vueltas;
  
    System.out.print("Introduzca el número de años: ");
    years = Long.parseLong(System.console().readLine());
   
    vueltas=years*365;
    
    System.out.print("En ese tiempo, la Tierra ha dado "+vueltas+" vueltas sobre sí misma.");
  
    
  }
}
