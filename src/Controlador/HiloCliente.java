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
            return objectInputStream.readInt();

        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public int solicitarEliminarComic(String nomComic) {

        try {

            objectOutputStream.writeObject(new PeticionServidor("borrarcomic", nomComic));

            return objectInputStream.readInt();

        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;

    }

    public List<Autor> solicitarListaAutores() {

        try {
            objectOutputStream.writeObject(new PeticionServidor("listarautores", null));
            
            return (List<Autor>) objectInputStream.readObject();
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
       

    }

    public int solicitarAnhadirAutor(Autor autor) {

        try {
            objectOutputStream.writeObject(new PeticionServidor("anhadirautor", autor));

            return objectInputStream.readInt();
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    public int solicitarEliminarAutor(String nomAutor) {

        try {
            objectOutputStream.writeObject(new PeticionServidor("borrarautor", nomAutor));

            return objectInputStream.readInt();
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    
     
    }

    public List<Estado> solicitarListaEstado() {

        try {
            objectOutputStream.writeObject(new PeticionServidor("listarestados", null));
            
            return (List<Estado>) objectInputStream.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public Comic solicitarGetComic(String nomComic) {

        try {
            objectOutputStream.writeObject(new PeticionServidor("getcomic", nomComic));
            
            return (Comic) objectInputStream.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    public Autor solicitarGetAutor(String nomAutor) {

        try {
            objectOutputStream.writeObject(new PeticionServidor("getautor", nomAutor));
            
            return (Autor) objectInputStream.readObject();
            
        } catch (IOException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

}
