public class EJ7R5 {
	public static void main (String[] args) {
    
/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/

    String contraseña, intento;
  
  
    System.out.println("Introduzca la contraseña de la caja fuerte (4 dígitos) ");
    contraseña = System.console().readLine();
    if (contraseña.equals("2810")){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    }else{
        System.out.println("Lo siento, esa no es la combinación");
        contraseña = System.console().readLine();
    }if (contraseña.equals("2810")){
    }else{
        System.out.println("Lo siento, esa no es la combinación");
        contraseña = System.console().readLine();
    }if (contraseña.equals("2810")){
    }else{
        System.out.println("Lo siento, esa no es la combinación");
        System.out.println("¡Último intento!");
        contraseña = System.console().readLine();
    }
      

  
  
 }   
}
