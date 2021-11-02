public class EJ9R5 {
  public static void main(String[] args) {
    
  int digitos = 1;
  int n=0;
  int numero;
  System.out.print("Introduce un número entero: ");
  numero = Integer.parseInt(System.console().readLine());
  n=numero;
  while (n > 10) {
    n = n/10;
    digitos++;
  }
    
    System.out.println(numero +" tiene "+digitos+ " dígitos.");
  }
}
