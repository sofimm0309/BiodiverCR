/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jimer
 */
import java.util.ArrayList;

public class Capitulo implements Calificable {

    private String titulo;
    private String texto;
    private String rutaImagen;
    private ArrayList<Actividad> actividades;

    public Capitulo(String titulo, String texto, String rutaImagen) {
        this.titulo = titulo;
        this.texto = texto;
        this.rutaImagen = rutaImagen;
        actividades = new ArrayList<Actividad>();
    }

    public int getPuntaje() {
        int total = 0;

        for (int i = 0; i < actividades.size(); i++) {
            total = total + actividades.get(i).getPuntaje();
        }

        return total;
    }

    public int getPuntajeMax() {
        int total = 0;

        for (int i = 0; i < actividades.size(); i++) {
            total = total + actividades.get(i).getPuntajeMax();
        }

        return total;
    }

    public int getProgreso() {
        // Por ahora se deja como estructura inicial
        return 0;
    }

    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }
}
