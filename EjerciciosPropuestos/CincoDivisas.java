import java.util.Scanner;
public class CincoDivisas {
	
	public static void main (String[] args) {
      Scanner s = new Scanner(System.in);
      
  
/*Realice un programa que convierta a 5 divisas una cantidad dada:
euro, dolar, libra, yen, yuan
Busque los factores de conversión en internet.
El programa solicitará al usuario la divisa de entrada, así como la cantidad de 
dinero en dicha divisa.
Una vez realice los cálculos oportunos, el programa mostrará la equivalencia de 
la cantidad de dinero introducida en las 5 divisas indicadas.*/

double euro=0, dolar=0, libra=0, yen=0, yuan=0;

  System.out.printf("Dime la cantidad que quiéres convertir: ");
    double cantidad=Double.parseDouble(System.console().readLine());
  System.out.printf("¿Qué divisa es? (euro, dolar, libra, yen o yuan): ");
    String divisa=System.console().readLine();
    
  switch (divisa) {
    case "euro":
      dolar = cantidad*1.16;
      libra = cantidad*0.84;
      yen = cantidad*133.05;
      yuan = cantidad*7.43;
      System.out.printf(cantidad+"€ son $%.2f\n",dolar);
      System.out.printf(cantidad+"€ son £%.2f\n",libra);
      System.out.printf(cantidad+"€ son ¥%.2f\n",yen );
      System.out.printf(cantidad+"€ son %.2f RMB\n",yuan);
      break;
    case "dolar":
      euro = cantidad*0.86;
      libra = cantidad*0.73;
      yen = cantidad*114.45;
      yuan = cantidad*6.4;
      System.out.printf("$"+cantidad+" son %.2f€\n",euro);
      System.out.printf("$"+cantidad+" son £%.2f\n",libra);
      System.out.printf("$"+cantidad+" son ¥%.2f\n",yen);
      System.out.printf("$"+cantidad+" son %.2f RMB\n",yuan);
      break;
    case "libra":
      dolar = cantidad*1.38;
      euro = cantidad*1.18;
      yen = cantidad*157.59;
      yuan = cantidad*8.81;
      System.out.printf("£"+cantidad+" son $%.2f\n",dolar);
      System.out.printf("£"+cantidad+" son %.2f€\n",euro);
      System.out.printf("£"+cantidad+" son ¥%.2f\n",yen);
      System.out.printf("£"+cantidad+" son %.2f RMB\n",yuan);
      break;
    case "yen":
      dolar = cantidad*0.0087;
      libra = cantidad*0.0063;
      euro = cantidad*0.0075;
      yuan = cantidad*0.056;
      System.out.printf("¥"+cantidad+" son $%.2f\n",dolar);
      System.out.printf("¥"+cantidad+" son £%.2f\n",libra);
      System.out.printf("¥"+cantidad+" son %.2f€\n",euro);
      System.out.printf("¥"+cantidad+" son %.2f RMB\n",yuan);
      break;
    case "yuan":
      dolar = cantidad*0.16;
      libra = cantidad*0.11;
      yen = cantidad*17.9;
      euro = cantidad*0.13;
      System.out.printf(cantidad+" RMB son $%.2f\n",dolar);
      System.out.printf(cantidad+" RMB son £%.2f\n",libra);
      System.out.printf(cantidad+" RMB son ¥%.2f\n",yen);
      System.out.printf(cantidad+" RMB son %.2f€\n",euro);
      break;
    }
  

  }}
