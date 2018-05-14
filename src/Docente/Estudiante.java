package Docente;

import java.util.GregorianCalendar;

public class Estudiante extends Persona {
    protected String carrera;
    protected int semestreingreso;

    public Estudiante(int ci, String nombre, String direccion, GregorianCalendar fechaNac, String carrera, int semestreingreso) {
        super(ci, nombre, direccion, fechaNac);
        this.carrera = carrera;
        this.semestreingreso = semestreingreso;
    }

    public Estudiante(String carrera, int semestreingreso) {
        this.carrera = carrera;
        this.semestreingreso = semestreingreso;
    }



}
