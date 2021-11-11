public class EJ12R6 {
  public static void main(String[] args) {
/*Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
convertir un entero en un carácter*/
char caracter='a';
  while (caracter!=0) {
    caracter=(char)(Math.random()*94+32);
    System.out.print("\033[32m"+caracter);
    
      }  
  }
}
