/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calificaciones;
import java.util.*;


/**
 *
 * @author jccar
 */

public class EjemploCalificaciones {
    String nombre = "";
    int[] calif= new int [5];
    
    public static void main (String [] args) {
        
        String capturaNombre="";
        float promedioResult=0;
        char califNota=' ';
        
        Calificaciones pCalculoCalif = new Calificaciones();
        System.out.print("Calificaciones Universidad TEcmilenio\n");
        
        Scanner s= new Scanner (System.in);
        System.out.print("Nombre del Alumno:  ");
        capturaNombre=s.next();
        pCalculoCalif.setNombre (capturaNombre);
        
        pCalculoCalif.setCalificaciones();
        promedioResult =pCalculoCalif.promedioCal();
        
        Calificaciones pCalculoNota = new Calificaciones();
        califNota = pCalculoNota.calificacion(promedioResult);
        System.out.print("Tu calificacion es: " +califNota + "\n");
        
    }

          
    }

    

