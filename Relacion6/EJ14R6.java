public class EJ14R6 {
  public static void main(String[] args) {
/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y 
tiene para ello 5 oportunidades. Después de cada intento fallido,
el programa dirá cuántas oportunidades quedan y si el número introducido es
menor o mayor que el número secreto.*/

  int oportunidades = 5;
  int n;
  int minimo = 0;
  int maximo = 100;
  boolean acertado = false;
  int masomenos;
  
  System.out.println("Te adivino el número que estés pensando entre 0 y 100:");
  System.out.println("------------------------------------------------------");

  do {
    n = (int)(Math.random() * (maximo - minimo) + minimo);
    System.out.println("¿Es el " + n + "?");
    System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
    masomenos = Integer.parseInt(System.console().readLine());
    oportunidades--;

    if ( (masomenos == 1) && (oportunidades > 0) ){
          minimo = n + 1;
      }
        
      if ( (masomenos == 2) && (oportunidades > 0) ){
        maximo = n - 1;
      }

      if (masomenos == 3) {
        acertado = true;
        System.out.println("¡Lo adiviné!");
        }
  
  } while (!acertado && (oportunidades > 0));

  if (!acertado) {
    System.out.println("¿Qué número era?");
    System.console().readLine();
  }
    
  }
}
