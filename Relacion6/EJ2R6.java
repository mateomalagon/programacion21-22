public class EJ2R6 {
  public static void main(String[] args) {
/*Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n).*/
  
  String palo = "";
  String carta = "";

    int numeropalo = (int)(Math.random()*4) + 1;
     
    switch(numeropalo) {
    case 1:
      palo="diamantes";
      break;
      
    case 2:
      palo="picas";
      break;
      
    case 3:
      palo="tréboles";
      break;
      
    case 4:
      palo="corazones";
      break; 
      default:
    
    }
    
    int numerocarta = (int)(Math.random()*13) + 1; 
  
  switch(numerocarta) {
    
    case 11:
      carta="J";
      break;
      
    case 12:
      carta="K";
      break;
      
    case 13:
      carta="Q";
      break;
      
    case 1 :
      carta="As";
      break;
    default:
    carta = String.valueOf(numerocarta);
    }
    System.out.println("Te ha salido un "+carta + " de " + palo);
  }
}
