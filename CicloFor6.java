
import java.util.Scanner;
public class CicloFor6 {

public static int suma (int n){
   int s= 0;
   for (int i =1; i <=n; i++){ 
    s = s + i;
 }
return s;
}

public static void main (String [] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Ingrese el valor de n: ");
    int n = sc.nextInt();
    System.out.println ("La suma de los primeros " + n + "números naturales es : ");
    System.out.println (suma(n));
    } 

}
