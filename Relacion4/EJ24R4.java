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
    int cargo = System.console().readInt();
  System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
    int dieta = System.console().readInt();
  System.out.println("Introduce su estado civil (1 - Soltero, 2 - Casado):");
    int civil = System.console().readInt();
    
  if (cargo==1) {
    double base = 950.00;
	}
  if (cargo==2) {
    double base = 1200.00;
	}
  if (cargo==3) {
    double base = 1600.00;
	}
  if (civil.equals("1")) {
    double irpf = 0.25;
    String IRPF = 25%
}
  if (civil.equals("2")) {
    double irpf = 0.2;
    String IRPF = 20%
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



