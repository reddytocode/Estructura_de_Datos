package Docente;

import java.util.GregorianCalendar;

public class Docente extends Empleado {

    protected int numeroHoras;
    protected String categoria;

    public Docente(int ci, String nombre, String direccion, GregorianCalendar fechaNac, GregorianCalendar fechaIngreso, int numeroHoras, String categoria) {
        super(ci, nombre, direccion, fechaNac, fechaIngreso);
        this.numeroHoras = numeroHoras;
        this.categoria = categoria;
    }

    public Docente(GregorianCalendar fechaIngreso, int numeroHoras, String categoria) {
        super(fechaIngreso);
        this.numeroHoras = numeroHoras;
        this.categoria = categoria;
    }

    public Docente(int numeroHoras, String categoria) {
        this.numeroHoras = numeroHoras;
        this.categoria = categoria;
    }


}
