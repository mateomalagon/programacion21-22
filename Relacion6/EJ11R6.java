public class EJ11R6 {
  public static void main(String[] args) {
/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc. */

  int suspenso=0;
  int suficiente=0;
  int bien=0;
  int notable=0;
  int sobresaliente=0;
  String calificacion="";
  
  System.out.println("10 notas de alumnos:");
  System.out.println();

  for(int i=1; i<=10; i++){
    int nota = (int)(Math.random()*11);
   
    switch(nota) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
      calificacion="suspenso";
      suspenso++;
      break;
        
    case 5:
      calificacion="suficiente";
      suficiente++;
      break;
      
    case 6:
      calificacion="bien";
      bien++;
      break;
      
    case 7:
    case 8:
      calificacion="notable";
      notable++;
      break;
      
    case 9:
    case 10:
      calificacion="sobresaliente";
      sobresaliente++;
      break;
      default:
  }
    System.out.println(nota+"="+calificacion);
    
  }
  System.out.println();
  System.out.println("Hay "+suspenso+" suspensos");
  System.out.println("Hay "+suficiente+" suficientes");
  System.out.println("Hay "+bien+" bien");
  System.out.println("Hay "+notable+" notables");
  System.out.println("Hay "+sobresaliente+" sobresalientes");




  }
}
