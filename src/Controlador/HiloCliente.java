/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Manu Romeo
 */
public class HiloCliente extends Thread {

    Socket skCliente;
    String orden;
    JTextArea txtArea;

    DataOutputStream flujo_salida;
    DataInputStream flujo_entrada;

    public HiloCliente(Socket skCliente, String orden, JTextArea txtAreaVisualizar) throws IOException {

        this.skCliente = skCliente;
        this.orden = orden;
        this.txtArea = txtAreaVisualizar;
        flujo_salida = new DataOutputStream(skCliente.getOutputStream());
        flujo_entrada = new DataInputStream(skCliente.getInputStream());

    }

    public HiloCliente(Socket skCliente, JTextArea txtAreaVisualizar) throws IOException {
        this.skCliente = skCliente;
        this.txtArea = txtAreaVisualizar;
        flujo_salida = new DataOutputStream(skCliente.getOutputStream());
        flujo_entrada = new DataInputStream(skCliente.getInputStream());
    }

    @Override
    public void run() {
        String ordenRecibida;

        if (skCliente != null) {

            try {
                //Tareas del cliente
                while (true) {
                    //   flujo_salida.writeUTF(orden);

                    ordenRecibida = flujo_entrada.readUTF();

                    switch (ordenRecibida.toLowerCase()) {
                        case "listarComicsOk" -> {
                            // Debo indicarle donde van a ser mostrados los datos, o tratar de sacar la lista a fuera del hilo
                            GestionComics.listarSocketComics(skCliente);
                        }
                        case "salirok" -> {
                            area.setText("Saliendoooooooooooo................");

                        }
                        case "listaComics" -> {
                           GestionComics.

                        }
                        default -> {
                            area.setText(area.getText() + "\n" + flujo_entrada.readUTF());
                        }
                    }
                }
                //Escribimos primero la instruccion que queremos

            } catch (IOException ex) {
                Thread.currentThread().interrupt();
                Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No está conectado", "Aplicacion", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void solicitarListaComic() {

        try {
            flujo_salida.writeUTF("listarComics");
        } catch (IOException ex) {
            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void solicitarNumUsuarios() {

        try {
            flujo_salida.writeUTF("usuarios");
        } catch (IOException ex) {
            Logger.getLogger(HiloServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
