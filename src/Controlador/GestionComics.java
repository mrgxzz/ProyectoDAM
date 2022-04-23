/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Coleccion;
import Modelo.Comic;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.Date;
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
import javax.swing.JTextArea;

/**
 *
 * @author Manu Romeo
 */
public class GestionComics {

    /**
     * ******** GESTION EN EL SERVIDOR
     *
     * @return ******************************
     */
    public static List<Comic> cargarComics() {

        Connection con;
        ResultSet rs = null;

        List<Comic> listaComics = new ArrayList();
        try {

            con = DBConnector.getConexion();

            String consulta = "Select * from comic";
            PreparedStatement sentencia = con.prepareStatement(consulta);

            rs = sentencia.executeQuery();

            while (rs.next()) {
                listaComics.add(new Comic(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getBytes(5), rs.getInt(5), rs.getInt(6)));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ListarEmpleados", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaComics;
    }

    public static List<Coleccion> cargarColecciones() {

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Listar coleeciones", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaColecciones;
    }

    public static List<Autor> cargarAutores() {

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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Listar autores", JOptionPane.OK_OPTION);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {

            }
        }
        return listaAutores;
    }

    public static int anhadirComic(Comic comic) {

        Connection con;

        try {

            con = DBConnector.getConexion();

            String consulta = "INSERT INTO comic (nombre, fechaAdquisicion, tapa, idEstado, idAutor, portada)"
                    + "VALUES (?,?,?,?,?,?)";

            PreparedStatement sentencia = con.prepareStatement(consulta);

            sentencia.setString(1, comic.getNombreComic());
            sentencia.setDate(2, new java.sql.Date(comic.getFechaAdquisicion().getTime()) );
            sentencia.setString(3, comic.getTapa());
            sentencia.setInt(4, comic.getIdEstado());
            sentencia.setInt(5, comic.getIdAutor());
            sentencia.setBytes(6, comic.getPortada());

            return sentencia.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Añadir comic", JOptionPane.OK_OPTION);
        }

        return 0;
    }

    private Image getImage(byte[] bytes, boolean isThumbnail) throws IOException {

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator readers = ImageIO.getImageReadersByFormatName("jpeg");
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

    /**
     * **********************GESTION EN EL
     * CLIENTE****************************************************
     */
    /**
     *
     * @param skCliente
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Comic> listarSocketComics(Socket skCliente) throws IOException, ClassNotFoundException {

        ObjectInputStream objeto_entrada = new ObjectInputStream(skCliente.getInputStream());

        List<Comic> listaComics = (List<Comic>) objeto_entrada.readObject();

        return listaComics;

        /*area.setText("");
        for (Departamentos d : listaDepartamentos) {
            //System.out.println(d.toString());
            area.setText(area.getText() + "\n" + d.toString());
        } */
    }

    public static List<Coleccion> listarSocketColecciones(Socket skCliente) throws IOException, ClassNotFoundException {

        ObjectInputStream objeto_entrada = new ObjectInputStream(skCliente.getInputStream());

        List<Coleccion> listaColecciones = (List<Coleccion>) objeto_entrada.readObject();

        return listaColecciones;

    }

    public static List<Autor> listarSocketAutor(Socket skCliente) throws IOException, ClassNotFoundException {

        ObjectInputStream objeto_entrada = new ObjectInputStream(skCliente.getInputStream());

        List<Autor> listaAutores = (List<Autor>) objeto_entrada.readObject();

        return listaAutores;

    }
}
