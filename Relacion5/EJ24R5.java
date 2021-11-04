public class EJ24R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
   1
  121
 12321
1234321*/
  
  int h=0;
  int ancho=1;
  int espacio;
  
    System.out.print("Altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    espacio=h-1;
    
    for (int i=1; i<=h; i++){
      for (int k=espacio; k>0 ;k--){
       System.out.print(" ");}
      
       for (int j=1; j<=i; j++){
        System.out.print(j);
       }
      for (int j=i-1; j>=1; j--){
        System.out.print(j);
       }
      ancho=ancho+2;
      espacio=espacio-1;
      System.out.println("");
    }
    
  }
}
