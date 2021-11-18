public class EJ20R6 {
  public static void main(String[] args) {
/*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.

Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
*/

    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = Integer.parseInt(System.console().readLine());
    
    int litros = (int)(Math.random()*capacidad);
    System.out.println();
    
      for (int i = 0; i < capacidad-litros; i++){
        System.out.println("*    *");
        
      }
      for (int j=0; j<litros; j++){
          System.out.println("*====*");
        }
      
      System.out.println("******");
      System.out.println("La cuba tiene una capacidad de "+capacidad+" litros y contiene "+litros+" litros de agua.");
    
  }
}
