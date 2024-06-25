
public class Profesor {

    String nombre;
    String apellido;
    int edad;
    boolean casado;

    public Profesor(String nombre, String apellido, int edad, boolean casado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setCasado(boolean casado) {
        this.casado = casado;
    }
    public boolean setCasado() {
        return casado;
    }

    @Override
    public String toString() {
        String tpm;
        if(casado){
            tpm = "Si";
        }else{
            tpm = "No";
        }
        return "Nombre: " + nombre +" Apellido: " + apellido +" Edad: " + edad + " Casado: " + tpm; 
    }
}
