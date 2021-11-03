public class EJ28R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que calcule el factorial de un número entero leído por
teclado.*/

    int n;
    int total=1;
    
    System.out.print("Introduce un número entero: ");
      n = Integer.parseInt(System.console().readLine());
    

     for (int i=1; i<=n; i++) {
        total=total*i;
      }
      System.out.println("El factorial de "+n+" es "+n+"!="+total);
  }
} 
