package Docente;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona
{

    protected int ci;
    protected String nombre, direccion;
    protected GregorianCalendar fechaNac;

    public Persona(int ci, String nombre, String direccion, GregorianCalendar fechaNac) {
        this.ci = ci;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    public Persona()
    {
        ci = 0;
        nombre = direccion = null;
        fechaNac = null;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public void leer()
    {
        System.out.print("ci: ");
        ci = Leer.datoInt();
        System.out.println("nombre: ");
        nombre = Leer.dato();
        System.out.println("Fecha de Nacimiento: \n\tdia:");
        int dia = Leer.datoInt();
        System.out.println("\tmes:");
        int mes = Leer.datoInt();
        System.out.println("\taño:");
        int año = Leer.datoInt();
        fechaNac = new GregorianCalendar(dia,mes,año);

        System.out.println("direccion: ");
        direccion = Leer.dato();
    }

    public void mostrar()
    {
        System.out.printf("ci: %d\nnombre: %s\nFecha de Nacimiento: %d/%d/%d\n direccion%s",
                ci, nombre, fechaNac.get(Calendar.DAY_OF_MONTH)
                , fechaNac.get(Calendar.MONTH), fechaNac.get(Calendar.YEAR), direccion);
    }
}
