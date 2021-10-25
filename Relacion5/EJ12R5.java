public class EJ12R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
introducir por teclado.*/

    int resultado = 1;
    int primero = 0;
    int segundo = 1;
    
    System.out.print("¿Cuántos términos de Fibonacci quieres que muestre?: ");
    int termino = Integer.parseInt(System.console().readLine());
    
    System.out.println(0);
    for (int i=1; i<termino; i++) {
      
      System.out.println(resultado);
      resultado = primero + segundo;
      primero = segundo;
      segundo = resultado;
    
    }
    
    
 }   
}
