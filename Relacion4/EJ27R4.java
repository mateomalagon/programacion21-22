import java.util.Scanner;
public class EJ27R4 {
	
	public static void main (String[] args) {
      Scanner s = new Scanner(System.in);

/*Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.*/

/*Elija un sabor (manzana, fresa o chocolate): chocolate
-¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
-Tarta de chocolate negro: 14,00 €
-Con nata: 2,50 €
Total: 16,50 €*/

/*Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
-Tarta de manzana: 18,00 €
-Con nombre: 2,75 €
Total: 20,75 €*/

  double precio=0,conNata=0,conNombre=0;

  System.out.printf("Elige un sabor (manzana, fresa o chocolate): ");
    String sabor=System.console().readLine();
  switch (sabor) {
    case "manzana":
      precio=18.00;
      break;
    case "fresa":
      precio=16.00;
      break;
    case "chocolate":
      System.out.printf("¿Qué tipo de chocolate quieres? (negro o blanco): ");
      String tipo = System.console().readLine();
      if (tipo.equals("negro")) {
      precio=14.00;
      sabor = "chocolate negro";
      }
      if (tipo.equals("blanco")) {
      precio=15.00;
      sabor = "chocolate blanco";
      }
      break;
  }
  
  System.out.printf("¿Quiere nata? (si o no): ");
    String nata=System.console().readLine();
  if (nata.equals("si")){
  conNata=2.50;
  }

  System.out.printf("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = System.console().readLine();
  if (nombre.equals("si")){
  conNombre=2.75;
  }
  
  System.out.println("Tarta de "+sabor+": "+precio+" €");
  
  
  
  if (nata.equals("si")){
  System.out.println("Con nata: 2.50 €");
  }
  if (nombre.equals("si")){
  System.out.println("Con nombre: 2.75 €");
  }
  double total = precio+conNata+conNombre;
  System.out.printf("Total: "+total+"€");
    }
  }


