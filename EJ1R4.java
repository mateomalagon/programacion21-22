public class EJ1R4 {
public static void main(String[] args) {
  /*Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.*/
System.out.print("Dime un día de la semana entre el lunes y el viernes: ");
String respuesta = System.console().readLine();

  if (respuesta.equals("Lunes")) {
    System.out.println("La asignatura que tienes a primera es Lenguaje de Marcas");
  } else {
    if (respuesta.equals("Martes")) {
    System.out.println("La asignatura que tienes a primera es Entornos de Desarrollo");
  } else {
    if (respuesta.equals("Miercoles")) {
    System.out.println("La asignatura que tienes a primera es Lenguaje de Marcas");
  } else {
    if (respuesta.equals("Jueves")) {
    System.out.println("La asignatura que tienes a primera es Entornos de Desarrollo");
  } else {
    System.out.println("La asignatura que tienes a primera es FOL");
          }
        }
      }
    }
  }
}
