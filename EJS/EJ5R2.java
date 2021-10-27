public class EJ5R2 {
public static void main (String[] args){
/*Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
convertir deberá estar almacenada en una variable.
   */
  double pesetas, resultado;
  double euros;
  euros = 0.00600;
  
  System.out.print("Introduzca las pesetas:");
  pesetas = Integer.parseInt(System.console().readLine());
	resultado = pesetas * euros;
  System.out.println(pesetas +" pesetas son " + resultado + " euros");
  }
}

