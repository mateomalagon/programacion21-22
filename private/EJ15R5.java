public class EJ15R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.*/

    int a,b;
    
    System.out.print("Introduce una base: ");
      a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
      b = Integer.parseInt(System.console().readLine());
      
    for (int i=1; i<=b; i++) {
        int potencia=1;
        for (int j=1; j<=i; j++) {
          potencia = potencia * a;
    }
    System.out.println("El resultado de "+a+" elevado a "+i+" es: "+potencia);
  
    }
  }
} 
