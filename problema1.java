import java.util.Scanner;

public class problema1 {
    public static double funcion1(double N, double M,double K){
        return (N*6)+(M*7)+(K*1);
    }
        
        public static void main (String [] args){
            Scanner sc= new Scanner (System.in);
            System.out.println ("Ingrese cantidad de GALLINAS");
            int N = sc.nextInt();
            System.out.println ("Ingrese cantidad de GALLOS");
            int M = sc.nextInt();
            System.out.println ("Ingrese cantidad de POLLITOS");
            int K = sc.nextInt();
            System.out.println ("carnes de aves:" + funcion1(N,M,K));}
    
}
