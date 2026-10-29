/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author jimer
 */
import java.util.ArrayList;
import modelo.Actividad;
import modelo.Capitulo;
import modelo.Temporizador;
import vista.VentanaPrincipal;

public class ControladorLibro {

    private ArrayList<Capitulo> capitulos;
    private int[][] puntajes;
    private VentanaPrincipal ventana;
    private Temporizador temporizador;

    public ControladorLibro() {
        capitulos = new ArrayList<Capitulo>();
        puntajes = new int[4][3];
        temporizador = new Temporizador(0);
    }

    public void iniciar() {
        // Aquí se preparará el inicio del libro y se mostrará el menú
    }

    public String responder(String respuesta) {
        // El controlador recorrerá las actividades y usará evaluar()
        return "";
    }

    public int calcularTotal() {
        int total = 0;

        for (int i = 0; i < capitulos.size(); i++) {
            total = total + capitulos.get(i).getPuntaje();
        }

        return total;
    }

    public void volverAlMenu() {
        // Se solicitará a la vista mostrar el menú principal
    }

    public void agregarCapitulo(Capitulo capitulo) {
        capitulos.add(capitulo);
    }

    public ArrayList<Capitulo> getCapitulos() {
        return capitulos;
    }

    public int[][] getPuntajes() {
        return puntajes;
    }
}


