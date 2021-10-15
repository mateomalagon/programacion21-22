
public class EJ6R4 {
public static void main(String[] args) {
  /*Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h.
*/
System.out.print("Dame la altura: ");
String respuesta = System.console().readLine();
int n = Integer.parseInt( respuesta );

double tiempo = Math.sqrt ((2.0*n)/9.81);


  if (n < 0) {
    System.out.println("Esa ecuación no tiene solución real.");
  } else {
    System.out.println("Tardará "+tiempo+" segundos");
      }
    }
  }

