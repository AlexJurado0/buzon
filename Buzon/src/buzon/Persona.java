package buzon;
public class Persona  {
    public String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    
    public String toString() {
        return nombre;
    }
   
    public boolean equals(Object obj) {
        Persona per = (Persona) obj;

        return per.nombre == this.nombre;
    }
}