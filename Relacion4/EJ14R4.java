public class EJ14R4 {
public static void main(String[] args) {
  
System.out.print("Introduce un número entero: ");

int n = Integer.parseInt(System.console().readLine());

if ((n % 2) == 0) {
System.out.print("El número es par");
} else {
System.out.print("El número es impar");
}
if ((n % 5) == 0) {
System.out.println(" y divisible entre 5.");
} else {
System.out.println(" y no es divisible entre 5.");
    }
  } 
}

