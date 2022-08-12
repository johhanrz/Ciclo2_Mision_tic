
public class TarjetaCine {
    //Atributos
    String idTarjeta;
    String nombreCompleto;
    String email;
    String telefono;
    int edad;
    double porcentajeDescuento;

    //Constructor
    public TarjetaCine(String idTarjeta, String nombreCompleto, String email, String telefono, int edad, double porcentajeDescuento) {
        this.idTarjeta= idTarjeta;
        this.nombreCompleto=nombreCompleto;
        this.email=email;
        this.telefono=telefono;
        this.edad=edad;
        this.porcentajeDescuento=porcentajeDescuento;
    
    }

    //Método
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
        
      return total * (1 - porcentajeDescuento / 100); 
    }

    //Getters y Setters
    public String getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(String idTarjeta) {
        this.idTarjeta=idTarjeta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto=nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento=porcentajeDescuento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono=telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }
}
