import java.util.ArrayList;

import simulacionq.Estudiante;
public class Solucion {
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList<Estudiante> grupo) {
        //EN ESTE ESPACIO PONER SU LÓGICA
        ArrayList<Integer> numeros = new ArrayList<>();  
        int sum = 0;
        int x;
        for( int i=0; i<grupo.size();i++){
            numeros.add(grupo.get(i).getnota());
            sum+=i;
        }
        
        
        
    }
}