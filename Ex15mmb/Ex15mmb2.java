import java.util.Scanner;
public class Ex15mmb2 {
  public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     
  //Mateo Malagón Beltrán a 8 de noviembre de 2021
  /*Este programa hace una pirámide porosa de la altura que el usuario desée*/

  int h=0;
  String caracter;
  int ancho=1;
  int espacio;
  
    System.out.print("Introduzca la altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    espacio=h-1;
    
    System.out.print("Introduzca el carácter de relleno: ");
    caracter = System.console().readLine();
    
    System.out.println();
    
    for (int i=1; i<=h; i++){
      for (int k=espacio; k>0 ;k--){
       System.out.print(" ");}
       
       for (int j=1; j<=ancho; j++){
        System.out.print(caracter+" ");
        }
      ancho=ancho+1;
      espacio=espacio-1;
      System.out.println("");
    }
  
    
  }
}
