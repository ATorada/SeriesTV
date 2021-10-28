package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
*
* Acceso.java
*
* Creada el 20 oct 2021​, 13:16:36
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
public class Acceso {

    //Variable que prepara un archivo File que se instanciará más tarde y en el que se guardarán los datos
    private static File f;

    //Método que se encarga de guardar la lista en el archivo seleccionado
    public static void guardarLista(ListaSeries lista) {

        try {
            FileOutputStream fos = new FileOutputStream(f);
            try ( ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(lista);
            }
        } catch (IOException e) {
            System.out.println("Fallo al guardar el fichero.");
        }
    }

    //Método que se encarga de cargar la lista
    public static ListaSeries cargarLista() {
        ListaSeries lista = new ListaSeries();
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            lista = (ListaSeries) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fallo al guardar el fichero.");
        } finally {
            return lista;
        }
    }

    //Método que se encarga de cargar el Archivo seleccionado por el usuario
    public static ListaSeries cargarArchivo(File archivo) {
        ListaSeries lista = new ListaSeries();
        f = archivo;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            lista = (ListaSeries) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fallo al abrir el fichero.");
        } finally {
            return lista;
        }
    }

    //Método que se encarga de guardar la lista pasada por parámetro en el archivo seleccionado por el usuario
    public static void guardarArchivo(File archivo, ListaSeries lista) {
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            try ( ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(lista);
            }
        } catch (IOException e) {
            System.out.println("Fallo al guardar el fichero.");
        }
    }

}
