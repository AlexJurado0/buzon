import java.time.format.SignStyle;
import java.util.ArrayList;

public interface Aplicacion {
    public static void main(String[] args) {
        Perro Perro_1 = new Perro("Miguel",7);
        Perro Perro_2 = new Perro("Oscar",5);
        Perro Perro_3 = new Perro("Daniel", 13);

        ArrayList<Perro> manada = new ArrayList<Perro>();

        manada.add(Perro_1);
        manada.add(Perro_2);
        manada.add(Perro_3);

        System.out.println("Son en total: "+manada.size()+" Perros");
        System.out.println("Los perros en la casa son: ");
        for(int i=0; i<manada.size(); i++){
            System.out.println(manada.get(i));
        }
    }
}
