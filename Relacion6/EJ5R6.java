public class EJ5R6 {
  public static void main(String[] args) {
/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/

  float total=0;
  int minn=200;
  int maxn=0;
  
  System.out.println("50 números enteros aleatorios entre 100 y 199:");

  for (int i = 1; i <= 50; i++) {
    int n = (int)(Math.random()*100)+100;
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
