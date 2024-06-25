class Perro{
    String nombre;
    int edad;

    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean equals(Object o){
        Perro unPerro = (Perro) o;
        boolean A = unPerro.nombre == this.nombre 
        && unPerro.edad == this.edad;
        return A;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad;
    }
}