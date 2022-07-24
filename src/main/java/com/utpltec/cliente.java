package com.utpltec;

/**
 * Hello world!
 *
 */
public class cliente
{

    private int edad;
    private String nombre;
    private double horasJuego;

    public cliente() {
    }

    public cliente(int edad, String nombre, float horasJuego) {
        this.edad = edad;
        this.nombre = nombre;
        this.horasJuego = horasJuego;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHorasJuego() {
        return horasJuego;
    }

    public void setHorasJuego(float horasJuego) {
        this.horasJuego = horasJuego;
    }


    public static void main( String[] args )
    {
        
    
    if (horasJuego >=4) {
        System.out.println("Ganaste 1 hora adicional");
        
    }else{
        System.out.println("perdiste 1 hora gratis");
    }

    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
}
