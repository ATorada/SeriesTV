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

    //Variables
    //Posición actual en la lista según el usuario
    private int posicion;
    //La lista que se va a usar
    private ListaSeries lista;

    //Constructor que establece la posición en 0 e instancia y carga la Lista
    public Controlador() {
        posicion = 0;
        lista = new ListaSeries();
        lista = Acceso.cargarLista();
    }

    //Devuelve la posición actual
    public int getPosicion() {
        return posicion;
    }

    //Devuelve la serie en el primer lugar
    public Serie primero() {
        posicion = 0;
        return lista.getSerie(posicion);
    }

    //Devuelve la serie anterior a la actual
    public Serie anterior() {
        if (posicion > 0) {
            posicion--;
        }
        return lista.getSerie(posicion);
    }

    //Devuelve la serie siguiente a la actual
    public Serie siguiente() {
        posicion++;
        if (posicion == lista.longitud()) {
            posicion--;
        }
        return lista.getSerie(posicion);
    }

    //Devuelve la última serie
    public Serie ultimo() {

        posicion = lista.longitud() - 1;
        return lista.getSerie(posicion);

    }

    //Añade una nueva serie
    public void nuevo(Serie libro) {

        lista.setSerie(libro);
        posicion = lista.longitud() - 1;
        Acceso.guardarLista(lista);
    }

    //Elimina una serie
    public void eliminar() {
        lista.eliminar(posicion);
        Acceso.guardarLista(lista);
    }

    //Actualiza los datos de una serie
    public void actualizar(Serie libro) {
        lista.actualizar(libro, posicion);
        Acceso.guardarLista(lista);
    }

    //Carga un archivo
    public void abrirArchivo(File archivo) {
        lista = Acceso.cargarArchivo(archivo);
    }

    //Guarda un archivo
    public void guardarArchivo(File archivo) {
        Acceso.guardarArchivo(archivo, lista);
    }

}
