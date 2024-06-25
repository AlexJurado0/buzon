public class Aplicacion {
    public static void main(String args[]) {
        Profesor Unprofesor = new Profesor("Alex", "Jurado", 20, false);
        
        System.out.println(Unprofesor);

        Alumno UnAlumno = (Alumno) Unprofesor;
        System.out.println(UnAlumno);



        
    }
}

