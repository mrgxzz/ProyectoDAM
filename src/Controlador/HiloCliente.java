/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Comic;
import Modelo.Estado;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Manu Romeo
 */
public class HiloCliente {

    Socket skCliente;
    String orden;
    JTextArea txtArea;

    DataOutputStream flujo_salida;
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    DataInputStream flujo_enter;

    public HiloCliente(Socket skCliente, String orden, JTextArea txtAreaVisualizar) throws IOException {

        this.skCliente = skCliente;
        this.orden = orden;
        this.txtArea = txtAreaVisualizar;
        flujo_salida = new DataOutputStream(skCliente.getOutputStream());
        flujo_enter = new DataInputStream(skCliente.getInputStream());
        objectOutputStream = new ObjectOutputStream(skCliente.getOutputStream());
        objectInputStream = new ObjectInputStream(skCliente.getInputStream());

    }

    public HiloCliente(Socket skCliente, JTextArea txtAreaVisualizar) throws IOException {
        this.skCliente = skCliente;
        this.txtArea = txtAreaVisualizar;
        flujo_salida = new DataOutputStream(skCliente.getOutputStream());
        flujo_enter = new DataInputStream(skCliente.getInputStream());
        objectOutputStream = new ObjectOutputStream(skCliente.getOutputStream());
        objectInputStream = new ObjectInputStream(skCliente.getInputStream());
    }

//    @Override
//    public void run() {
//        String ordenRecibida;
//
//        if (skCliente != null) {
//
////            try {
//                //Tareas del cliente
//                while (true) {
//                    //   flujo_salida.writeUTF(orden);
//
////                    ordenRecibida = flujo_entrada.readUTF();
////
////                    switch (ordenRecibida.toLowerCase()) {
////                        case "listacomicsok" -> {
////                             Debo indicarle donde van a ser mostrados los datos, o tratar de sacar la lista a fuera del hilo
////                            List<Comic> listaComics = GestionComics.listarSocketComics(skCliente);
////
////                          
////                        }
////                        case "listacoleccionesok" -> {
////                             Debo indicarle donde van a ser mostrados los datos, o tratar de sacar la lista a fuera del hilo
////                            List<Coleccion> listaColecciones = GestionComics.listarSocketColecciones(skCliente);
////
////                            for (Coleccion coleccion : listaColecciones) {
////                                System.out.println(coleccion);
////                            }
////                             Como accedo a elementos de fuera para mostrar los datos
////
////                        }
////                        case "listaautoresok" -> {
////                             Debo indicarle donde van a ser mostrados los datos, o tratar de sacar la lista a fuera del hilo
////                            List<Autor> listaAutores = GestionComics.listarSocketAutor(skCliente);
////
////                            for (Autor autor : listaAutores) {
////                                System.out.println(autor);
////                            }
////                             Como accedo a elementos de fuera para mostrar los datos
////
////                        }
////                        case "salirok" -> {
////                             area.setText("Saliendoooooooooooo................");
////
////                        }
////
////                        default -> {
////                             area.setText(area.getText() + "\n" + flujo_entrada.readUTF());
////                        }
////                    }
//                }
//                //Escribimos primero la instruccion que queremos
//
////            } catch (IOException ex) {
////                Thread.currentThread().interrupt();
////                Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
////            } catch (ClassNotFoundException ex) {
////                Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
////            }
//        } else {
//            JOptionPane.showMessageDialog(null, "No está conectado", "Aplicacion", JOptionPane.INFORMATION_MESSAGE);
//        }
//
//    }
    public List<Comic> solicitarListaComic() {

        try {

            flujo_salida.writeUTF("listarcomics");

            return (List<Comic>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int solicitarAnhadirComic(String idComic, String nombre, String fecha, String tapa, String portada, String idEstado, String idAutor ) {

        try {
            // ¿QUE HAGO PARA AÑADIR? ESCRIBO EL OBJETO?
//            System.out.println("AÑADIENDO");
            flujo_salida.writeUTF("anhadircomic;");
            return (int)objectInputStream.readObject();
//      String datos = flujo_enter.readUTF();

//      System.out.println("HE LEIDO -> " + datos);
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int solicitarEliminarComic(int idComic) {

        // ¿QUE HAGO PARA AÑADIR? ESCRIBO EL OBJETO?
//            System.out.println("ELIMINANDO");
//            flujo_salida.writeUTF("eliminarcomic");
        return GestionComics.eliminarComic(idComic);
//            String datos = flujo_enter.readUTF();
//
//            System.out.println("HE LEIDO -> " + datos);
//return (List<Comic>) flujo_entrada.readObject();

    }

    public List<Autor> solicitarListaAutores() {

        // LLAMAR DESDE AQUI LLAMAR A CARGAR COMICS Y ASI PUEDO SEGUIR AVANZANDO
//        try {
//            System.out.println("SOLICITANDO");
//            flujo_salida.writeUTF("listarautores");
        return GestionComics.getListaAutores();

//            String datos = flujo_enter.readUTF();
//
//            System.out.println("HE LEIDO -> " + datos);
//            //return (List<Comic>) flujo_entrada.readObject();
//
//        } catch (IOException ex) {
//            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
    }

    public int solicitarAnhadirAutor(Autor autor) {

        // LLAMAR DESDE AQUI LLAMAR A CARGAR COMICS Y ASI PUEDO SEGUIR AVANZANDO
//        try {
//            System.out.println("SOLICITANDO");
//            flujo_salida.writeUTF("listarautores");
        return GestionComics.anhadirAutor(autor);

//            String datos = flujo_enter.readUTF();
//
//            System.out.println("HE LEIDO -> " + datos);
//            //return (List<Comic>) flujo_entrada.readObject();
//
//        } catch (IOException ex) {
//            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
    }

    public int solicitarEliminarAutor(int idAutor) {

        // LLAMAR DESDE AQUI LLAMAR A CARGAR COMICS Y ASI PUEDO SEGUIR AVANZANDO
//        try {
//            System.out.println("SOLICITANDO");
//            flujo_salida.writeUTF("listarautores");
        return GestionComics.eliminarAutor(idAutor);

//            String datos = flujo_enter.readUTF();
//
//            System.out.println("HE LEIDO -> " + datos);
//            //return (List<Comic>) flujo_entrada.readObject();
//
//        } catch (IOException ex) {
//            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
    }

    public List<Estado> solicitarListaEstado() {

        // LLAMAR DESDE AQUI LLAMAR A CARGAR COMICS Y ASI PUEDO SEGUIR AVANZANDO
//        try {
//            System.out.println("SOLICITANDO");
//            flujo_salida.writeUTF("listarautores");
        return GestionComics.getListaEstado();

//            String datos = flujo_enter.readUTF();
//
//            System.out.println("HE LEIDO -> " + datos);
//            //return (List<Comic>) flujo_entrada.readObject();
//
//        } catch (IOException ex) {
//            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
    }

}
