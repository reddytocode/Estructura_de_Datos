package Docente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer
{
    // cadenas
    public static String dato()
    {
        String sdato = "";
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);

            sdato = flujoE.readLine();
        }
        catch(IOException e)
        {
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    // enteros cortos
    public static short datoShort()
    {
        try
        {
            return Short.parseShort(dato());
        }
        catch(NumberFormatException e)
        {
            return Short.MIN_VALUE;
        }
    }

    // enteros
    public static int datoInt()
    {
        try
        {
            return Integer.parseInt(dato());
        }
        catch(NumberFormatException e)
        {
            return Integer.MIN_VALUE;
        }
    }

    // enteros largos
    public static long datoLong()
    {
        try
        {
            return Long.parseLong(dato());
        }
        catch(NumberFormatException e)
        {
            return Long.MIN_VALUE;
        }
    }

    //flotantes
    public static float datoFloat()
    {
        try
        {
            Float f = new Float(dato());
            return f.floatValue();
        }
        catch(NumberFormatException e)
        {
            return Float.NaN;
        }
    }

    //doble flotante o flotante largo
    public static double datoDouble()
    {
        try
        {
            Double d = new Double(dato());
            return d.doubleValue();
        }
        catch(NumberFormatException e)
        {
            return Double.NaN;
        }
    }
}


