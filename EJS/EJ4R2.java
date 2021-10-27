public class EJ4R2 {
public static void main (String[] args){
/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.
   */
  double euros, resultado;
  double pesetas;
  pesetas = 166.3860;
  
  System.out.print("Introduzca los euros:");
  euros = Integer.parseInt(System.console().readLine());
	resultado = euros * pesetas;
  System.out.println(euros+" euros son " + resultado + " pesetas");
  }
}
