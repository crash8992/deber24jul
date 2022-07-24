package com.utpltec;

public abstract class frecuente extends cliente {
    
    private int gastoEnhoras;
    private String díaJuego;
    
    public frecuente(int gastoEnhoras, String díaJuego) {
        this.gastoEnhoras = gastoEnhoras;
        this.díaJuego = díaJuego;
    }
    public frecuente(int edad, String nombre, float horasJuego, int gastoEnhoras, String díaJuego) {
        super(edad, nombre, horasJuego);
        this.gastoEnhoras = gastoEnhoras;
        this.díaJuego = díaJuego;
    }
    public int getGastoEnhoras() {
        return gastoEnhoras;
    }
    public void setGastoEnhoras(int gastoEnhoras) {
        this.gastoEnhoras = gastoEnhoras;
    }
    public String getDíaJuego() {
        return díaJuego;
    }
    public void setDíaJuego(String díaJuego) {
        this.díaJuego = díaJuego;
    }


  
}
  
    


