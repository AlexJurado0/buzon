package buzon;
public class Mensaje {
    private Remitente remitente;
    private Destinatario destinatario;
    private String texto;
    
    public Mensaje(Remitente rem, Destinatario des ,String texto){
        this.texto = texto;
        destinatario = des;
        remitente = rem;

    }
    public Destinatario getDestinatario() {
        return this.destinatario;
    }
    public void setDestinatario(Destinatario des) {
        this.destinatario = des;
    }

    public Remitente getRemitente() {
        return remitente;
    }
    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }
    public String toString() {
    
        return  "Remitente: " + remitente.nombre +"\n" + "Destinatario: " + destinatario.nombre + "\n" + "Mensaje: " + this.texto ;
    }

    
}
