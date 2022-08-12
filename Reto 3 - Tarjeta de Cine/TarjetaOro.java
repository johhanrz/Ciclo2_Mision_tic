public class TarjetaOro extends TarjetaCine {
    //Atributos
    String  BeneficiosDescripcion []={"Boleto Gratis","Crispetas Gratis","Gaseosa Gratis"};
    boolean BeneficiosEstado []={true,true,true};


    //Constructor
    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta,nombreCompleto,email,telefono,edad,20.0);
        
    }

    //Método
    public boolean RedimirBeneficio(int posicionBeneficio){
        if(BeneficiosEstado[posicionBeneficio]==true){
        BeneficiosEstado[posicionBeneficio]=false;
        return true; }
        else
        return false;
    }

    //Getters y Setters
    public String[] getBeneficiosDescripcion() {
        return BeneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.BeneficiosDescripcion=beneficiosDescripcion;
    }

    public boolean[] isBeneficiosEstado() {
        return BeneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.BeneficiosEstado=beneficiosEstado;
    }
}
