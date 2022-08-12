import java.util.Scanner;
public class Condicionales1 {

    public static double  max (double a, double b){
    
    if (a>b){
    return a;}
    else {
    return b;}
    }
    
    public static void main (String [] args){
    Scanner sc= new Scanner (System.in);
    double a;
    double b;
    System.out.println ("Digite el número 1");
    a = sc.nextDouble();

    System.out.println ("Digite el número 2");
    b = sc.nextDouble();
    
    System.out.println ("El número maximo es : " + max(a,b));

}

}