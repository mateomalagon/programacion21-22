public class EJ31R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.

Introduzca la altura de la L: 5
*
*
*
*
* * *     */
  
  int h=0;
  int ancho=1;
  
    System.out.print("Altura de la L: ");
    h = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<h; i++){
        System.out.println("*");
    }
    for (int i=0; i<=h/2; i++){
        System.out.print("* ");
       }
  }
}
