public class EJ13R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/

    int resultado = 0;
    int numero = 0;
    
    for (int i=0; i<10; i++) {
      System.out.print("Introduce el "+(i+1)+"º número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero<0) {
        System.out.println("Números negativo");
        System.out.println(" ");
      }else {
        System.out.println("Número positivo");
        System.out.println(" ");
      }
    }
    
 }
} 
