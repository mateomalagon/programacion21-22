public class EJ20R5 {
  public static void main (String[] args) {
    
/*Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.*/
  
  int h=0;
  String caracter;
  int ancho=1;
  int espacio;
  
    System.out.print("Altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    espacio=h-1;
    System.out.print("Carácter con el que se construirá la pirámide: ");
    caracter = System.console().readLine();
    
    for (int e=1; e<=h; e++){
        System.out.print(" ");
        }
    System.out.println(caracter);
    for (int i=2; i<=h; i++){
      for (int k=espacio; k>0 ;k--){
       System.out.print(" ");}
       System.out.print(caracter);
       
       for (int j=1; j<=ancho; j++){
        System.out.print(" ");
        }
      System.out.print(caracter);
      ancho+=2;
      espacio-=1;
      System.out.println("");
    }
   
    
  }
}
