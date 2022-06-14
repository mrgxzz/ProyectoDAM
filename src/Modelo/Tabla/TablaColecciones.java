/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabla;

import Controlador.HiloCliente;
import Modelo.Coleccion;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manu Romeo
 */
public class TablaColecciones extends AbstractTableModel {

    public ArrayList<Coleccion> listaColecciones;

    private final String[] columnasTabla;

    public HiloCliente hiloCliente;

    public TablaColecciones() {
        super();
        this.columnasTabla = new String[]{"Nombre", "Edición"};
    }

    public ArrayList<Coleccion> getListaColecciones() {
        return listaColecciones;
    }

    public void setListaColecciones(ArrayList<Coleccion> listaColecciones) {
        this.listaColecciones = listaColecciones;
    }

    public TablaColecciones(ArrayList<Coleccion> listaColecciones, HiloCliente h) {
        super();
        this.hiloCliente = h;
        this.columnasTabla = new String[]{"Nombre", "Edición"};
        this.listaColecciones = listaColecciones;
    }

    @Override //Redefinimos el método getColumnClass
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return Object.class;
            case 1:
                return Object.class;
         
            default:
                return Object.class;
        }
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
        return listaColecciones.size();
    }

    @Override
    public int getColumnCount() {
        return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if (rowIndex != -1 && listaColecciones.size() > rowIndex) {
            Coleccion u = listaColecciones.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    return u.getNombre();
                case 1:
                    return u.getEdicion();
                    
                default:
                    return null;
                    
            }
        } else {
            return null;
        }

    }

}
