package buzon;

public class Aplicacion {
    public static void main(String[] args) {

        Remitente unRemitente = new Remitente("Alex Jurado");
        Remitente unRemitente1 = new Remitente("Matias Lopez");

        Destinatario unDestinatario1 = new Destinatario("Alfredo Natalini");
        Destinatario unDestinatario2 = new Destinatario("Pedro Gimenez");
        
        Mensaje unMensaje = new Mensaje(unRemitente, unDestinatario1, "Hola Alfredo");
        Mensaje unMensaje1 = new Mensaje(unRemitente1, unDestinatario2, "Hola Pedro");
        Mensaje unMensaje2 = new Mensaje(unRemitente1, unDestinatario2, "¿Como estas?");

        Buzon unBuzon1 = new Buzon("Buzon 1");
        Buzon unBuzon2 = new Buzon("Buzon 2");

        

        unBuzon1.agregarSuscriptor(unDestinatario1);
        unBuzon2.agregarSuscriptor(unDestinatario2);

        unBuzon1.recibirMensaje(unMensaje);
        unBuzon2.recibirMensaje(unMensaje1);
        unBuzon2.recibirMensaje(unMensaje2);
        
        
        // unBuzon1.entregarMensaje(unDestinatario1);
        // unBuzon2.entregarMensaje(unDestinatario2);

        // System.out.println(unBuzon1);
        // System.out.println(unBuzon2);
        
        // System.out.println(unMensaje);

        
        // Buzon.recibirMensaje(unMensaje);
        // Buzon.recibirMensaje(unMensaje1);
        // Buzon.recibirMensaje(unMensaje2);

        // Buzon.imprimirBuzon();
        
        // Buzon.entregarMensaje(unDestinatario);

        // System.out.println(unDestinatario);

        // Buzon.entregarMensaje(unDestinatario1);

        // System.out.println(unDestinatario1);
        // Buzon.imprimirBuzon();
        
        
    }   
}