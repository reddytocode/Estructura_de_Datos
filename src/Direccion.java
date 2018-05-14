public class Direccion {
    private int numero;
    private String calle, zona, ciudad;

    public void leer()
    {
        System.out.println("Direccion:");
        System.out.println("Numero:");
        numero = Leer.datoInt();
        System.out.println("Calle:");
        calle  = Leer.dato();
        System.out.println("Zona:");
        zona = Leer.dato();
        System.out.println("Ciudad:");
        ciudad = Leer.dato();
    }

    public void mostrar()
    {
        System.out.println("Direccion:");
        System.out.println("Numero:"+numero);
        System.out.println("Calle:"+calle);
        System.out.println("Zona:"+zona);
        System.out.println("Ciudad:"+ciudad);
    }

    public int getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getZona() {
        return zona;
    }

    public String getCiudad() {
        return ciudad;
    }
}
