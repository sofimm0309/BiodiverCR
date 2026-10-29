/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class PreguntaVerdaderoFalso extends Actividad {

    private boolean correcta;

    public PreguntaVerdaderoFalso(String enunciado, String explicacion,
            int puntajeMax, int tiempoLimite, boolean correcta) {
        super(enunciado, explicacion, puntajeMax, tiempoLimite);
        this.correcta = correcta;
    }

    @Override
    public int evaluar(String respuesta) {
        // Estructura inicial, falta completar la calificación
        puntaje = 0;
        return puntaje;
    }

    @Override
    public String getTipo() {
        return "Verdadero/Falso";
    }

    @Override
    public String retroalimentar() {
        return explicacion;
    }

    public boolean isCorrecta() {
        return correcta;
    }
}
