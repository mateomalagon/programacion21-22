import java.util.Scanner;

public class EJ8R3 {
public static void main (String[] args){
  Scanner x = new Scanner (System.in);
  /*Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
*/
int salario,horas,lunes,martes,miercoles,jueves,viernes,sabado;

System.out.println("Horas que ha trabajado usted el lunes: ");
lunes = x.nextInt();
System.out.println("Horas que ha trabajado usted el martes: ");
martes = x.nextInt();
System.out.println("Horas que ha trabajado usted el miercoles: ");
miercoles = x.nextInt();
System.out.println("Horas que ha trabajado usted el jueves: ");
jueves = x.nextInt();
System.out.println("Horas que ha trabajado usted el viernes: ");
viernes = x.nextInt();
System.out.println("Horas que ha trabajado usted el sabado: ");
sabado = x.nextInt();
horas = lunes+martes+miercoles+jueves+viernes+sabado;
salario =  horas*12;
System.out.println("Su salario semanal es de "+ salario +" euros. ");
	}
}
