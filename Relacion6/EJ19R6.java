public class EJ19R6 {
  public static void main(String[] args) {
/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares, el mínimo de los impares y la media de todos los
números generados.*/

  float total=0;
  int minn=200;
  int maxn=-100;
  
  System.out.println("50 números enteros aleatorios entre -100 y 200:");

  for (int i = 1; i <= 50; i++) {
    int n = (int)(Math.random()*301)+(-100);
    System.out.print(n + " ");
    total+=(float) n;
    if(n>maxn){
      maxn=n;
    }
    if(n<minn){
      minn=n;
    }
  }
    System.out.print("\nLa media de todos estos números es igual a "+(total/50));
    System.out.print("\nEl mayor es "+maxn);
    System.out.print("\nY el menor es "+minn);
  }
}
