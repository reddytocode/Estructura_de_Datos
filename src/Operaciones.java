import java.util.GregorianCalendar;
import java.util.Calendar;

public class Operaciones {
    private Libro v[];

    public void leer()
    {
        System.out.println("tamaño de Vector:");
        int tamVec = Leer.datoInt();
         v = new Libro[tamVec];
         for (int i = 0; i<v.length; i++)
         {
             v[i] = new Libro();
             v[i].leer();
         }
    }

    public void mostrar()
    {
        for (int i = 0; i<v.length; i++)
        {
            v[i].mostrar();
        }
    }

    public void nombreAutor(String aut)
    {
        for (int i = 0; i<v.length; i++)
        {
            if(v[i].getAutor().getNombre().equals(aut))
            {
                System.out.println("Codigo: "+ v[i].getCodigo());
                System.out.println("Titulo "+ v[i].getTitulo());
            }
        }
    }

    public int autoresCiudad(String ciudad)
    {
        int contador = 0;
        for (int i = 0; i<v.length; i++)
        {
            if(ciudad.equals(v[i].getAutor().getDireccion().getCiudad()))
            {
                contador++;
            }
        }
        return contador;
    }

    public void fechaMasAntigua()
    {
        int fechaAntigua;

        Libro aux;
        for (int i = 1; i < v.length; i ++)
        {
            for (int j = 0; j < v.length-i; j ++)
            {
                if(v[j].getFechaCompra().after(v[j+1].getFechaCompra()))
                {
                    aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }

        for(int i = 0; i<v.length;i++)
        {
            if(v[0].getFechaCompra().equals(v[i].getFechaCompra()))
            {
                System.out.println("Codigo: "+ v[i].getCodigo());
                System.out.println("Titulo "+ v[i].getTitulo());
            }

        }

    }
}
