public class EJ8R5 {
	public static void main (String[] args) {
    
    //Muestra la tabla de multiplicar de un número introducido por teclado.
    
    System.out.print("Tabla de multiplicar del: ");
    int numero= Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=10; i++) {
      System.out.println("1x"+i+"="+i*numero);
    
    }
    
    
 }   
}
