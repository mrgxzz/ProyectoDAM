/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Autor;
import Modelo.Coleccion;
import Modelo.Comic;
import Utiles.PeticionServidor;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;
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
                        case "hora" -> {
                            
                            // La linea de abajo es lo que se le manda de vuelta al cliente
                            flujo_salida.writeUTF(new Date().toInstant().toString());
                        }
                        case "usuarios" -> {
                            flujo_salida.writeUTF("Numero de clientes conectados: " + HiloServidor.contadorClientes);
                        }
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
                        case "listarcomics" -> {

                            List<Comic> listaComics = GestionComics.getListaComics();

                            objeto_salida.writeObject(listaComics);
                            objeto_salida.flush();
//                                        
                            System.out.println("HEYYYY");

                        }
                        case "anhadircomic" -> {
//                            flujo_salida.writeUTF("anhadircomicok");
//                            flujo_salida.flush();
                                               
                            GestionComics.anhadirComic((Comic) orden.getObjeto());
                            objeto_salida.flush();
//                                        
                            System.out.println("HEYYYY");

                        }
                        case "listarautores" -> {
                            flujo_salida.writeUTF("listaautoresok");
//                                        List <Autor> listaAutores = GestionComics.cargarAutores();
//
//                                        objeto_salida = new ObjectOutputStream(skCliente.getOutputStream());
//
//                                        objeto_salida.writeObject(listaAutores);
//                                        objeto_salida.flush();
//                                        

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
