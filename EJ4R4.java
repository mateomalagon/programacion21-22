public class EJ4R4 {
public static void main(String[] args) {
  /*Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
*/
System.out.print("Dime las horas trabajadas esta semana: ");
String respuesta = System.console().readLine();
int n = Integer.parseInt( respuesta );

int normal = n*12;
int demas = ((40*12)+(n-40)*16);

  if (n <= 40) {
    System.out.println("Tu salario es de "+normal+" euros");
  } else {
    System.out.println("Tu salario es de "+demas+" euros");
      }
    }
  }
