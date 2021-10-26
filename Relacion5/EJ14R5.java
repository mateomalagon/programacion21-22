public class EJ14R5 {
  public static void main (String[] args) {
    
/*Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/

    int a=0;
    int b=0;
    int potencia=1;
    System.out.print("Introduce una base: ");
      a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
      b = Integer.parseInt(System.console().readLine());
      
      if (b==0){
       potencia= 1;
      }
      if (b<0){
        System.out.println("No puedes poner un exponente negativo");
      }else{
    for (int i=0; i<b; i++) {
        potencia=potencia*a;
    }
    System.out.println("El resultado de "+a+" elevado a "+b+" es: "+potencia);
    }
  }
} 

