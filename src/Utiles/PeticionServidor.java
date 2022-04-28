/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.io.Serializable;

/**
 *
 * @author Manu Romeo
 */
public class PeticionServidor implements Serializable{
    private String peticion;
    private Object objeto;

    public PeticionServidor() {
    }

    public PeticionServidor(String peticion, Object objeto) {
        this.peticion = peticion;
        this.objeto = objeto;
    }

    public String getPeticion() {
        return peticion;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "PeticionServidor{" + "peticion=" + peticion + ", objeto=" + objeto + '}';
    }
    
    
    
}
