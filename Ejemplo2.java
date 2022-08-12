/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

public class Ejemplo2 {

public static double area_rectangulo(double l, double a){
    return l * a;
}
public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    System.out.println ("Ingrese Lado");
    int l = sc.nextInt();
    System.out.println ("Ingrese el ancho");
    int a = sc.nextInt();
    System.out.println ("Area:" + area_rectangulo(l,a));
}
}
    