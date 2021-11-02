public class EJ19R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

    int n=0;
    System.out.println("Ve introduciendo números y pulsando intro.\n Para terminar introduce un número negativo.");
          n = Integer.parseInt(System.console().readLine());
      do {
        n++;
      } while (n >= 0);
      
    System.out.println("Hay "+n+" números");
  }
} 
