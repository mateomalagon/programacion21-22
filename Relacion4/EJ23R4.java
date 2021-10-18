import java.util.Scanner;

public class EJ23R4 {
public static void main (String[] args){
  Scanner s = new Scanner(System.in);
  
/*Escribe un programa que calcule el precio final de un producto según su
base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
reducido o superreducido) y el código promocional. Los tipos de IVA general,
reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
respectivamente que no se aplica promoción, el precio se reduce a la mitad,
se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
muestran los valores correctos, aunque los números no estén tabulados.*/

/*  Introduzca la base imponible: 25
Introduzca el tipo de IVA (general, reducido o superreducido): reducido
Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
Base imponible 25.00
IVA (10%) 2.50
Precio con IVA 27.50
Cód. promo. (mitad): -13.75
TOTAL 13.75  */

double iva = 0, promo = 0, total, baseconiva, base;
  baseconiva = base + iva;
  total = baseconiva - promo;


  System.out.println("Introduce la base imponible:");
     base = Integer.parseInt(System.console().readLine());
  System.out.println("Introduce el tipo de IVA (general, reducido o superreducido):");
    String tipo = System.console().readLine();
  System.out.println("Introduce el código promocional (nopro, mitad, meno5 o 5porc):");
    String codigo = System.console().readLine();

  System.out.println("Base imponible: "+base);
  
if (tipo.equals("general")) {
  iva = base*0.21;
  System.out.println("IVA (21%): "+iva);
}
if (tipo.equals("reducido")) {
  iva = base*0.1;
  System.out.println("IVA (10%): "+iva);
}
if (tipo.equals("superreducido")) {
  iva = base*0.04;
  System.out.println("IVA (4%): "+iva);
}
  
  System.out.println("Precio con IVA: "+ baseconiva);
  
if (codigo.equals("nopro")) {
  System.out.println("Cód. promo. (nopro): No se aplica promoción");
} 
if (codigo.equals("mitad")) {
  promo = baseconiva*0.5;
  System.out.println("Cód. promo. (mitad): "+"-"+promo);
}   
if (codigo.equals("meno5")) {
  System.out.println("Cód. promo. (meno5): -5.00");
}   
if (codigo.equals("5porc")) {
  promo = baseconiva*0.05;
  System.out.println("Cód. promo. (5porc): "+"-"+promo);
}   

 
System.out.println("TOTAL: "+total);

     }
  }
