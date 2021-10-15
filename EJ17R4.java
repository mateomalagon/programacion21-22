public class EJ17R4 {
public static void main(String[] args) {
  /*Escribe un programa que diga cuál es la última cifra de un número entero
introducido por teclado.*/
System.out.print("Introduce un número entero: ");

int n = Integer.parseInt(System.console().readLine());

System.out.println("La última cifra es el " + (n % 10));
  }
}
