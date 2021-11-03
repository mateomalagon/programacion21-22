public class EJ26R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que pida primero un número y a continuación un dígito.
El programa nos debe dar la posición (o posiciones) contando de izquierda a
derecha que ocupa ese dígito en el número introducido.*/
  
  int n;
  int digito;
  
  
  System.out.print("Introduzca un número entero: ");
    n = Integer.parseInt(System.console().readLine());
  System.out.print("Ahora un dígito: ");
    digito = Integer.parseInt(System.console().readLine());
    
  if(n == 0) {
    System.out.println("El número "+digito+" ocupa la primera posición ya que está solo.");
  } 
  if((n>0)&&(n<10)) {
    System.out.println("El número "+digito+" ocupa la segunda posición en "+n+""+digito);
  }
  if((n>9)&&(n<100)) {
    System.out.println("El número "+digito+" ocupa la tercera posición en "+n+""+digito);
  }
  if((n>99)&&(n<1000)) {
    System.out.println("El número "+digito+" ocupa la cuarta posición en "+n+""+digito);
  }
  if((n>999)&&(n<10000)) {
    System.out.println("El número "+digito+" ocupa la quinta posición en "+n+""+digito);
  }
  }
} 
