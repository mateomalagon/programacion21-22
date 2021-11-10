public class EJ1R6 {
  public static void main(String[] args) {
/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/

  System.out.println("3 tiradas de un dado:");
  
  int total=0;
  
  for (int i = 1; i <= 3; i++) {
    int dado = (int)(Math.random()*6)+1;
    System.out.print(dado + " ");
   total=total+dado;
  }
   
  System.out.print("\nLa suma total de los 3 números es igual a "+total); 
  }
}
