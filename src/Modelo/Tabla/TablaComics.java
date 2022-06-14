/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Tabla;

import Controlador.HiloCliente;
import Modelo.Comic;
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
public class TablaComics extends AbstractTableModel {

    public ArrayList<Comic> listaComics;

    private final String[] columnasTabla;

    public HiloCliente hiloCliente;

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

    public TablaComics(ArrayList<Comic> listaComics, HiloCliente h) {
        super();
        this.hiloCliente = h;
        this.columnasTabla = new String[]{"Portada", "Nombre", "Tapa", "Fecha adquisición", "Estado"};
        this.listaComics = listaComics;
    }

    @Override //Redefinimos el método getColumnClass
    public Class getColumnClass(int column) {
        switch (column) {
            case 0:
                return ImageIcon.class;
            case 1:
                return Object.class;
            case 2:
                return Object.class;
            case 3:
                return Object.class;
            case 4:
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
            try {
                Comic u = listaComics.get(rowIndex);
                switch (columnIndex) {
                    case 0:
                        if (u.getPortada() == null) {
                            return null;
                        } else {
                            BufferedImage img = ImageIO.read(new ByteArrayInputStream(u.getPortada()));
                            ImageIcon icon = new ImageIcon(img);
                            return icon;

                        }

                    case 1:
                        return u.getNombreComic();
                    case 2:
                        return u.getTapa();
                    case 3:
                        return u.getFechaAdquisicion();
                    case 4:
                        return hiloCliente.solicitarGetEstado(u.getIdEstado()).getEstado();

                    default:
                        return null;

                }
            } catch (IOException ex) {
                Logger.getLogger(TablaComics.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return null;
        }
        return null;

    }

}
