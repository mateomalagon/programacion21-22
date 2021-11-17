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
  int tirada1= 0;
  int tirada2= 0;
  int tirada3= 0;
  
  System.out.println("┌─────────────────────────────────────┐");
  System.out.println("│ BIENVENIDO A LA MÁQUINA TRAGAPERRAS │");
  System.out.println("└─────────────────────────────────────┘");
  System.out.println("       Pulsa INTRO para tirar          ");
  System.console().readLine();
  
  for(int i=1; i<=3; i++){
    int tirada= (int)(Math.random()*4);
    switch(tirada) {
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
    if (i==1){
      tirada1=tirada;
    }
    if (i==2){
      tirada2=tirada;
    }
    if (i==3){
      tirada3=tirada;
    }
  
    System.out.print(figura + " ");
       
    }
    System.out.println("\n==============================");
    
    if ((tirada1==tirada2)&&(tirada2==tirada3)){
      System.out.print("Enhorabuena, ha ganado 10 monedas");

    }else if((tirada1==tirada2)||(tirada2==tirada3)||(tirada1==tirada3)){
      System.out.print("Bien, ha recuperado su moneda");
    }else {
      System.out.print("Lo siento, ha perdido");
    }
  }
}
