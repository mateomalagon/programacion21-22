public class EJ25R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que pida un número por teclado y que luego
muestre ese número al revés.*/
  
  int n;
  int reves=0;
  
  System.out.print("Introduzca un número entero: ");
    n = Integer.parseInt(System.console().readLine());
    int numero=n;
    
    
  while (numero > 0) {
    reves=(reves*10) + (numero%10);
    numero/=10;
  } 
  
    System.out.println("El número "+n+" del revés es "+reves);


  }
} 
