/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Coleccion;
import Modelo.Comic;
import Modelo.Estado;
import java.sql.Blob;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu Romeo
 */
public class GestionComics {

    /**
     * *
     * Método para obtener todos los cómics añadidos en la BD
     *
     * @return List(Comic) Devuelve una lista cargada a través de una consulta a
     * la BD con objetos de la clase cómic
     */
    public static List<Comic> getListaComics() {

        Connection con;
        ResultSet rs = null;

        List<Comic> listaComics = new ArrayList();
        try {

            con = DBConnector.getConexion();

            String consulta = "Select * from comic";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                
                java.sql.Blob blob = rs.getBlob(5);
                
                int blobLength = (int) blob.length();
                byte[] blobAsBytes = blob.getBytes(1, blobLength);
                
                listaComics.add(new Comic(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), blobAsBytes, rs.getInt(5), rs.getInt(6)));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Obtener listado de cómics", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaComics;
    }

    /**
     * Método para obtener todos las colecciones añadidas en la BD
     *
     * @return List(Coleccion) Devuelve una lista cargada a través de una
     * consulta a la BD con objetos de la clase colección
     */
    public static List<Coleccion> getListaColecciones() {

        Connection con;
        ResultSet rs = null;

        List<Coleccion> listaColecciones = new ArrayList();
        try {

            con = DBConnector.getConexion();

            String consulta = "Select * from coleccion";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaColecciones.add(new Coleccion(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Obtener listado de colecciones", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaColecciones;
    }

    public static List<Autor> getListaAutores() {

        Connection con;
        ResultSet rs = null;

        List<Autor> listaAutores = new ArrayList();
        try {

            con = DBConnector.getConexion();

            String consulta = "Select * from autor";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaAutores.add(new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3)));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Obtener listado de autores", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaAutores;
    }

    public static List<Estado> getListaEstado() {

        Connection con;
        ResultSet rs = null;

        List<Estado> listaEstado = new ArrayList();
        try {

            con = DBConnector.getConexion();

            String consulta = "SELECT * FROM estado";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaEstado.add(new Estado(rs.getInt(1), rs.getString(2)));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Obtener listado de autores", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaEstado;
    }

    public static Comic getComic(String nomComic) {

        Connection con;
        ResultSet rs = null;

        try {

            con = DBConnector.getConexion();

            String consulta = "SELECT * FROM comic WHERE nombre = ?";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, nomComic);

            rs = sentencia.executeQuery();

            if (rs.next()) {

                java.sql.Blob blob = rs.getBlob(5);
                
                int blobLength = (int) blob.length();
                byte[] blobAsBytes = blob.getBytes(1, blobLength);

                return new Comic(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), blobAsBytes, rs.getInt(6), rs.getInt(7));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Buscar un cómic", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return null;
    }

    public static Autor getAutor(String nomAutor) {

        Connection con;
        ResultSet rs = null;

        try {

            con = DBConnector.getConexion();

            String consulta = "SELECT * FROM autor WHERE nombre = ?";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, nomAutor);

            rs = sentencia.executeQuery();

            if (rs.next()) {
                return new Autor(rs.getInt(1), rs.getString(2), rs.getDate(3));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Buscar un autor", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return null;
    }
    
     public static Estado getEstado(int idEstado) {

        Connection con;
        ResultSet rs = null;

        try {

            con = DBConnector.getConexion();

            String consulta = "SELECT * FROM estado WHERE idEstado = ?";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setInt(1, idEstado);

            rs = sentencia.executeQuery();

            if (rs.next()) {
                return new Estado(rs.getInt(1), rs.getString(2));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Buscar un estado", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return null;
    }

    public static int anhadirComic(Comic comic) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "INSERT INTO comic (nombre, fechaAdquisicion, tapa, idEstado, idAutor, portada)"
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            
            Blob b = new javax.sql.rowset.serial.SerialBlob(comic.getPortada());
            
            sentencia.setString(1, comic.getNombreComic());
            sentencia.setDate(2, new java.sql.Date(comic.getFechaAdquisicion().getTime()));
            sentencia.setString(3, comic.getTapa());
            sentencia.setInt(4, comic.getIdEstado());
            sentencia.setInt(5, comic.getIdAutor());
            sentencia.setBlob(6, b);
          

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Añadir comic", JOptionPane.OK_OPTION);
        }

        return -1;
    }

    public static int anhadirAutor(Autor autor) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "INSERT INTO autor (nombre, fechaNac)"
                    + "VALUES (?, ?)";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, autor.getNombre());
            sentencia.setDate(2, new java.sql.Date(autor.getFechaNac().getTime()));

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Añadir comic", JOptionPane.OK_OPTION);
        }

        return 0;
    }
    
    public static int updateAutor(Autor autor) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "UPDATE autor SET nombre = ?, fechaNac = ? "
                    + "WHERE idAutor = ?";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, autor.getNombre());
            sentencia.setDate(2, new java.sql.Date(autor.getFechaNac().getTime()));
            
            sentencia.setInt(3, autor.getIdAutor());

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Modificar autor", JOptionPane.OK_OPTION);
        }

        return 0;
    }
    
    public static int updateComic(Comic comic) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "UPDATE comic SET nombre = ?, fechaAdquisicion = ?,"
                    + "tapa = ?, idEstado = ?, isAutor = ?, portada = ? "
                    + "WHERE idComic = ?";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            Blob b = new javax.sql.rowset.serial.SerialBlob(comic.getPortada());
            
            sentencia.setString(1, comic.getNombreComic());
            sentencia.setDate(2, new java.sql.Date(comic.getFechaAdquisicion().getTime()));
            sentencia.setString(3, comic.getTapa());
            sentencia.setInt(4, comic.getIdEstado());
            sentencia.setInt(5, comic.getIdAutor());
            sentencia.setBlob(6, b);
            
            sentencia.setInt(7, comic.getIdComic());

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Modificar comic", JOptionPane.OK_OPTION);
        }

        return 0;
    }

    public static int eliminarComic(String nomComic) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "DELETE FROM comic WHERE nombre = ?";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, nomComic);

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Eliminar comic", JOptionPane.OK_OPTION);
        }

        return 0;
    }

    public static int eliminarAutor(String nomAutor) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "DELETE FROM autor WHERE nombre = ?";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, nomAutor);

            return sentencia.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Eliminar autor", JOptionPane.OK_OPTION);
        }

        return 0;
    }

    public static BufferedImage getImage(byte[] bytes) {

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);

        try {
            BufferedImage newImage = ImageIO.read(bis);
            return newImage;

        } catch (IOException ex) {
            Logger.getLogger(GestionComics.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public static Image getImage(byte[] bytes, boolean isThumbnail) throws IOException {

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("png");
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; // File or InputStream
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        if (isThumbnail) {

            param.setSourceSubsampling(4, 4, 0, 0);

        }
        return reader.read(0, param);

    }

}
