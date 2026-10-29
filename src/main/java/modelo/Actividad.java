/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jimer
 */
public abstract class Actividad implements Calificable {

    protected String enunciado;
    protected String explicacion;
    protected int puntajeMax;
    protected int tiempoLimite;
    protected int puntaje;

    public Actividad(String enunciado, String explicacion,
            int puntajeMax, int tiempoLimite) {
        this.enunciado = enunciado;
        this.explicacion = explicacion;
        this.puntajeMax = puntajeMax;
        this.tiempoLimite = tiempoLimite;
        this.puntaje = 0;
    }

    public abstract int evaluar(String respuesta);

    public abstract String getTipo();

    public abstract String retroalimentar();

    @Override
    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public int getPuntajeMax() {
        return puntajeMax;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }
}
