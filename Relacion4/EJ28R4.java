import java.util.Scanner;
public class EJ28R4 {
	
	public static void main (String[] args) {
      Scanner s = new Scanner(System.in);
      
/*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.*/

//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): papel
//Empate

//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 2

//Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 1



System.out.printf("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String turno1=System.console().readLine();
System.out.printf("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String turno2=System.console().readLine();

if (((turno1.equals("piedra"))||(turno1.equals("papel"))||(turno1.equals("tijera")))
&&((turno2.equals("piedra"))||(turno2.equals("papel"))||(turno2.equals("tijera")))) {
    if(turno1.equals(turno2)){
      System.out.println("Empate");
    }else{
      switch(turno1){
        case "piedra":
        if(turno2.equals("tijera")){
          
          System.out.println("Gana el jugador 1");
        }
        if(turno2.equals("papel")){
          
          System.out.println("Gana el jugador 2");
        }
        break;
        case "tijera":
        if(turno2.equals("papel")){
          
          System.out.println("Gana el jugador 1");
        }
        if(turno2.equals("piedra")){
          
          System.out.println("Gana el jugador 2");
        }
        break;
        case "papel":
        if(turno2.equals("piedra")){
          
          System.out.println("Gana el jugador 1");
        }
        if(turno2.equals("tijera")){
          
          System.out.println("Gana el jugador 2");
        }
        break;
      
      }
    }
    
  }else{
    System.out.println("Eso no existe en piedra, papel o tijera");
  }
}}
