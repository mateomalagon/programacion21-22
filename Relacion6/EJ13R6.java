public class EJ13R6 {
  public static void main(String[] args) {
/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/

  
    int dado1 = (int)(Math.random()*6) + 1 ;
    int dado2 = (int)(Math.random()*6) + 1 ;
  System.out.println("El programa parará cuando los dos dados saquen el mismo número");
  System.out.println("--------------------------------------------------------------");
  do{
     dado1 = (int)(Math.random()*6) + 1 ;
     dado2 = (int)(Math.random()*6) + 1 ;
    
    System.out.println("Dado 1: "+dado1);
    System.out.println("Dado 2: "+dado2);
  System.out.println("---------");
    
    }while (dado1!=dado2);
    
  }
}
