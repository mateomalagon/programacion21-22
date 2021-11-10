public class EJ3R6 {
  public static void main(String[] args) {
/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/
  
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
    System.out.println(carta + " de " + palo);
  }
}
