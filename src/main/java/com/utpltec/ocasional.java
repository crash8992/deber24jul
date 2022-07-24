package com.utpltec;

public class ocasional extends cliente {

    private int díasDejuegomes;

    public ocasional(int díasDejuegomes) {
        this.díasDejuegomes = díasDejuegomes;
    }

    public ocasional(int edad, String nombre, float horasJuego, int díasDejuegomes) {
        super(edad, nombre, horasJuego);
        this.díasDejuegomes = díasDejuegomes;
    }

    public int getDíasDejuegomes() {
        return díasDejuegomes;
    }

    public void setDíasDejuegomes(int díasDejuegomes) {
        this.díasDejuegomes = díasDejuegomes;
    }


    
    
}
