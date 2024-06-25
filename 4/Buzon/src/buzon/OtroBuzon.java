package buzon;

import java.util.ArrayList;

public class OtroBuzon {
     static ArrayList<Destinatario> suscriptores = new ArrayList<>();
     static ArrayList<Mensaje> mensajes1 = new ArrayList<>();

     public static void recibirMensaje(Mensaje men){
        mensajes1.add(men);
    }

     public static void imprimirBuzon() {
        String str = "-------------- Buzon ------------- \n";
        for (int i = 0; i < mensajes1.size(); i++) {
            str += mensajes1.get(i).toString() + "\n";
            str += "----------------------------------\n";
        }
        
        System.out.println(str);
    }

}
    

