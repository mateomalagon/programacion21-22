public class EJ22R5 {
  public static void main (String[] args) {
    
//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

    boolean esPrimo = true;

 System.out.println("Números primos hasta el 100:");
    
    for (int n = 2; n <=100; n++) {
      esPrimo = true;
      
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
        esPrimo = false;
        }
      }     
      if (esPrimo) {
        System.out.println(n);
      }
    }
  }
} 
