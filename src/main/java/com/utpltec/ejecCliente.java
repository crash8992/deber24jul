package com.utpltec;

import java.util.Scanner;

public class ejecCliente {

    private static int edad;

    public static void main(String[]args){
    
    cliente cliente1 = new cliente();
    cliente cliente2 = new cliente(19, "Carlos", 6);

    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese edad cliente 1");
    edad = leer.nextInt();
    System.out.println("ingrese nombre cliente");


        System.out.println("el nombre del cliente es:" + " " + cliente2.getNombre());
        System.out.println("el nombre es:" + " " + cliente2.getNombre());
        System.out.println("la edad es:" + " " + cliente2.getEdad());




        

    }

}
