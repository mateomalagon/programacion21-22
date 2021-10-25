public class EJ10R5 {
  public static void main (String[] args) {

/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. El usuario ha de indicar cuántos números va a introducir.*/

    float resultado = 0;
    float notas = 0;
    System.out.print("¿Cuántos números quiere meter?: ");
    int media= Integer.parseInt(System.console().readLine());
    
    for (int i=0; i<media; i++) {
      System.out.println("Introduce la "+(i+1)+"ª nota: ");
      notas = Float.parseFloat(System.console().readLine());
      resultado += notas;
    }
    System.out.println("Media: " +(resultado/media));
    
 }   
}

