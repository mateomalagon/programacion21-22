public class EJ19R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.*/
  
  int h=0;
  String caracter;
  int ancho=1;
  int espacio;
  
    System.out.print("Altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    espacio=h-1;
    System.out.print("Carácter con el que se construirá la pirámide: ");
    caracter = System.console().readLine();
    
    for (int i=1; i<=h; i++){
      for (int k=espacio; k>0 ;k--){
       System.out.print(" ");}
       
       for (int j=1; j<=ancho; j++){
        System.out.print(caracter);
        }
      ancho+=2;
      espacio-=1;
      System.out.println("");
    }
   
  }
}
