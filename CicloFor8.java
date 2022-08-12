/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lumaj
 */

public class CicloFor8 {

public static void main (String [] arg){
String [] frutas = new String [] {"Lulo", "Maracuya", "Guayaba", "Lulo", "Granadilla"};
int sum = 0;
int x;
for (String f:frutas){
    System.out.println (f); 
    if (f.equals ("Lulo")){
        x=6000;
        sum+=x; }
    else if(f.equals ("Guayaba")){
        x=3000;
        sum+=x; }
                    }
                    System.out.println("Array Sum = "+sum);
}

}
