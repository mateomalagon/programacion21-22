
public class ExtraR3 {
public static void main (String[] args){
  
/*Escriba un programa que sea capaz de memorizar 5 frases, introducidas 
 * cada una de ellas por teclado. El programa sólo puede utilizar una variable
 * de tipo String. El programa debe solicitar cada una de las 5 frases, y debe 
 * presentarlas todas juntas tras la introducción de la quinta frase. Debe 
 * pensar en los pasos (algoritmo) que debe realizar el programa, teniendo 
 * en cuenta la restricción de que sólo se puede usar una variable de tipo String.
 */
 
String miau;
System.out.println("Introduce tu frase: ");
miau = System.console().readLine();
System.out.println("Tu frase es "+ miau + " por favor introduce otra frase:");
miau = miau+System.console().readLine();
System.out.println("Tu frase es "+ miau + " por favor introduce otra frase:");
miau = miau+System.console().readLine();
System.out.println("Tu frase es "+ miau + " por favor introduce otra frase:");
miau = miau+System.console().readLine();
System.out.println("Tu frase es "+ miau + " por favor introduce otra frase:");
miau = miau+System.console().readLine();
System.out.println("Tu frase completa es "+miau);
  }
}
