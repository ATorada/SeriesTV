package Modelo;

import java.io.Serializable;

/*
*
* Serie.java
*
* Creada el 20 oct 2021​, 12:57:00
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
public class Serie implements Serializable {

    //Atributos de la clase serie
    private String titulo;
    private String genero;
    private String productores;
    private int anyo;
    private int temporadas;
    private int valoraciónPersonal;

    //Constructor por defecto
    public Serie() {

        this.titulo = "";
        this.genero = "";
        this.productores = "";
        this.anyo = 0;
        this.temporadas = 0;
        valoraciónPersonal = ComprobarValoracion(0);

    }

    //Contrustor de atributos
    public Serie(String Título, String Género, String Productores, int Año, int Temporadas, int Valoración_Personal) {
        this.titulo = Título;
        this.genero = Género;
        this.productores = Productores;
        this.anyo = Año;
        this.temporadas = Temporadas;
        this.valoraciónPersonal = ComprobarValoracion(Valoración_Personal);
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProductores() {
        return productores;
    }

    public void setProductores(String productores) {
        this.productores = productores;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getValoraciónPersonal() {
        return valoraciónPersonal;
    }

    public void setValoraciónPersonal(int valoraciónPersonal) {
        this.valoraciónPersonal = valoraciónPersonal;
    }

    //Método que se encarga de comprobar que el número pasado sea un valor correcto
    //Este método parece redundante pero le da mucha escalabilidad a la clase y nos permite usarla en otros sitios
    private int ComprobarValoracion(int valoracion) {
        if (valoracion < 0 || valoracion > 10) {
            return 5;
        } else {
            return valoracion;
        }
    }

    //Método ToString
    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", productores=" + productores + ", anyo=" + anyo + ", temporadas=" + temporadas + ", valoraci\u00f3nPersonal=" + valoraciónPersonal + '}';
    }

}
