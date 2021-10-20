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

    private static File f = new File("Series.dat");

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

    public static ListaSeries cargarLista() {
        ListaSeries lista = new ListaSeries();
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            lista = (ListaSeries) ois.readObject();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fallo al abrir el fichero.");
        } finally {
            return lista;
        }
    }

}
