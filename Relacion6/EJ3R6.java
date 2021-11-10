public class EJ3R6 {
  public static void main(String[] args) {
/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).*/

  System.out.println("Muestra una carta al azar:");
  int numerocarta = (int)(Math.random()*10) + 1; 
  
  switch(numerocarta) {
    case 2:
      System.out.print("2 de ");
      break;
      
    case 3:
      System.out.print("3 de ");
      break;
      
    case 4:
      System.out.print("4 de ");
      break;
      
    case 5:
      System.out.print("5 de ");
      break;
      
    case 6:
      System.out.print("6 de ");
      break;
      
    case 7:
      System.out.print("7 de ");
      break;
      
    case 10:
      System.out.print("Sota de ");
      break;
    
    case 11:
      System.out.print("Caballo de ");
      break;
      
    case 12:
      System.out.print("Rey de ");
      break;
      
    case 1 :
      System.out.print("As de ");
      break;
    default:
    
    }
    int palo = (int)(Math.random()*4) + 1;
     
    switch(palo) {
    case 1:
      System.out.println("diamantes.");
      break;
      
    case 2:
      System.out.println("picas.");
      break;
      
    case 3:
      System.out.println("tréboles.");
      break;
      
    case 4:
      System.out.println("corazones.");
      break; 
      default:
    
    }
    
  }
}
