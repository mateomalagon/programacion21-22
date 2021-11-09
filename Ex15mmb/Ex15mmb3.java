import java.util.Scanner;
public class Ex15mmb3 {
  public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     
  //Mateo Malagón Beltrán a 8 de noviembre de 2021
  /*Este programa muestra el calendario del mes que el usuario diga, empezando por 
   * por el día que el usuario quiera*/
   
    System.out.print("Indique el mes (en minúscula): ");
    String mes = System.console().readLine();

    System.out.print("Indique el día de la semana en el que empieza el mes (en minúscula): ");
    String dia = System.console().readLine();

    if (mes.equals("enero")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("marzo")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("mayo")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("julio")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("agosto")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("octubre")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("diciembre")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │31 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │31 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │31 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │31 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │31 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│31 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │31 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("abril")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("junio")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("septiembre")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("noviembre")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │30 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │30 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │30 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │30 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │30 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │30 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│30 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
    
    if (mes.equals("febrero")){
      System.out.print("¿Es un año bisiesto? (s/n): ");
      String bisiesto = System.console().readLine(); 
      
    
    if (bisiesto.equals("s")){
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│29 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │29 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │29 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │29 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │29 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │29 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │29 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }else{
      if (dia.equals("lunes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 8 │ 9 │10 │11 │12 │13 │14 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│15 │16 │17 │18 │19 │20 │21 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│22 │23 │24 │25 │26 │27 │28 │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("martes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │ 1 │ 2 │ 3 │ 4 │ 5 │ 6 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 7 │ 8 │ 9 │10 │11 │12 │13 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│14 │15 │16 │17 │18 │19 │20 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│21 │22 │23 │24 │25 │26 │27 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│28 │   │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("miércoles")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│13 │14 │15 │16 │17 │18 │19 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│20 │21 │22 │23 │24 │25 │26 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│27 │28 │   │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("jueves")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │ 1 │ 2 │ 3 │ 4 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 5 │ 6 │ 7 │ 8 │ 9 │10 │11 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│12 │13 │14 │15 │16 │17 │18 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│19 │20 │21 │22 │23 │24 │25 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│26 │27 │28 │   │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("viernes")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │ 1 │ 2 │ 3 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │10 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│11 │12 │13 │14 │15 │16 │17 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│18 │19 │20 │21 │22 │23 │24 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│25 │26 │27 │28 │   │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
      if (dia.equals("sábado")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │ 1 │ 2 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │ 9 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│10 │11 │12 │13 │14 │15 │16 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│17 │18 │19 │20 │21 │22 │23 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│24 │25 │26 │27 │28 │   │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
       
      }
      if (dia.equals("domingo")){
        System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
        System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│   │   │   │   │   │   │ 1 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 2 │ 3 │ 4 │ 5 │ 6 │ 7 │ 8 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│ 9 │10 │11 │12 │13 │14 │15 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│16 │17 │18 │21 │22 │23 │22 │");
        System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        System.out.println("│23 │24 │25 │26 │27 │28 │   │");
        System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
      }
    }
     
  }//if febrero
    
  }
}
