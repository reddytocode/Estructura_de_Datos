package Docente;

import java.util.GregorianCalendar;

public class Empleado extends Persona{

    protected GregorianCalendar fechaIngreso;

    public Empleado(int ci, String nombre, String direccion, GregorianCalendar fechaNac, GregorianCalendar fechaIngreso) {
        super(ci, nombre, direccion, fechaNac);
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado()
    {
        super();
        fechaIngreso = null;
    }

    public void leer()
    {

   }
}
