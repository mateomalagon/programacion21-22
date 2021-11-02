public class EJ18R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que obtenga los números enteros comprendidos entre dos
números introducidos por teclado y validados como distintos, el programa debe
empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.*/

    int n1, n2;
    
    System.out.print("Introduce un número: ");
      n1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número: ");
      n2 = Integer.parseInt(System.console().readLine());
    
      for (int i=n1; i<=n2; i+=7) {
        System.out.println(i);
      }
    
  }
} 
