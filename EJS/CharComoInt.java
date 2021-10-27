/**
* Correspondencia entre los tipos char e int
*
* @author Luis J. Sánchez
*/
public class CharComoInt {
  public static void main(String[] args) {
    int letra1 = 'a'; //si declaramos a y b como int me enseña su codigo ASCII
    char letra2 = 'b'; //si declaramos como char, nos muestra la letra
    System.out.println(letra1);
    System.out.println(letra2);
    System.out.println(letra1 + letra2); //la suma de los dos caracteres la hace con su codigo ASCII (97 para a y 98 para b)
    System.out.println(letra1 + "" + letra2);
    
    
  }
}
