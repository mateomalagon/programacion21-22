public class Prueba2 {
public static void main (String[] args){
  
  int a,b;
  float resultado;
  
  System.out.println("Demostración de que java no sabe dividir \"bien\"");
  System.out.print("Introduzca dividendo:");
  a = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca divisor:");
  b = Integer.parseInt(System.console().readLine());
  resultado= a/(float)b; /*si no se añade ese (float), detecta la division como division 
                          entre enteros por lo cual el resultado es entero, aunque se declare
                          como float anteriormente
                          */
  System.out.println("El resultado de la división es:"+resultado);
}
}
