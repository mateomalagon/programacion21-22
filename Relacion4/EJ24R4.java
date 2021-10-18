public class EJ24R4 {
	
	public static void main (String[] args) {
  
/*Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:
• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).
• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.
• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.*/


  System.out.println("1 - Programador junior\n 2 - Prog. senior\n 3 - Jefe de proyecto");
  System.out.println("¿Introduce el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
  System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dieta = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce su estado civil (1 - Soltero, 2 - Casado):");
    int civil = Integer.parseInt(System.console().readLine());
  
  
  double irpf=0, base=0;
  if (cargo==1) {
     base = 950.00;
	}
  if (cargo==2) {
     base = 1200.00;
	}
  if (cargo==3) {
     base = 1600.00;
	}
  
  if (civil==1) {
     irpf = 0.25;
     String IRPF;
     IRPF = "(25%)";
}
  if (civil==2) {
     irpf = 0.2;
     String IRPF;
     IRPF = "(20%)";
}
  double bruto, dietaf;
  dietaf = dieta*30;
  bruto = dietaf+base;
  System.out.println("Sueldo base:      "+base);
  System.out.println("Dietas "+"("+dieta+" viajes:      "+dietaf);
  System.out.println("------------------------");
  System.out.println("Sueldo bruto:     "+(bruto));
  
  System.out.println("Retención IRPF "+IRPF+":      "+(bruto*irpf));
  System.out.println("------------------------");
  System.out.println("Sueldo neto:      "+(bruto-(bruto*irpf)));
  }
}
