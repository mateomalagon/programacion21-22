public class EJ29R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/
    
    
    System.out.print("Introduce un número para mostrar su menores: ");
      int n = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro número para mostrar los que no son divisibles entre este: ");
      int n2 = Integer.parseInt(System.console().readLine());

     for (int i=n; i>=0; i--) {
        if ((i%n2)==1){
        System.out.print(i+" ");
        }
      }
      
  }
} 
