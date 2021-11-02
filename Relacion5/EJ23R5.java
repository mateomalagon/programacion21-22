public class EJ23R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.*/
  
  int n=0;
  int total=0;
  int contador=0;
  
    System.out.println("Ve introdcuiendo números y pulsando INTRO.");
    
    do {
      n = Integer.parseInt(System.console().readLine());
      total += n;
      contador++;
      
    } while (total<=10000);
      
      System.out.println("Hay " +contador+" números.");
      System.out.println("Todos los números juntos suman "+total);
      System.out.println("La media de todos esos números es igual a " + (total/contador));
  }
} 
