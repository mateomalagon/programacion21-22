public class EJ6R6 {
  public static void main(String[] args) {
/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y 
tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/

  int oportunidades = 5;
  int intento;
  boolean acertado = false;
  int n = (int)(Math.random() * 101);

  System.out.println("Adivina el número entre 0 y 100:");
  

  do {
    System.out.print("Introduce un número: ");
    intento = Integer.parseInt(System.console().readLine());
    oportunidades--;

    if ( (intento > n) && (oportunidades > 0) ){
      System.out.println("El número es menor que " + intento);
      System.out.println("Te quedan " + oportunidades + " oportunidades.");
    }
    if ( (intento < n) && (oportunidades > 0) ){
      System.out.println("El número es mayor que " + intento);
      System.out.println("Te quedan " + oportunidades + " oportunidades.");
    }
    if (intento == n) {
      acertado = true;
      System.out.println("Correcto");
    }
  
  } while (!acertado && (oportunidades > 0));

  if (!acertado) {
    System.out.println("Lo siento, el número era el " +n);
  }
    
  }
}
