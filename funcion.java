//package funcion;

import java.util.Scanner; //Aqui se importa la libreria scanner en java

public class funcion {

    
    public static double f (double x){
        //return x*x;
        double y = Math.pow(x,2);
        return y;
    }
    
    public static void main(String[] args){   
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese número: ");
        double d = Double.parseDouble(sc.nextLine());
        System.out.println(f(d));
        
        }
    }
