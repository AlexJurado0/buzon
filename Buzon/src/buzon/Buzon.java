package buzon;
import java.util.*;


public class Buzon {

    private String nombre;
    ArrayList<Mensaje> mensajes = new ArrayList<>();
    ArrayList<Destinatario> suscriptores = new ArrayList<>();

    public Buzon(String nombre){
    this.nombre = nombre;
    }

    public void recibirMensaje(Mensaje men){
        for(int i=0; i<suscriptores.size();i++){
            
            if(suscriptores.get(i).equals(men.getDestinatario())){
                suscriptores.get(i).tomarMensaje(men);
            }

            System.out.println("\n"+"Recibiendo mensaje de: " + men.getRemitente().getNombre());
            System.out.println(suscriptores.get(i));
        }
        // mensajes.add(men);
    }


    //Metodo no utilizado, utilizar en caso de que queramos que el usuario pida el mensaje
    /*
     public Destinatario entregarMensaje(Destinatario des){
        System.out.println("Mensaje/s entregado a: " + des.nombre);
        
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
    */
    
    
    public void agregarSuscriptor(Destinatario des) {
        this.suscriptores.add(des);
    }

    @Override
    public String toString() {
        String str = "-------------- " + nombre + " -------------- \n";
        for (int i = 0; i < mensajes.size(); i++) {
            str += mensajes.get(i).toString() + "\n";
            str += "----------------------------------\n";
        }
        return str;
    }
}
