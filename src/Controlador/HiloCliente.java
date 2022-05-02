/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Comic;
import Modelo.Estado;
import Utiles.PeticionServidor;
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

    public List<Comic> solicitarListaComic() {

        try {

            objectOutputStream.writeObject(new PeticionServidor("listarcomics", null));

            return (List<Comic>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int solicitarAnhadirComic(Comic comic) {

        try {

            objectOutputStream.writeObject(new PeticionServidor("anhadirComic", comic));
            // flujo_salida.writeUTF("anhadircomic;");
            return (int) objectInputStream.readObject();

        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int solicitarEliminarComic(int idComic) {

        objectOutputStream.writeObject(new PeticionServidor("borrarcomic", idComic));

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
