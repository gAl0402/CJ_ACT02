package calificaciones;
import java.util.*;
/**
 *
 * @author galic
 */
//clase calificaciones
public class Calificaciones {
    //atributos
    String nombre = "";
    int[] calificaciones =  {100,100,90,100,90}; //new int[5];
    float promedio;
    char calificacionFinal;
    
    //METODOS
    //metodo para calcular el promedio
    public float calculaPromedio()
    {
        int suma = 0;
        for(int i=0; i<calificaciones.length; i++)
        {
            suma += calificaciones[i];       
        }
        promedio = (suma/calificaciones.length);
        return promedio;    
    }   
    //metodo para asignar calificacion final con letras
    public char regresaLetra()
    {
        
        if (promedio <= 50)
        {
            calificacionFinal = 'F';
        }
        else if (promedio <= 60)
        {
            calificacionFinal = 'E';
        }
        else if (promedio <= 70)
        {
            calificacionFinal = 'D';
        }
        else if (promedio <= 80)
        {
            calificacionFinal = 'C';
        }
        else if (promedio <= 90)
        {
            calificacionFinal = 'B';
        }
        else 
        {
            calificacionFinal = 'A';
        }
    return calificacionFinal;
    }
    //metodo para imprimir en pantalla los resultados del programa
    public void imprimirResultados()
    {
        System.out.println("CALIFICACIONES TECMILENIO");
        System.out.println("Nombre del Alumno: " + nombre);
        for(int i = 0; i<5; i++)
        {
            System.out.println("Calificacion " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio Final: " + promedio);
        System.out.println("Calificacion Final: " + calificacionFinal);   
    }        
        
}
