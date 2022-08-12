public class Solution {
    //ESTA CLASE NO TIENE MAIN
    public static void main(String[] args){
        int lista[]= {1,6,62,4,7,90,55,109,2,5};
        reporte(lista);
       }
    public static  int [] reporte(int [] participantes){
        int larg = (participantes.length);
        int maxi = participantes[0];
        int mini = participantes[0];
        for( int i :participantes){
            if(i>maxi)
            maxi=i;
        }
        for (int j:participantes){
            if(j<mini)
            mini=j;
        }
        int [] resultado = {larg,maxi,mini};
        
        return resultado;     
        
    


    }
}