package buzon;
import java.util.*;

public class Buzon {
    
    static Mensaje mensaje;
    static Remitente remitente;
    static Destinatario destinatario;
    static ArrayList<Mensaje> mensajes = new ArrayList<>();
    static ArrayList<Destinatario> suscriptores = new ArrayList<>();

    public static void recibirMensaje(Mensaje men){
        System.out.println("Recibiendo mensaje de: " + men.getRemitente().getNombre());
        mensajes.add(men);
    }

    
    public static Destinatario entregarMensaje(Destinatario des){
        System.out.println("Mensaje entregado a: " + des.nombre);
        
        for (int i = 0; i < mensajes.size(); i++) {
            Mensaje mensajeActual = mensajes.get(i);
            if (mensajeActual.getDestinatario().equals(des)) {
                des.tomarMensaje(mensajeActual);
                des.almacenarDestinatarios(des);
                mensajes.remove(i);
                i--; 
            }
        }
        return des;
    }

    public static void suscriptoresBuzon(Destinatario des){
        for(int i=0; i<destinatario.destinatarios.size() ; i++){
            if(destinatario.suscripto == true){
                suscriptores.add(des);
            }if(destinatario.suscripto == false){
                OtroBuzon.suscriptores.add(des);
            }
        }  
    }

    public static void imprimirBuzon() {
        String str = "-------------- Buzon ------------- \n";
        for (int i = 0; i < mensajes.size(); i++) {
            str += mensajes.get(i).toString() + "\n";
            str += "----------------------------------\n";
        }
        
        System.out.println(str);
    }
}
