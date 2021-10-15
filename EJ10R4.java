import java.util.Scanner;
public class EJ10R4 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

  /*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
  nacimiento.
    */
System.out.print("Dime tu mes y día de nacimiento (separado por espacios): ");
  int mes = s.nextInt();
  int dia = s.nextInt();
  
  
  if ((mes == 3) && (dia >= 21)) {
    System.out.println("Eres Aries.");
  } else {
    if ((mes == 4) && (dia < 21)) {
    System.out.println("Eres Aries.");
  } else {
    if ((mes == 4) && (dia >= 21)) {
    System.out.println("Eres Tauro.");
  } else {
    if ((mes == 5) && (dia < 21)) {
    System.out.println("Eres Tauro.");
  } else {
    if ((mes == 5) && (dia >= 21)) {
    System.out.println("Eres Géminis.");
  } else {
    if ((mes == 6) && (dia < 22)) {
    System.out.println("Eres Géminis.");
  } else {
    if ((mes == 6) && (dia >= 22)) {
    System.out.println("Eres Cáncer.");
  } else {
    if ((mes == 7) && (dia < 23)) {
    System.out.println("Eres Cáncer.");
  } else {
    if ((mes == 7) && (dia >= 23)) {
    System.out.println("Eres Leo.");
  } else {
    if ((mes == 8) && (dia < 23)) {
    System.out.println("Eres Leo.");
  } else {
    if ((mes == 8) && (dia >= 23)) {
    System.out.println("Eres Virgo.");
  } else {
    if ((mes == 9) && (dia < 23)) {
    System.out.println("Eres Virgo.");
  } else {
    if ((mes == 9) && (dia >= 23)) {
    System.out.println("Eres Libra.");
  } else {
    if ((mes == 10) && (dia < 23)) {
    System.out.println("Eres Libra.");
  } else {
    if ((mes == 10) && (dia >= 23)) {
    System.out.println("Eres Escorpio.");
  } else {
    if ((mes == 11) && (dia < 23)) {
    System.out.println("Eres Escorpio.");
  } else {
    if ((mes == 11) && (dia >= 23)) {
    System.out.println("Eres Sagitario.");
  } else {
    if ((mes == 12) && (dia < 22)) {
    System.out.println("Eres Sagitario.");
  } else {
    if ((mes == 12) && (dia >= 22)) {
    System.out.println("Eres Capricornio.");
  } else {
    if ((mes == 1) && (dia < 21)) {
    System.out.println("Eres Capricornio.");
  } else {
    if ((mes == 1) && (dia >= 21)) {
    System.out.println("Eres Acuario.");
  } else {
    if ((mes == 2) && (dia < 19)) {
    System.out.println("Eres Acuario.");
  } else {
    if ((mes == 2) && (dia >= 19)) {
    System.out.println("Eres Piscis.");
  } else {
    System.out.println("Eres Piscis.");
  }}}}}}}}}}}}}}}}}}}}}}}}}
