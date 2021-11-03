public class EJ24R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
* 
*  1
  121
 12321
1234321*/
  
  int h=0;
  int caracter;
  int ancho=1;
  int espacio;
  
    System.out.print("Altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    espacio=h-1;
    System.out.print("Número con el que se empezará a construir la pirámide: ");
    caracter = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=h; i++){
      for (int k=espacio; k>0 ;k--){
       System.out.print(" ");}
       
       for (int j=caracter; j<=ancho; j++){
        System.out.print(caracter);
        }
      ancho+=2;
      espacio-=1;
      System.out.println("");
    }
   
  }
}
