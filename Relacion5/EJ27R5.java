public class EJ27R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
entre 1 y un número leído por teclado.*/

    int n;
    int contador=0;
    int total=0;
    System.out.print("Introduce el número hasta que quieres contar: ");
      n = Integer.parseInt(System.console().readLine());
    

     for (int i=1; i<=n; i++) {
        if ((i%3)==0){
        System.out.print(i+", ");
        contador++;
        total+=i;
        }
      }
      System.out.println("\nHay "+contador+" múltiplos de 3 hasta el "+n);
      System.out.print("Entre ellos suman "+total);
  }
} 
