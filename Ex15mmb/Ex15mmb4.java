import java.util.Scanner;
public class Ex15mmb4 {
  public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     
  //Mateo Malagón Beltrán a 8 de noviembre de 2021
  /*Este programa muestra el PIN que el usuario escriba con cifras, en números escritos*/
   
  int pin;
  int digito;
  int reves=0;
    System.out.print("Introduzca el PIN: ");
    pin = Integer.parseInt(System.console().readLine());
    
    while (pin>0) {
    reves = (reves * 10) + (pin % 10);
    pin = pin/10;
    }
    
    pin=reves;
   
   if (pin==0){
     System.out.print("cero ");
   }else{
    while (pin > 0) {

      digito = pin % 10;

      pin = pin/10;
      
      if (digito == 0){
        System.out.print("cero ");
      }
      if (digito == 1){
        System.out.print("uno ");
      }
      if (digito == 2){
        System.out.print("dos ");
      } 
      if (digito == 3){
        System.out.print("tres ");
      }
      if (digito == 4){
        System.out.print("cuatro ");
      } 
      if (digito == 5){
        System.out.print("cinco ");
      } 
      if (digito == 6){
        System.out.print("seis ");
      } 
      if (digito == 7){
        System.out.print("siete ");
      } 
      if (digito == 8){
        System.out.print("ocho ");
      } 
      if (digito == 9){
        System.out.print("nueve ");
      } 
    
    }
  }//else
  
  }
}
