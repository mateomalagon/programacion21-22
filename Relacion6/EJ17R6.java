public class EJ17R6 {
  public static void main(String[] args) {
/*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.

Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*       &   *
* * * * * * *
*/

  
    
    
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int posicion=0;
    int pez = (int)(Math.random()*(altura - 2)*(anchura - 2));
    
    if ((altura >= 4)&&(anchura >= 4)){
      for (int i = 0; i < anchura; i++){
        System.out.print("* ");
      }
  
      System.out.println();
  
      for (int j = 0; j < (altura - 2); j++){
        System.out.print("* ");
  
        for (int i = 0; i < (anchura - 2); i++){
          if (posicion == pez) {
            System.out.print("& ");
          } else {
          System.out.print("  ");
          }
          posicion++;
        }
        System.out.println("* ");
      }
      for (int i = 0; i < anchura; i++){
        System.out.print("* ");
      }
    }else {
      System.out.println("Datos erroneos");
    }
    
  }
}
