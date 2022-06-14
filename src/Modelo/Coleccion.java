/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Manu Romeo
 */
public class Coleccion implements Serializable{
    private int idColeccion;
    private String nombre;
    private String edicion;

    public Coleccion() {
    }

    public Coleccion(int idColeccion, String nombre, String edicion) {
        this.idColeccion = idColeccion;
        this.nombre = nombre;
        this.edicion = edicion;
    }

    public Coleccion(String nombre, String edicion) {
        this.nombre = nombre;
        this.edicion = edicion;
    }


    public int getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(int idColeccion) {
        this.idColeccion = idColeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
