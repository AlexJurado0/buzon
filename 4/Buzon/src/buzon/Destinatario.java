package buzon;
import java.util.*;

public class Destinatario extends Persona {
    
    ArrayList<Mensaje> mensajes = new ArrayList<>();
    ArrayList<Destinatario> destinatarios = new ArrayList<>();
    boolean suscripto;
    public Destinatario (String nombre,boolean suscripto){
        super(nombre);
        this.suscripto = suscripto;
    }    

    public void almacenarDestinatarios(Destinatario des){
        destinatarios.add(des);
    }

    public void tomarMensaje(Mensaje men){
        mensajes.add(men);
    }

    public String toString(){
        String str="\nDestinatario ---------\n";
        str += this.getNombre()+"\n";
        for(int i=0 ; i<mensajes.size() ; i++){
            str += mensajes.get(i).toString();
        }
        return str;
    }

    
}
