/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificaciones;
import java.util.*;


/**
 *
 * @author jccar
 */
public class Calificaciones {
    
    String nombre = "";
    int[] calif= new int [5];
            


            public float promedioCal(){
                float promedio=0;
                int suma=0;
                
                for (int i=0; i<calif.length; i++) {
                    suma+=calif[i];
}

promedio=(suma/calif.length);

System.out.println("Promedio: " +promedio);
return promedio;

                }
            
            public char calificacion (float pPromedio) {
                char nota =' ';
                
      if(pPromedio >=51.00 && pPromedio <=60) nota = 'E';
      else if(pPromedio >=61.00 && pPromedio <=70) nota = 'D';
      else if(pPromedio >=71.00 && pPromedio <=80) nota = 'C';
      else if(pPromedio >=81.00 && pPromedio <=90) nota = 'B';
      else if(pPromedio >=91.00 && pPromedio <=100) nota = 'A';
      else nota = 'F';
      
     
                return nota;
}

  
            public void imprimeCalificaciones(float pPromedio, char pNota) {

            
             System.out.println("cALIFICACION: " +pNota);
}; 
            public void setNombre (String pNombre) {
                nombre= pNombre;
            }
            
            public void setCalificaciones()
            {
                Scanner s= new Scanner (System.in);
                
                System.out.print ("Calificacion 1:  ");
                calif[0]=s.nextInt();
                
                System.out.print ("Calificacion 2:  ");
                calif[1]=s.nextInt();
                
                System.out.print ("Calificacion 3:  ");
                calif[2]=s.nextInt();
                
                System.out.print ("Calificacion 4:  ");
                calif[3]=s.nextInt();
                
                System.out.print ("Calificacion 5:  ");
                calif[4]=s.nextInt();
                
            }
            }

