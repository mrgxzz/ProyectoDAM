/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.GestionComics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manu Romeo
 */
public class TablaComics extends AbstractTableModel {

    public ArrayList<Comic> listaComics;

    private final String[] columnasTabla;

    public TablaComics() {
        super();
        this.columnasTabla = new String[]{"Portada", "Nombre", "Tapa", "Fecha adquisición", "Estado"};
    }

    public ArrayList<Comic> getListaComics() {
        return listaComics;
    }

    public void setListaComics(ArrayList<Comic> listaComics) {
        this.listaComics = listaComics;
    }

    public TablaComics(ArrayList<Comic> listaComics) {
        super();
        this.columnasTabla = new String[]{"Portada", "Nombre", "Tapa", "Fecha adquisición", "Estado"};
        this.listaComics = listaComics;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public String getColumnName(int column) {
        return columnasTabla[column];
    }

    @Override
    public int getRowCount() {
        return listaComics.size();
    }

    @Override
    public int getColumnCount() {
        return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if (rowIndex != -1 && listaComics.size() > rowIndex) {
            Comic u = listaComics.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return GestionComics.getImage(u.getPortada());
                case 1:
                    return u.getNombreComic();
                case 2:
                    return u.getTapa();
                case 3:
                    return u.getFechaAdquisicion();
                case 4:
                    return u.getIdEstado();
                    
                default:
                    return null;
                    
            }
        } else {
            return null;
        }
        
    }
}
