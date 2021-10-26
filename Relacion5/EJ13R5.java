public class EJ13R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/

    int numero = 0;
    int positivo= 0;
    int negativo = 0;
    for (int i=0; i<10; i++) {
      System.out.print("Introduce el "+(i+1)+"º número: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero>=0) {
        positivo++;
      }
       if (numero<0) {
        negativo++;
      } 
      
    }
    System.out.println("Hay "+positivo+" números positivos y "+negativo+" negativos");
 }
} 
