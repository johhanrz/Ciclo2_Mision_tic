public class TarjetaPlata extends TarjetaCine {
    //Atributos
    int CantidadVisitas=0;
    boolean ElegibleOro=false;

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta,nombreCompleto,email,telefono,edad,10.0);
        


    }

    //Método
    @Override
    public double pagar(String[] cuenta){
        int sum = 0;
        int x;
        int total;
        for( String i:cuenta){
            if(i.equals ("Boleta")){
            x=6000;
            sum+=x; }
        else if(i.equals ("Combo 1 - Crispetas + Gaseosa")){
            x=8000;
            sum+=x; }
        else if(i.equals ("Combo 2 - Perro + Gaseosa")){
            x=12000;
            sum+=x; }
        }
        total = sum;
        CantidadVisitas = CantidadVisitas +1;
        if(CantidadVisitas>=5){
            ElegibleOro=true;}
        
        return total * (1 - porcentajeDescuento / 100);
        
     
    }

    //Getters y Setters
    public int getCantidadVisitas() {
     return CantidadVisitas;   
    }

    public void setCantidadVisitas(int CantidadVisitas) {
        this.CantidadVisitas=CantidadVisitas;
    }

    public boolean isElegibleOro() {
        return ElegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.ElegibleOro=elegibleOro;
        
    }
}