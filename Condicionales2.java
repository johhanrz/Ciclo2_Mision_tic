import java.util.Scanner;
public class Condicionales2 {

public static double pagofinal (int n, double precio){
    double valor;

    if (n<= 5){
    valor = n * precio; }

    else if (5 < n && n <=10) {
    valor = n *precio * 0.95;}

    else if (10 < n && n <= 20) { 
    valor = n * precio * 0.90; }

    else {
    valor = n * precio * 0.80; }
    
return valor;     
}

public static void main (String [] arg){

Scanner sc = new Scanner (System.in); 
 
int n;
double precio;

System.out.println ("Digite la cantidad");
n = sc.nextInt();

System.out.println ("Digite el precio");
precio = sc.nextDouble();

System.out.println ("El valor es:" + pagofinal(n,precio));

}
}
