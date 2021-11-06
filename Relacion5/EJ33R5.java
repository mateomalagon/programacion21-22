public class EJ33R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

Introduzca la altura de la U: 5
*     *
*     *
*     *
*     *
 * * *
*/
  
  int h=1;
  boolean esPar=true;
  boolean esImpar=true;
    System.out.print("Altura de la L: ");
    h = Integer.parseInt(System.console().readLine());
  
    for (int i=1; i<h; i++){
        System.out.print("* ");
        for (int j=1; j<h; j++){
          System.out.print(" ");
        }
        if (h%2==0){
          esPar=true;
          System.out.print(" ");
        } 
        System.out.println("*");
    }
    System.out.print(" ");
    
    for (int i=0; i<=h/2; i++){
        System.out.print("* ");
       }
  }
}
