public class EJ21R5 {
  public static void main (String[] args) {
    
/*Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo.*/

    int n=0;
    int numeros=0;
    int total=0;
    int impar=0;
    int mayorpar=0;
    int impares=0;
    
    System.out.println("Ve introduciendo números y pulsando intro.\nPara terminar introduce un número negativo.");
    
    do {
      if (n>=0){
        numeros++;
        if ((n % 2) == 1) {
          impares=impares+n;
          impar++;
      }else{
        if (n>mayorpar){
          mayorpar=n;
        }
      }
    }
      n = Integer.parseInt(System.console().readLine());
      }while (n>=0);
      
        System.out.println("Hay "+(numeros-1)+" números");
        System.out.println("La media de los impares es igual a "+(impares/impar));
        System.out.println("El mayor número par es "+mayorpar);

  }
} 
