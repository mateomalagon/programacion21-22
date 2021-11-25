public class EJ12R7 {
  public static void main(String[] args) {
/*Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.*/

    int[] n = new int[10]; 
    int[] resultado = new int[10];
    int i;
    int inicial;
    int nfinal;
    

    System.out.println("Ve introduciendo 10 números enteros.");
    
    for ( i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    
    // Muestra el array original ///////////////
    System.out.println("Array original:");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 75; i++) {
      System.out.print("");
    }
    System.out.println("");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", n[i]);
    }
    System.out.println("|");
    System.out.println();
    ////////////////////////////////////////////
    
    System.out.printf("Dime una posición inicial entre 0 y 9: ");
    inicial= Integer.parseInt(System.console().readLine());
    
    System.out.printf("Dime una posición final entre "+inicial+" y 9: ");
    nfinal= Integer.parseInt(System.console().readLine());
    
    if (inicial>nfinal){
    System.out.printf("La posición inicial debe ser menor que la final. Empieza de nuevo.");
    }else{
    System.out.println();
    
    ////////////////////////////////////////////
    
    // Copia el array n en resultado.
    for (i = 0; i < 10; i++) {
      resultado[i] = n[i];
    }
    
    resultado[nfinal] = n[inicial];
    
    for (i = nfinal + 1; i < 10; i++){
      resultado[i] = n[i - 1];
      resultado[0] = n[9];
    }
    for (i = 0; i < inicial; i++){
      resultado[i + 1] = n[i];
    }
    
    // Muestra el array resultante ///////////////
    
    System.out.println("Array resultante:");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("|");
    for (i = 0; i < 75; i++) {
      System.out.print("");
    }
    System.out.println("");
    for (i = 0; i < 10; i++) {
      System.out.printf("|%3d ", resultado[i]);
    }
    System.out.println("|");
    }//else
  }
}
