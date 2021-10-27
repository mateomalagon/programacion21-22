public class Ejercicio2direccionytlf {
public static void main (String[] args){

String nombre;
String direccion;
int tlf;

	System.out.println("Hola");
	System.out.println("Introduce tu nombre: ");
	nombre = System.console().readLine();
  System.out.println("Introduce tu dirección: ");
  direccion = System.console().readLine();
  System.out.println("Introduce tu número de teléfono: ");
  tlf = Integer.parseInt(System.console(). readLine());
  
  System.out.printf("Hola " + nombre + " con número " + tlf + " y dirección " + direccion);
	
	
  
  }
}
