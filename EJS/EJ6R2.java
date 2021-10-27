public class EJ6R2 {
public static void main (String[] args){
/*Escribe un programa que calcule el total de una factura a partir de la base
imponible (precio sin IVA). La base imponible estará almacenada en una
variable.
*/
  double BaseImp = 600.00f;
  System.out.printf("Base Imponible %-8.2f\n",BaseImp);
  System.out.printf("IVA ************** %-8.2f\n",(BaseImp * 0.21));
  System.out.println("--------------------------");
  System.out.printf("Total ************ %-8.2f\n",(BaseImp * 1.21));
  
  }
}
