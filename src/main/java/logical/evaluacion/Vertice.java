package logical.evaluacion;

import java.util.LinkedList;

/**
 * @author daniel avila
 * @version 1.0
 *
 * clase que representa el vertice de un grafo
 */

public class Vertice {


    private int contenido;
    private LinkedList<Vertice> hijos;
    private Estados estado;

    Vertice(int valorVertice) {
        this.contenido = valorVertice;
        this.hijos = new LinkedList<>();
        this.estado = Estados.NO_VISITADO;
    }

    /**
     * metodo que se encarga de agregar hijos al vertice si lo tiene
     * @param Hijo Hijo a añadir tipo vertice
     */
    public void agregarHijo(Vertice Hijo){
         hijos.add(Hijo);
    }

    /**
     * devuelve el estado de un Vertice
     * @return
     */
    public Estados getEstado() {
        return estado;
    }

    /**
     * coloca el valor de un estado en una propiedad
     * @param estado
     */

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public int getContenido() {
        return contenido;
    }

    /**
     * coloca el valor de la vaiable en el contenido
     * @param contenido
     */

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    /**
     * Obtiene los hijos de los vertices
     * @return
     */
    public LinkedList<Vertice> getHijos() {
        return hijos;
    }

    /**
     * colocar una lista completa con los hijos de los vertices
     * @param hijos
     */
    public void setHijos(LinkedList<Vertice> hijos) {
        this.hijos = hijos;
    }
}
