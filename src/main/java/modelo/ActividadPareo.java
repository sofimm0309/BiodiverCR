/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jimer
 */
public class ActividadPareo extends Actividad {

    private String[] izquierda;
    private String[] derecha;
    private int[] paresCorrectos;

    public ActividadPareo(String enunciado, String explicacion,
            int puntajeMax, int tiempoLimite, String[] izquierda,
            String[] derecha, int[] paresCorrectos) {
        super(enunciado, explicacion, puntajeMax, tiempoLimite);
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.paresCorrectos = paresCorrectos;
    }

    @Override
    public int evaluar(String respuesta) {
        // Estructura inicial, luego se calculará el puntaje parcial
        puntaje = 0;
        return puntaje;
    }

    @Override
    public String getTipo() {
        return "Pareo";
    }

    @Override
    public String retroalimentar() {
        return explicacion;
    }

    public String[] getIzquierda() {
        return izquierda;
    }

    public String[] getDerecha() {
        return derecha;
    }

    public int[] getParesCorrectos() {
        return paresCorrectos;
    }
}
