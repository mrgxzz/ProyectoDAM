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
public class TablaComics extends AbstractTableModel {

    public ArrayList<Comic> listaComics;

    private String[] columnasTabla = {"Nombre", "Apellidos", "DNI"};

    public TablaComics() {
        super();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public modeloTabla(ArrayList<Usuario> listaUsuarios) {
        super();
        this.listaUsuarios = listaUsuarios;
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
        return listaUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return columnasTabla.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
        if (rowIndex != -1 && listaUsuarios.size() > rowIndex) {
            Usuario u = listaUsuarios.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return u.getNombre();
                case 1:
                    return u.getApellidos();
                case 2:
                    return u.getDni();
                case 3:
                    return u.getDireccion();
                case 4:
                    return u.getFechaNacimiento();
                case 5:
                    return u.getUrlImagen();
                case 6:
                    return u.getListaRoles();
                default:
                    return null;

            }
        } else {
            return null;
        }
    }

    public ArrayList<Usuario> getListaVehiculos() {
        return listaUsuarios;
    }

    public void setListaVehiculos(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public String[] getColumnasTabla() {
        return columnasTabla;
    }

    public void setColumnasTabla(String[] columnasTabla) {
        this.columnasTabla = columnasTabla;
    }
}
