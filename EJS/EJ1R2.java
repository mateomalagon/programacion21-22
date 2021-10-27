public class EJ1R2 {
  public static void main(String[] args) {
  /*Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
  los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
  el valor de cada variable, la suma, la resta, la división y la multiplicación.
  */
  int x;
  int y;
  x = 144;
  y = 999;
  System.out.println(" x vale " + x);
  System.out.println(" y vale " + y);
  int suma = x+y;
  System.out.println("Su suma eqivale a: " + suma);
  int resta = x-y;
  System.out.println("Su resta a: " + resta);
  int mult = x*y;
  System.out.println("Su multiplicación a: " + mult);
  float divi = x/(float)y;
  System.out.println("Y su división a: " + divi);
  }
}
