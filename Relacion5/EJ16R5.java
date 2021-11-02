public class EJ16R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.*/

    int numero = 0;
    
    System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      
    boolean primo = true;
    for (int i=2; i<numero; i++) {
     if((numero%i) ==0) {
      primo=false;
      }
    }
    if (primo) {
    System.out.println("Es un número primo");
    }else{
    System.out.println("No es un número primo");
    }
 }
} 
