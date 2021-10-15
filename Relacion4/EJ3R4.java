public class EJ3R4 {
public static void main(String[] args) {
  /*Escribe un programa en que dado un número del 1 a 7 escriba 
   *  correspondiente nombre del día de la semana.
    */
System.out.print("Dime un número del 1 al 7: ");
String respuesta = System.console().readLine();

  if (respuesta.equals("1")) {
    System.out.println("Lunes");
  } else {
    if (respuesta.equals("2")) {
    System.out.println("Martes");
  } else {
    if (respuesta.equals("3")) {
    System.out.println("Miércoles");
  } else {
    if (respuesta.equals("4")) {
    System.out.println("Jueves");
  } else {
    if (respuesta.equals("5")) {
    System.out.println("Viernes");
  } else {
    if (respuesta.equals("6")) {
    System.out.println("Sábado");
  } else {
    System.out.println("Domingo");
              }
            }
          }
        }
      }
    }
  }
}
