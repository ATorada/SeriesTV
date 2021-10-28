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

    private ArrayList<Serie> listaSeries;

    public ListaSeries() {
        this.listaSeries = new ArrayList<>();
    }

    public ArrayList<Serie> getListaLibros() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaLibros) {
        this.listaSeries = listaLibros;
    }

    public Serie getSerie(int p) {
        return listaSeries.get(p);
    }

    public void setSerie(Serie serie) {
        listaSeries.add(serie);
    }

    public int longitud() {
        return listaSeries.size();
    }

    public void actualizar(Serie serie, int posicion) {
        listaSeries.get(posicion).setTitulo(serie.getTitulo());
        listaSeries.get(posicion).setGenero(serie.getGenero());
        listaSeries.get(posicion).setProductores(serie.getProductores());
        listaSeries.get(posicion).setAnyo(serie.getAnyo());
        listaSeries.get(posicion).setTemporadas(serie.getTemporadas());
        listaSeries.get(posicion).setValoraciónPersonal(serie.getValoraciónPersonal());
    }

    public void eliminar(int posicion) {
        listaSeries.remove(posicion);
    }
}
