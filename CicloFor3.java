/*
CUANTOS NUMEROS ENTRE EL 0 Y EL 10000 SON MULTIPLOS DE 20 
 */
package ciclofor1;
public class CicloFor3 {

public static void main(String [] arg){
int contador = 0;

for (int i= 0 ; i<= 10000; i++){

    if (i%20 == 0){
    contador++;
                   }
        }
System.out.println (contador);

}
}
