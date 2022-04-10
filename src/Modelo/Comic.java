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
public class Comic implements Serializable{
    private int idComic;
    private String nombreComic;
    private java.util.Date fechaAdquisicion;
    private String tapa;
    private byte[] portada;
    private int idEstado;

    public Comic() {
    }

    public Comic(int idComic, String nombreComic, Date fechaAdquisicion, String tapa, byte[] portada, int idEstado) {
        this.idComic = idComic;
        this.nombreComic = nombreComic;
        this.fechaAdquisicion = fechaAdquisicion;
        this.tapa = tapa;
        this.portada = portada;
        this.idEstado = idEstado;
    }


    public int getIdComic() {
        return idComic;
    }

    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }

    public String getNombreComic() {
        return nombreComic;
    }

    public void setNombreComic(String nombreComic) {
        this.nombreComic = nombreComic;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getTapa() {
        return tapa;
    }

    public void setTapa(String tapa) {
        this.tapa = tapa;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public byte[] getPortada() {
        return portada;
    }

    public void setPortada(byte[] portada) {
        this.portada = portada;
    }
    
    @Override
    public String toString() {
        return "Comic{" + "idComic=" + idComic + ", nombreComic=" + nombreComic + ", fechaAdquisicion=" + fechaAdquisicion + ", tapa=" + tapa + ", idEstado=" + idEstado + '}';
    }
    
    
}
