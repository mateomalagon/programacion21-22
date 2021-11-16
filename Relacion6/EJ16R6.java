public class EJ16R6 {
  public static void main(String[] args) {
/*Realiza un simulador de máquina tragaperras simplificada que cumpla los
siguientes requisitos:

a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
figuras posibles: corazón, diamante, herradura, campana y limón.

b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha
perdido”.

c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
ha recuperado su moneda”.

d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
10 monedas”.

Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda

Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido

Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas*/

  String figura = "";
  String primeraNota = "";
  
  for(int i=1; i<=3; i++){
    switch((int)(Math.random()*4)) {
    case 0:
      figura="corazón";
      break;
      
    case 1:
      figura="diamante";
      break;
      
    case 2:
      figura="herradura";
      break;
      
    case 3:
      figura="campana";
      break;
      
    case 4:
      figura="limón";
      break;
      default:
    }
    
    
    System.out.print(figura + " ");

    

    }
  }
}
