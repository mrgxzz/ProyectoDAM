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
import javax.swing.JOptionPane;

/**
 *
 * @author Manu Romeo
 */
public class HiloServidorCliente extends Thread {

    Socket skCliente;

    DataInputStream flujo_entrada;
    DataOutputStream flujo_salida;

    public HiloServidorCliente(Socket skCliente) {
        this.skCliente = skCliente;

    }

    @Override
    public void run() {

        try {

            PeticionServidor orden = null;

            flujo_entrada = new DataInputStream(skCliente.getInputStream());
            flujo_salida = new DataOutputStream(skCliente.getOutputStream());

            ObjectOutputStream objeto_salida = new ObjectOutputStream(skCliente.getOutputStream());
            ObjectInputStream objeto_entrada = new ObjectInputStream(skCliente.getInputStream());

            do {
                try {
                    System.out.println("Escuchando");
                    orden = (PeticionServidor) objeto_entrada.readObject();
                    System.out.println("Orden: " + orden);

                    String[] cadena = skCliente.getRemoteSocketAddress().toString().split(":");

                    //Atendemos al cliente
                    switch (orden.getPeticion().toLowerCase()) {
                        
                        case "salir" -> {
                            flujo_salida.flush();
                        }
                        case "listarcolecciones" -> {
                            flujo_salida.writeUTF("listacoleccionesok");
                            //List <Coleccion> listaColecciones = GestionComics.cargarColecciones();
//
//                                        objeto_salida = new ObjectOutputStream(skCliente.getOutputStream());
//
//                                        objeto_salida.writeObject(listaColecciones);
//                                        objeto_salida.flush();

                        }
                        
                        case "listarautores" -> {

                            List<Autor> listaAutores = GestionComics.getListaAutores();

                            objeto_salida.writeObject(listaAutores);
                            objeto_salida.flush();


                        }
                        
                        case "listarcomics" -> {

                            List<Comic> listaComics = GestionComics.getListaComics();

                            objeto_salida.writeObject(listaComics);
                            objeto_salida.flush();
                                        
                            System.out.println("HEYYYY");

                        }
                        
                        case "listarestados" -> {

                            List<Estado> listaEstados = GestionComics.getListaEstado();

                            objeto_salida.writeObject(listaEstados);
                            objeto_salida.flush();
                                       

                        }
                        
                        case "anhadircomic" -> {
    
                            int result = GestionComics.anhadirComic((Comic) orden.getObjeto());
                            
                            objeto_salida.writeInt(result);
                            
                            objeto_salida.flush();
                        }
                        
                        case "borrarcomic" -> {
    
                            int result = GestionComics.eliminarComic((String) orden.getObjeto());
                            
                            objeto_salida.writeInt(result);
                            
                            objeto_salida.flush();
                        }
                        
                         case "anhadirautor" -> {
    
                            int result = GestionComics.anhadirAutor((Autor) orden.getObjeto());
                            
                            objeto_salida.writeInt(result);
                            
                            objeto_salida.flush();
                        }
                        
                        case "borrarautor" -> {
    
                            int result = GestionComics.eliminarAutor((String) orden.getObjeto());
                         
                            objeto_salida.writeInt(result);
                            
                            objeto_salida.flush();
                        }
                        
                        case "getcomic" -> {
    
                            Comic comic = GestionComics.getComic((String) orden.getObjeto());
                            
                            objeto_salida.writeObject(comic);
                            
                            objeto_salida.flush();
                        }
                        
                        case "getautor" -> {
    
                            Autor autor = GestionComics.getAutor((String) orden.getObjeto());
                            
                            objeto_salida.writeObject(autor);
                            
                            objeto_salida.flush();
                        }
                        
           
                        default -> {
                            flujo_salida.flush();
                            flujo_salida.writeUTF("\nID Cliente -> " + cadena[1] + "\nMultiples peticiones del mismo ID cliente ");
                        }
                    }

                    flujo_salida.flush();

                } catch (IOException ex) {
                    HiloServidor.contadorClientes--;
                    Thread.currentThread().interrupt();

                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (!orden.getPeticion().equalsIgnoreCase("Salir"));

            JOptionPane.showMessageDialog(null, "El cliente se ha desconectado.");
        } catch (IOException ex) {
            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
