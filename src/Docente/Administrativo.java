package Docente;

import java.util.GregorianCalendar;

public class Administrativo extends Empleado {

    protected String cargo;

    public Administrativo(int ci, String nombre, String direccion, GregorianCalendar fechaNac, GregorianCalendar fechaIngreso, String cargo) {
        super(ci, nombre, direccion, fechaNac, fechaIngreso);
        this.cargo = cargo;
    }

    public Administrativo(GregorianCalendar fechaIngreso, String cargo) {
        super(fechaIngreso);
        this.cargo = cargo;
    }

    public Administrativo(String cargo) {
        this.cargo = cargo;
    }



}
