package Controlador;

import Modelo.Acceso;
import Modelo.ListaSeries;
import Modelo.Serie;
import java.io.File;

/*
*
* Controlador.java
*
* Creada el 20 oct 2021​, 13:18:35
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
public class Controlador {

    private int posicion;
    private ListaSeries lista;

    public Controlador() {
        posicion = 0;
        lista = new ListaSeries();
        lista = Acceso.cargarLista();
    }

    public int getPosicion() {
        return posicion;
    }

    public Serie primero() {

        posicion = 0;
        return lista.getSerie(posicion);
    }

    public Serie anterior() {
        if (posicion > 0) {
            posicion--;
        }
        return lista.getSerie(posicion);
    }

    public Serie siguiente() {
        posicion++;
        if (posicion == lista.longitud()) {
            posicion--;
        }
        return lista.getSerie(posicion);
    }

    public Serie ultimo() {

        posicion = lista.longitud() - 1;
        return lista.getSerie(posicion);

    }

    public void nuevo(Serie libro) {

        lista.setSerie(libro);
        posicion = lista.longitud() - 1;
        Acceso.guardarLista(lista);
    }

    public void eliminar() {
        lista.eliminar(posicion);
        Acceso.guardarLista(lista);
    }

    public void actualizar(Serie libro) {
        lista.actualizar(libro, posicion);
        Acceso.guardarLista(lista);
    }

    public void abrirArchivo(File archivo) {
        lista = Acceso.cargarArchivo(archivo);
    }

    public void guardarArchivo(File archivo) {
        Acceso.guardarArchivo(archivo, lista);
    }

}
