package logical.evaluacion;

import org.springframework.stereotype.Component;

import java.util.*;


/**
 * @author daniel avila
 * @version 1.0
 * <p>
 * esta clase Representa el conjunto de vertices o sea el grafo en su totalidad
 */

@Component
public class Grafos {
    private LinkedList<Vertice> listaVertices;
    LinkedList<Vertice> pila = new LinkedList<>();
    LinkedList<Vertice> visitados = new LinkedList<>();


    /**
     * constructor de la clase
     */
    public Grafos() {
        try {
            listaVertices = new LinkedList<>();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    /**
     * 
     * @param numero indica el metodo para buscar el vertice inicial para iniciar el algoritmo
     * @return retorna el vertice encontrado y nulo si no encuentra ningun verttice 
     */
    public Vertice buscarIndiceInicial(int numero) {
        Optional<Vertice> encontrado = listaVertices.stream().filter(d -> d.getContenido() == numero).findFirst();
        return encontrado.get();

    }
    /**
     * este metodo agrega un nuevo vertice en el array de los vertices del Grafo
     * @param vertice este parametro es el vertice a añadir 
     * 
     */

    public void agregarVertice(Vertice vertice) {
        this.listaVertices.add(vertice);
    }

    /**
     * elimina vertice de la lista de vertices del grafo
     * @param vertice
     */
    public void eliminarVertice(Vertice vertice) {
        this.listaVertices.remove(vertice);
    }

    /**
     * setter de la lista de los vertices ya que la propiedad es privada
     *
     * @param listaVertices
     */
    public void setListaVertices(LinkedList listaVertices) {
        this.listaVertices = listaVertices;
    }

    public LinkedList<Vertice> getListaVertices() {
        return listaVertices;
    }


    /**
     * este metodo realiza la busqueda por profundidad recorre cada uno de los vertices que estan en la lista, posteriormente validar  los
     * nodos con un ciclo, si ya ha sido recorrido el nodo lo marca con estado visitado, todos los nodos inicialmente estan en estado NO_VISITADO
     * este metodo 
     *
     * @param vert del nodo inicial por donde va a recorrer el grafo
     * @throws Exception
     */
    public void busquedaporProfundidad(Vertice vert) throws Exception {

        try {

            if (vert != null) {
                pila.add(vert);
                while (!pila.isEmpty()) {
                    Vertice actual = pila.pop();
                    System.out.println(actual.getContenido());

                    if (actual.getEstado() == Estados.NO_VISITADO) {
                        visitados.add(actual);
                        actual.setEstado(Estados.VISITADO);
                        actual.getHijos().forEach(hijo -> {
                            if (hijo.getEstado() == Estados.NO_VISITADO) {

                                pila.add(hijo);
                                try {
                                    busquedaporProfundidad(hijo);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        });

                    }

                }
            }

        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
