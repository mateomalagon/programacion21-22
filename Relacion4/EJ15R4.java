public class EJ15R4 {
public static void main(String[] args) {
  /*Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.
*/
System.out.print("Dime tu letra, número o símbolo (*, +, -, $, &): ");
String caracter = System.console().readLine();
System.out.print("¿Qué dirección quieres que apunte el vértice? (arriba, abajo, izquierda o derecha): ");
String direccion = System.console().readLine();

  if (direccion.equals("abajo")) {
    System.out.print(caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter);
    System.out.println();
    System.out.printf("%2s%6s", caracter,caracter+caracter+caracter+caracter+caracter+caracter);
    System.out.println();
    System.out.printf("%3s%4s", caracter,caracter+caracter+caracter+caracter);
    System.out.println();
    System.out.printf("%4s%2s", caracter,caracter+caracter);
    System.out.println();
    System.out.printf("%5s", caracter);
   }
  if (direccion.equals("arriba")) {
    System.out.printf("%5s", caracter);
    System.out.println();
    System.out.printf("%4s%2s", caracter,caracter+caracter);
    System.out.println();
    System.out.printf("%3s%4s", caracter,caracter+caracter+caracter+caracter);
    System.out.println();
    System.out.printf("%2s%6s", caracter,caracter+caracter+caracter+caracter+caracter+caracter);
    System.out.println();
    System.out.print(caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter+caracter); 
  } 
  if (direccion.equals("derecha")) {
    System.out.println(caracter);
    System.out.println(caracter+caracter);
    System.out.println(caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter);
    System.out.println(caracter+caracter);
    System.out.printf(caracter);
  }
  if (direccion.equals("izquierda")) {
    System.out.println("    "+caracter);
    System.out.println("   "+caracter+caracter);
    System.out.println("  "+caracter+caracter+caracter);
    System.out.println(" "+caracter+caracter+caracter+caracter);
    System.out.println(caracter+caracter+caracter+caracter+caracter);
    System.out.println(" "+caracter+caracter+caracter+caracter);
    System.out.println("  "+caracter+caracter+caracter);  
    System.out.println("   "+ caracter+caracter);
    System.out.printf("    "+caracter);
}
  }
}

