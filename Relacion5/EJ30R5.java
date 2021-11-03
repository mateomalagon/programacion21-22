public class EJ30R5 {
  public static void main (String[] args) {
    
/*Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero.
*/
    

    
    System.out.print("Por favor, introduzca la primera hora. ");
    System.out.print("Día: ");
      int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Hora: ");
      int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca la segunda hora. ");
    System.out.print("Día: ");
      int dia2 = Integer.parseInt(System.console().readLine());
    System.out.print("Hora: ");
      int hora2 = Integer.parseInt(System.console().readLine());
      
      
    
    
     System.out.print("Entre las "+hora+":00h del +"+dia+" y las "+hora2+":00h del "+dia2+" hay "+26 hora/s. ");
  }
} 
