/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu Romeo
 */
public class HiloServidor extends Thread {

    public static int contadorClientes;
    ServerSocket skServidor;
    boolean activo = true;
    ArrayList<Thread> listaThread = new ArrayList<>();

    public HiloServidor(ServerSocket skServidor) {
        this.skServidor = skServidor;
    }

    public void apagarServidor() {
        activo = false;
    }

    @Override
    public void run() {
        while (activo) {
            try {
                System.out.println("Esperando");
                Socket skCliente = skServidor.accept();
                contadorClientes++;
                System.out.println("Cliente conectado correctamente!");
                

                //Atendemos al cliente mediante un thread
                HiloServidorCliente hsc = new HiloServidorCliente(skCliente);
                hsc.start();

                listaThread.add(hsc);

            } catch (java.net.SocketException s) {
                JOptionPane.showMessageDialog(null, "El servidor no está conectado.");

            } catch (IOException ex) {
                Logger.getLogger(HiloServidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (Thread thread : listaThread) {
            thread.interrupt();
        } 
    

    }

}
