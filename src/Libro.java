import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Libro {

    private String codigo, titulo, editorial;
    private GregorianCalendar fechaCompra;
    private Autor autor;

    Libro ()
    {
        codigo = null;
        titulo = null;
        editorial = null;
        fechaCompra = null;
        autor = new Autor();
    }

    Libro (String vcod, String vttl, String ved, GregorianCalendar vFc, Autor vA)
    {
        codigo = vcod;
        titulo = vttl;
        editorial = ved;
        fechaCompra = vFc;
        autor = vA;
    }

    public void leer()
    {

        System.out.println("\nNuevo Libro:\nCódigo libro = ");
        codigo = Leer.dato();

        System.out.println("Título = ");
        titulo = Leer.dato();

        System.out.println("Editorial = ");
        editorial = Leer.dato();

        autor.leer();
        System.out.print("\nFecha de Compra= ");
        System.out.println("dia: ");
        int dia = Leer.datoInt();
        System.out.println("mes: ");
        int mes = Leer.datoInt();
        System.out.println("año: ");
        int año = Leer.datoInt();
        fechaCompra = new GregorianCalendar(dia, mes , año);
    }

    public void mostrar()
    {
        System.out.println("\nCódigo libro = " + codigo);
        System.out.println("Título = " + titulo);
        System.out.println("Editorial = " + editorial);
        System.out.println("Fecha de Compra: " +fechaCompra.get(Calendar.DAY_OF_MONTH) +"-"+fechaCompra.get(Calendar.MONTH) +"-"+fechaCompra.get(Calendar.YEAR));
        System.out.println("Información del Autor: ");
        autor.mostrar();
    }

    public String getCodigo()
    {
        return codigo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getEditorial()
    {
        return editorial;
    }

    public GregorianCalendar getFechaCompra()
    {
        return fechaCompra;
    }

    public Autor getAutor() {
        return autor;
    }
}
