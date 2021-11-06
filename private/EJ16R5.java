public class EJ16R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

    int n;
    boolean esPrimo = true;
    
    System.out.print("Introduce un número: ");
      n = Integer.parseInt(System.console().readLine());
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("Es un número primo.");
    } else {
      System.out.println("No es un número primo.");
    }
  }
} 
