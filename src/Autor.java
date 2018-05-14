public class Autor {

    private String ci, nombre;
    private Direccion direccion;

    public Autor() {
        ci = nombre = null;
        direccion = new Direccion();
    }

    public Autor (String vc, String vn, Direccion vd)
    {
        ci = vc;
        nombre = vn;
        direccion = vd;
    }

    public void leer()
    {
        System.out.println("Ci:");
        ci = Leer.dato();
        System.out.println("Nombre Autor: ");
        nombre = Leer.dato();
        System.out.println("Dirección Autor:");
        direccion.leer();
    }

    public void mostrar()
    {
        System.out.println("Ci" + ci);
        System.out.println("Nombre Autor: " + nombre);
        System.out.println("Dirección Autor: " + direccion);
        direccion.mostrar();
    }

    public String getCi() {
        return ci;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }
}

