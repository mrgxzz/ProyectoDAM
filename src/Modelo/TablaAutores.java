/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manu Romeo
 */
public class TablaAutores extends AbstractTableModel {

    public ArrayList<Autor> listaAutores;

    private final String[] columnasTabla;

    public TablaAutores() {
        super();
        this.columnasTabla = new String[]{"Nombre y apellidos", "Fecha de nacimiento"};
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaComics(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public TablaAutores(ArrayList<Autor> listaAutores) {
        super();
        this.columnasTabla = new String[]{"Nombre y apellidos", "Fecha de nacimiento"};
        this.listaAutores = listaAutores;
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
        return listaAutores.size();
    }

    @Override
    public int getColumnCount() {
        return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if (rowIndex != -1 && listaAutores.size() > rowIndex) {
            Autor u = listaAutores.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return u.getNombre();
                case 1:
                    return u.getFechaNac().toString();
         
                default:
                    return null;

            }
        } else {
            return null;
        }
    }
}
