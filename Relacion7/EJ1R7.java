public class EJ1R7 {
  public static void main(String[] args) {
/*Define un array de 12 números enteros con nombre num y asigna los valores
según la tabla que se muestra a continuación. Muestra el contenido de todos
los elementos del array. ¿Qué sucede con los valores de los elementos que no
han sido inicializados?*/

    int[] num; 
    num = new int[12]; 

    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    System.out.print("Los valores del array num son los siguientes: \n");
   for (int i = 0; i < 13; i++) {
      System.out.println("num["+i+"]="+num[i]);
    }
    
    // Se puede observar que los valores del array se inicializan automáticamente a 0.
  }
}
