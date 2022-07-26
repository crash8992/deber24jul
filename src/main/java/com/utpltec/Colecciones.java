package com.utpltec;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */

    public class Colecciones 
    {
        public static void main( String[] args )
        {
            //int arreglo = new int(10)
    
            ArrayList<String> coleccionLibros = new ArrayList<>();
            
            //agregar valores a la colección
    
            coleccionLibros.add("poo introduccion");
            coleccionLibros.add("literatura");
            coleccionLibros.add("cálculo");
            // leer el arreglo
            String libro1 = coleccionLibros.get(0);
            String libro2 = coleccionLibros.get(1);
    
            System.out.println("LIBRO:" + " " + libro1);
            System.out.println("LIBRO" + " " + libro2 );
    
            //recorrer completo
            System.out.println("recorrer dinámica");
            for (int i = 0; i < coleccionLibros.size(); i++) {
                String libro = coleccionLibros.get(i);
                System.out.println("LIBRO" + " " + libro);
     
            }
    
          
        }
    }



