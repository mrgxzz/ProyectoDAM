/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabla;

import Modelo.Autor;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
        this.columnasTabla = new String[]{"Nombre y apellidos", "Fecha de nacimiento", "Foto"};
    }

    public ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    public void setListaComics(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public TablaAutores(ArrayList<Autor> listaAutores) {
        super();
        this.columnasTabla = new String[]{"Nombre y apellidos", "Fecha de nacimiento", "Foto"};
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

    @Override //Redefinimos el método getColumnClass
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return Object.class;
            case 1:
                return Object.class;
            case 2:
                return ImageIcon.class;

            default:
                return Object.class;
        }
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
                    return u.getFechaNac();
                case 2:
                    if (u.getFoto() != null) {
                        try {
                            BufferedImage img = ImageIO.read(new ByteArrayInputStream(u.getFoto()));
                            ImageIcon icon = new ImageIcon(img);
                            return icon;
                        } catch (IOException ex) {
                            Logger.getLogger(TablaAutores.class.getName()).log(Level.SEVERE, null, ex);

                            return null;
                        }

                    }

                    return null;

                default:
                    return null;

            }
        } else {
            return null;
        }
    }
}
