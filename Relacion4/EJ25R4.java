public class EJ25R4 {
	
	public static void main (String[] args) {
/*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
máxima calidad y nos ha pedido hacer un configurador que calcule el precio
según el alto y el ancho. El precio base de una bandera es de un céntimo de
euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
son 3.25 €. El IVA ya está incluido en todas las tarifas.*/

/*Introduzca la altura de la bandera en cm: 20
Ahora introduzca la anchura: 35
¿Quiere escudo bordado? (s/n): n
Gracias. Aquí tiene el desglose de su compra.
Bandera de 700 cm2: 7,00 €
Sin escudo: 0,00 €
Gastos de envío: 3,25 €
Total: 10,25 €*/


  System.out.println("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
  System.out.println("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
  System.out.println("¿Quiere escudo bordado? (s/n): ");
    String bordado = System.console().readLine();
  System.out.println("Gracias. Aquí tiene el desglose de su compra.");
  
  double cm = altura*anchura;
  double base = cm*0.01;
  System.out.println("Bandera de "+cm+" cm2: "+base+" €");
  
  if (bordado.equals("s")) {
  System.out.println("Con bandera: 2,50 €");
	}
   if (bordado.equals("n")) {
  System.out.println("Sin bandera: 0,00 €");
	}
  
  System.out.println("Gastos de envío: 3,25 €");
  
  
  if (bordado.equals("s")) {
  double total = base+2.50+3.25;
  System.out.println("Total: "+total+" €");
	}
   if (bordado.equals("n")) {
  double total = base+3.25;
  System.out.println("Total: "+total+" €");
	}
  }
  }


