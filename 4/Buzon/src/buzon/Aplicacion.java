package buzon;

public class Aplicacion {
    public static void main(String[] args) {

        Remitente unRemitente = new Remitente("Alex Jurado");
        Remitente unRemitente1 = new Remitente("Matias Lopez");

        Destinatario unDestinatario = new Destinatario("Alfredo Natalini",true);
        Destinatario unDestinatario1 = new Destinatario("Pedro Gimenez",false);
        
        Mensaje unMensaje = new Mensaje(unRemitente, unDestinatario, "Hola Alfredo");
        Mensaje unMensaje1 = new Mensaje(unRemitente1, unDestinatario1, "Hola Pedro");
        Mensaje unMensaje2 = new Mensaje(unRemitente1, unDestinatario1, "¿Como estas?");

        // System.out.println(unMensaje);

        
        Buzon.recibirMensaje(unMensaje);
        Buzon.recibirMensaje(unMensaje1);
        Buzon.recibirMensaje(unMensaje2);

        


        // Buzon.imprimirBuzon();
        
        Buzon.entregarMensaje(unDestinatario);

        // System.out.println(unDestinatario);

        Buzon.entregarMensaje(unDestinatario1);

        // System.out.println(unDestinatario1);
        Buzon.imprimirBuzon();
        
        
    }   
}