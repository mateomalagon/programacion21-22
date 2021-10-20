import java.util.Scanner;
public class EJ29R4 {
	
	public static void main (String[] args) {
      Scanner s = new Scanner(System.in);
/*Realiza un programa que calcule el precio de un desayuno. El programa
preguntará primero qué ha tomado el usuario de comer: palmera, donut o
pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
programa debe preguntar además si era con aceite o con tortilla; el primero
vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
café a 1’50 y 1’20 respectivamente.*/

/*¿Qué ha tomado de comer? (palmera, donut o pitufo): pitufo
--¿Con qué se ha tomado el pitufo? (aceite o tortilla): tortilla
¿Qué ha tomado de beber? (zumo o café): zumo
Pitufo con tortilla: 1,60 €
Zumo: 1,50 €
Total desayuno: 3,10 € 
 

¿Qué ha tomado de comer? (palmera, donut o pitufo): palmera
¿Qué ha tomado de beber? (zumo o café): café
Palmera: 1,40 €
Café: 1,20 €
Total desayuno: 2,60 €*/

double precioFood=0, precioDrink=0;


System.out.printf("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida=System.console().readLine();
    
    switch(comida){
        case "pitufo":
        System.out.printf("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
           String tipo=System.console().readLine();
           
          if(tipo.equals("aceite")){
            precioFood=1.2;
            
            tipo="aceite";
          }
          if(tipo.equals("tortilla")){
            precioFood=1.6;
            tipo="tortilla";
          }
        break;
        case "palmera":
          precioFood=1.4;
        break;
        case "donut":
          precioFood=1.0;
        break;
          }
    
System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida=System.console().readLine();
      switch (bebida) {
        case "zumo":
          precioDrink=1.5;
        break;
        case "cafe":
          precioDrink=1.2;
        break;
      }
  switch(comida){
        case "pitufo":
          if(tipo.equals("aceite")){
            System.out.printf("Pitufo con aceite: "+precioFood+"€");
          }
          if(tipo.equals("tortilla")){
            System.out.printf("Pitufo con tortilla: "+precioFood+"€");
          }
        break;
        case "palmera":
          System.out.printf("Palmera: "+precioFood+"€");
        break;
        case "donut":
          System.out.printf("Donut: "+precioFood+"€");
        break;
      }
  switch(bebida){
        case "zumo":
          System.out.printf("Zumo: "+precioDrink+"€");
        break;
        case "cafe":
          System.out.printf("Cafe: "+precioDrink+"€");
        break;
      }
  double total=precioDrink+precioFood;
  System.out.println("Total del desayuno: "+total+"€");
  }
  }

