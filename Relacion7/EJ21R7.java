public class EJ21R7 {
  public static void main(String[] args) {
  /*Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él. */
    int [] numeros = new int[15];
    
    System.out.println("Array original: ");
    
    for (int i = 0; i < numeros.length; i++) numeros[i] = (int) (Math.random() * 501);
    
    for (int numero: numeros) System.out.print(numero + " ");

    System.out.println();
    System.out.println();

    System.out.println("Array cincuerizado: ");

    for (int i = 0; i < numeros.length; i++) while (numeros[i] % 5 != 0) numeros[i]++;

    for (int numero: numeros) System.out.print(numero + " ");
    
  }
}
