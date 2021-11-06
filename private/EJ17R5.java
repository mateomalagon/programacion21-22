public class EJ17R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/

    int n, total=0;
    
    System.out.print("Introduce un número: ");
      n = Integer.parseInt(System.console().readLine());
    
    if (n<0){
       System.out.println("No vale un número negativo");
    }else{
      for (int i=n; i<n+100; i++) {
      total=i+total;
    }
    System.out.println("La suma de los 100 siguientes números a "+n+" es "+total);
    } 
  }
} 
