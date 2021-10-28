package Biblio;

import Modelo.Acceso;
import Modelo.ListaSeries;
import Modelo.Serie;
import java.io.File;
import javax.swing.JFileChooser;

/*
*
* Biblio.java
*
* Creada el 19 oct 2021​, 8:53:51
*
* Desarrollada por Ángel Torada ​​en la empresa IES El Grao​ el día 19 oct 2021
*
* Puede contactar conmigo en ​10571674@ieselgrao.org
*

/**
 *
 * @autor Ángel Torada
 * @version 1.0
 * @date 19 oct 2021
 */
public class Biblio {

    static javax.swing.JFileChooser jFileChooser = new javax.swing.JFileChooser();

    public static void main(String[] args) {
        Serie lb = new Serie();

        ListaSeries lista = new ListaSeries();

        lista.setSerie(lb);

        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jFileChooser.showOpenDialog(null);
        File archivo = jFileChooser.getSelectedFile();

        Acceso.guardarArchivo(archivo, lista);

        System.out.println("Libros guardados");

        /*ListaSeries lista = new  ListaSeries();

        lista = Acceso.cargarLista();

        System.out.println(lista.getLibro(0).toString());*/
    }

}
