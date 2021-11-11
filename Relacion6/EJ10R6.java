public class EJ10R6 {
  public static void main(String[] args) {
/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno
de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria
entre 1 y 40 caracteres. */

  String tipocaracter = "";

System.out.println("Este programa genera 10 líneas de longitud aleatoria con un carácter aleatorio\ncada uno:");

  for(int i=1; i<=10; i++){
    int caracter = (int)(Math.random()*6) + 1;
   
    switch(caracter) {
    case 1:
      tipocaracter="*";
      break;
      
    case 2:
      tipocaracter="-";
      break;
      
    case 3:
      tipocaracter="=";
      break;
      
    case 4:
      tipocaracter=".";
      break; 
      
    case 5:
      tipocaracter="|";
      break;
      
    case 6:
      tipocaracter="@";
      break;
      default:
    tipocaracter = String.valueOf(caracter);
  }
    int veces = (int)(Math.random()*40) ;
    
      for(int j=1; j<=veces; j++){
        System.out.print(tipocaracter);
      }
      System.out.println();
    }
  
   
  }
}
