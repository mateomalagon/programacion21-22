public class EJ19R4 {
public static void main(String[] args) {
  /*Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/
 int n, primera = 0;
System.out.print("Introduce un número entero: ");
n = Integer.parseInt(System.console().readLine());

if ((n<10) && (n>-10)) {
 System.out.print("Tiene 1 dígito");
 }
if (((n>-100) && (n<=-10)) || ((n>=10) && (n<100))) {
 System.out.print("Tiene 2 dígitos");
}
if (((n>-1000) && (n<=-100)) || ((n>=100) && (n<1000))) {
 System.out.print("Tiene 3 dígitos");
}
if (((n>-10000) && (n<=-1000)) || ((n>=1000) && (n<10000))) {
 System.out.print("Tiene 4 dígitos");
}
if (((n>-1000000) && (n<=-10000)) || ((n>=10000) && (n<1000000))) {
 System.out.print("Tiene 5 dígitos");
}

  }
}
