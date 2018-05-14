import java.util.GregorianCalendar;

public class Main {
    public static void main (String [] args)
    {

        Operaciones op = new Operaciones();
        op.leer();
        op.mostrar();
        System.out.println("\nBuscar nombre Autor:");
        String aut = Leer.dato();
        op.nombreAutor(aut);
        System.out.println("\nBuscar autor de Ciudad:");
        String ciudad = Leer.dato();
        System.out.println(op.autoresCiudad(ciudad));
        op.fechaMasAntigua();

    }
}
