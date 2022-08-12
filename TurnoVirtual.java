import java.nio.file.FileAlreadyExistsException;
import java.util.List;

public class TurnoVirtual {
 //ESTA CLASE NO TIENE MAIN
    
    //INSERTE LOS ATRIBUTOS
    String Turnos [];
    String TurnosPerdidos [];
    boolean EstadoTurnoVirtual = true;
    int TurnoEnAtencion = 0;
    int CantidadTurnosAtendidos= 1;

    //INSERTE EL MÉTODO CONSTRUCTOR
    public TurnoVirtual(String [] Turnos ){
        this.Turnos = Turnos;
        int cantidad = Turnos.length;
        this.TurnosPerdidos= new String[cantidad];
        for( int i= 0;  i <Turnos.length; i++){
            TurnosPerdidos[i]=" ";}
    }

    //INSERTE LOS GETTERS Y SETTERS
    public String[] getTurnos(){
        return Turnos;
    }
    public void  setTurnos(String[]Turnos){
        this.Turnos=Turnos;
    }
    public String[] getTurnosPerdidos(){
        return TurnosPerdidos;
    }
    public void  setTurnosPerdidos(String[]TurnosPerdidos){
        this.TurnosPerdidos=TurnosPerdidos;
    }
    public boolean isEstadoTurnoVirtual(){
        return EstadoTurnoVirtual;
    }
    public void  setEstadoTurnoVirtual(Boolean EstadoTurnoVirtual){
        this.EstadoTurnoVirtual=EstadoTurnoVirtual;
    }
    public int getTurnoEnAtencion(){
        return TurnoEnAtencion;
    }
    public void  setTurnoEnAtencion(int TurnoEnAtencion){
        this.TurnoEnAtencion=TurnoEnAtencion;
    }
    public int getCantidadTurnosAtendidos(){
        return CantidadTurnosAtendidos;
    }
    public void  setCantidadTurnosAtendidos(int CantidadTurnosAtendidos){
        this.CantidadTurnosAtendidos=CantidadTurnosAtendidos;
    }


    //INSERTE LOS DEMÁS MÉTODOS
    public void AtenderProximoTurno(){
            if(EstadoTurnoVirtual==true){
            TurnoEnAtencion= +1;
            CantidadTurnosAtendidos = TurnoEnAtencion + 1;
            }
        }
    public void CambiarEstadoTurno(){
            if(EstadoTurnoVirtual==true){
            EstadoTurnoVirtual= false;}
            else EstadoTurnoVirtual= true;
            
        }     
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void AgregarTurnoPerdido() {
        for (int i = 0; i < TurnosPerdidos.length; i++) {
            if (" ".equals(TurnosPerdidos[i])) {
                TurnosPerdidos[i] = Turnos[TurnoEnAtencion];
                break;
            }
        }
    }  
}

