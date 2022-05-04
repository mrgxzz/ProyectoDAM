/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Manu Romeo
 */
public class Autor implements Serializable{
    private int idAutor;
    private String nombre;
    private java.util.Date fechaNac;

    public Autor() {
    }

    public Autor(int idAutor, String nombre, Date fechaNac) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    public Autor(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
