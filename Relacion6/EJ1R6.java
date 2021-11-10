public class EJ1R6 {
  public static void main(String[] args) {
/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

  System.out.println("3 tiradas de un dado:");

  for (int i = 1; i <= 3; i++) {
    System.out.print((int)(Math.random()*6)+1 + " ");
  }
    
  }
}
