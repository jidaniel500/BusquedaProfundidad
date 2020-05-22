package logical.evaluacion;

import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * esta clase representa la creacion inicial del programa
 */


@Service
public class Principal {

    //lista de elementos con los vertices
    int[] elementos = {100, 80, 200, 70, 90, 150, 300, 40, 76, 96, 170, 20, 50, 160, 180};
    List<Vertice> lista;
    Grafos grafo;

    public Principal() {
        this.grafo = new Grafos();
        crearMenuPrincipal();
    }

    public void buscarenProfundidad(int numerobuscado) throws Exception {
        Vertice v =  busquedaVertice(numerobuscado);
        if(v != null){
            this.grafo.busquedaporProfundidad(v);
        }
    }
    /**
     * el metodo que inicia el grafo y en donde se van a ir añadiendo todos los vertices
     */

    private  void crearMenuPrincipal() {

        try {
            for (int pos = 0; pos < elementos.length; pos++) {
                int a = elementos[pos];
                Vertice vertice = new Vertice(a);
                grafo.agregarVertice(vertice);
            }

            this.lista = grafo.getListaVertices();
            for (Vertice vert : lista) {

                if (vert.getContenido() == 100) {
                    lista.get(1);
                    vert.agregarHijo(lista.get(1));
                    vert.agregarHijo(lista.get(2));
                }
                if (vert.getContenido() == 80) {
                    vert.agregarHijo(lista.get(3));
                    vert.agregarHijo(lista.get(4));
                }
                if (vert.getContenido() == 200) {
                    vert.agregarHijo(lista.get(5));
                    vert.agregarHijo(lista.get(6));
                }
                if (vert.getContenido() == 70) {
                    vert.agregarHijo(lista.get(7));
                    vert.agregarHijo(lista.get(8));
                }
                if (vert.getContenido() == 90) {
                    vert.agregarHijo(lista.get(9));

                }
                if (vert.getContenido() == 150) {
                    vert.agregarHijo(lista.get(10));

                }
                if (vert.getContenido() == 40) {
                    vert.agregarHijo(lista.get(11));
                    vert.agregarHijo(lista.get(12));

                }
                if (vert.getContenido() == 170) {
                    vert.agregarHijo(lista.get(13));
                    vert.agregarHijo(lista.get(14));

                }

            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());

        }

    }

    private Vertice busquedaVertice(int numeroBuscado) {
        return this.grafo.getListaVertices().stream().filter(f -> f.getContenido() == numeroBuscado).findFirst().get();
    }

}
