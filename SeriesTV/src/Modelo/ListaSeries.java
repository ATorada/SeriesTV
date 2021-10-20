package Modelo;

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
public class ListaSeries {

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

    public void setSerie(Serie libro) {
        listaSeries.add(libro);
    }

    public int longitud() {
        return listaSeries.size();
    }

    public void actualizar(Serie libro, int posicion) {
        listaSeries.get(posicion).setTitulo(libro.getTitulo());
        listaSeries.get(posicion).setGenero(libro.getGenero());
        listaSeries.get(posicion).setProductores(libro.getProductores());
        listaSeries.get(posicion).setAnyo(libro.getAnyo());
        listaSeries.get(posicion).setTemporadas(libro.getTemporadas());
        listaSeries.get(posicion).setValoraciónPersonal(libro.getValoraciónPersonal());
    }

    public void eliminar(int posicion) {
        listaSeries.remove(posicion);
    }
}
