/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jimer
 */
public class PreguntaSeleccionUnica extends Actividad {

    private String[] opciones;
    private int indiceCorrecto;

    public PreguntaSeleccionUnica(String enunciado, String explicacion,
            int puntajeMax, int tiempoLimite, String[] opciones,
            int indiceCorrecto) {
        super(enunciado, explicacion, puntajeMax, tiempoLimite);
        this.opciones = opciones;
        this.indiceCorrecto = indiceCorrecto;
    }

    @Override
    public int evaluar(String respuesta) {
        // Estructura inicial, falta completar la calificación
        puntaje = 0;
        return puntaje;
    }

    @Override
    public String getTipo() {
        return "Selección única";
    }

    @Override
    public String retroalimentar() {
        return explicacion;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public int getIndiceCorrecto() {
        return indiceCorrecto;
    }
}
