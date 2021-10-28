package Modelo;

import java.io.Serializable;
import java.util.ArrayList;

/*
*
* ListaSeries.java
*
* Creada el 20 oct 2021​, 13:06:10
*
* Desarrollada por Ángel Torada ​​en la empresa IES El Grao​ el día 20 oct 2021
*
* Puede contactar conmigo en ​10571674@ieselgrao.org
*

/**
 *
 * @autor Ángel Torada
 * @version 1.0
 * @date 20 oct 2021
 */
public class ListaSeries implements Serializable {

    //Variable ArrayList que contendrá la Lista de las series
    private ArrayList<Serie> listaSeries;

    //Constructor para instanciar la clase
    public ListaSeries() {
        this.listaSeries = new ArrayList<>();
    }

    //Getter y Setter
    public ArrayList<Serie> getListaLibros() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaLibros) {
        this.listaSeries = listaLibros;
    }

    //Obtiene la serie según la posición pasada por parámetro
    public Serie getSerie(int p) {
        return listaSeries.get(p);
    }

    //Añade la serie a la lista pasada por parámetro
    public void setSerie(Serie serie) {
        listaSeries.add(serie);
    }

    //Devuelve la longitud, es decir, la cantidad de series almacenadas en el ArrayList.
    public int longitud() {
        return listaSeries.size();
    }

    //Método que se encarga de actualizar los datos de una serie
    public void actualizar(Serie serie, int posicion) {
        listaSeries.get(posicion).setTitulo(serie.getTitulo());
        listaSeries.get(posicion).setGenero(serie.getGenero());
        listaSeries.get(posicion).setProductores(serie.getProductores());
        listaSeries.get(posicion).setAnyo(serie.getAnyo());
        listaSeries.get(posicion).setTemporadas(serie.getTemporadas());
        listaSeries.get(posicion).setValoraciónPersonal(serie.getValoraciónPersonal());
    }

    //Método que se encarga de eliminar una serie
    public void eliminar(int posicion) {
        listaSeries.remove(posicion);
    }
}
