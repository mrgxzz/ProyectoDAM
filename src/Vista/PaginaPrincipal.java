/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HiloCliente;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JOptionPane;

/**
 *
 * @author manuelrg
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    final String HOST = "localhost";
    Socket skCliente;
    HiloCliente h;

    String errorConexion;

    /**
     * Creates new form GestionCursos
     *
     */
    public PaginaPrincipal() {

        initComponents();

        traduccion();
        activarAyuda();

        if (skCliente == null || skCliente.isClosed() || !skCliente.isConnected()) {
            try {
                skCliente = new Socket(HOST, 2000);

                h = new HiloCliente(skCliente, null);

            } catch (java.net.ConnectException ex) {
                JOptionPane.showMessageDialog(null, errorConexion);

                this.dispose();

            } catch (IOException ex) {
                Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ComicsManager = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnAutores = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnInformeAutores = new javax.swing.JButton();
        btnAyuda = new javax.swing.JButton();
        btnInformeComics = new javax.swing.JButton();
        btnBuscador = new javax.swing.JButton();
        btnColecciones = new javax.swing.JButton();
        btnComics = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblPanelControl = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comic manager");
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(1100, 800));
        setPreferredSize(new java.awt.Dimension(450, 350));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(190, 513));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));
        jPanel2.setForeground(new java.awt.Color(204, 0, 51));

        ComicsManager.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ComicsManager.setForeground(new java.awt.Color(255, 255, 255));
        ComicsManager.setText("Comics manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ComicsManager)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ComicsManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 0, 51));
        jPanel5.setForeground(new java.awt.Color(0, 102, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btnAutores.setBackground(new java.awt.Color(204, 0, 51));
        btnAutores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnAutores.setText("Autores");
        btnAutores.setBorderPainted(false);
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });
        jPanel5.add(btnAutores, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(204, 0, 51));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(204, 0, 51));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(204, 0, 51));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(204, 0, 51));
        jPanel11.setLayout(new java.awt.BorderLayout());

        btnInformeAutores.setBackground(new java.awt.Color(204, 0, 51));
        btnInformeAutores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInformeAutores.setForeground(new java.awt.Color(255, 255, 255));
        btnInformeAutores.setText("Informes de autores");
        btnInformeAutores.setBorderPainted(false);
        btnInformeAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeAutoresActionPerformed(evt);
            }
        });
        jPanel11.add(btnInformeAutores, java.awt.BorderLayout.PAGE_START);

        btnAyuda.setBackground(new java.awt.Color(204, 0, 51));
        btnAyuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAyuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ayuda/imagenes/ayuda (1).png"))); // NOI18N
        btnAyuda.setBorderPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        jPanel11.add(btnAyuda, java.awt.BorderLayout.PAGE_END);

        jPanel10.add(jPanel11, java.awt.BorderLayout.CENTER);

        btnInformeComics.setBackground(new java.awt.Color(204, 0, 51));
        btnInformeComics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInformeComics.setForeground(new java.awt.Color(255, 255, 255));
        btnInformeComics.setText("Informes de cómics");
        btnInformeComics.setBorderPainted(false);
        btnInformeComics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeComicsActionPerformed(evt);
            }
        });
        jPanel10.add(btnInformeComics, java.awt.BorderLayout.PAGE_START);

        jPanel9.add(jPanel10, java.awt.BorderLayout.CENTER);

        btnBuscador.setBackground(new java.awt.Color(204, 0, 51));
        btnBuscador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscador.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscador.setText("Buscador");
        btnBuscador.setBorderPainted(false);
        btnBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscadorActionPerformed(evt);
            }
        });
        jPanel9.add(btnBuscador, java.awt.BorderLayout.PAGE_START);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        btnColecciones.setBackground(new java.awt.Color(204, 0, 51));
        btnColecciones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnColecciones.setForeground(new java.awt.Color(255, 255, 255));
        btnColecciones.setText("Colecciones");
        btnColecciones.setBorderPainted(false);
        btnColecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColeccionesActionPerformed(evt);
            }
        });
        jPanel6.add(btnColecciones, java.awt.BorderLayout.PAGE_START);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        btnComics.setBackground(new java.awt.Color(204, 0, 51));
        btnComics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnComics.setForeground(new java.awt.Color(255, 255, 255));
        btnComics.setText("Cómics");
        btnComics.setBorderPainted(false);
        btnComics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComicsActionPerformed(evt);
            }
        });
        jPanel3.add(btnComics, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        lblPanelControl.setBackground(new java.awt.Color(255, 255, 255));
        lblPanelControl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPanelControl.setText("Panel de control");
        lblPanelControl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(lblPanelControl, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        content.setBackground(new java.awt.Color(255, 255, 255));

        lblBienvenida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBienvenida.setText("Bienvenido a Comics Manager");

        lblSubtitulo.setText("Pulsa sobre una de las opciones del menú lateral para empezar a gestionar");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentLayout.createSequentialGroup()
                        .addComponent(lblBienvenida)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblSubtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubtitulo)
                .addContainerGap(849, Short.MAX_VALUE))
        );

        jPanel7.add(content, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed

    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        GestionAutoresPanel boardPanel = new GestionAutoresPanel(h);
        boardPanel.setSize(600, 491);
        boardPanel.setLocation(0, 0);

        content.removeAll();
        content.add(boardPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void btnColeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColeccionesActionPerformed
        GestionColeccionesPanel actorsMoviesPanel = new GestionColeccionesPanel(h);
        actorsMoviesPanel.setSize(600, 491);
        actorsMoviesPanel.setLocation(0, 0);

        content.removeAll();
        content.add(actorsMoviesPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnColeccionesActionPerformed

    private void btnBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscadorActionPerformed
        BuscadorPanel buscadorPanel = new BuscadorPanel(h);
        buscadorPanel.setSize(600, 491);
        buscadorPanel.setLocation(0, 0);

        content.removeAll();
        content.add(buscadorPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnBuscadorActionPerformed

    private void btnInformeComicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeComicsActionPerformed
        InformesComicsPanel verPeliculasPanel = new InformesComicsPanel(h);
        verPeliculasPanel.setSize(600, 491);
        verPeliculasPanel.setLocation(0, 0);

        content.removeAll();
        content.add(verPeliculasPanel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnInformeComicsActionPerformed

    private void btnInformeAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeAutoresActionPerformed
        InformesAutoresPanel verActores = new InformesAutoresPanel(h);
        verActores.setSize(600, 491);
        verActores.setLocation(0, 0);

        content.removeAll();
        content.add(verActores, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnInformeAutoresActionPerformed

    private void btnComicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComicsActionPerformed
        GestionComicsPanel moviesBoard = new GestionComicsPanel(h);
        moviesBoard.setSize(700, 655);
        moviesBoard.setLocation(0, 0);

        content.removeAll();
        content.add(moviesBoard, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnComicsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ComicsManager;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnBuscador;
    private javax.swing.JButton btnColecciones;
    private javax.swing.JButton btnComics;
    private javax.swing.JButton btnInformeAutores;
    private javax.swing.JButton btnInformeComics;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblPanelControl;
    private javax.swing.JLabel lblSubtitulo;
    // End of variables declaration//GEN-END:variables

    private void activarAyuda() {

        try {

            URL url;

            if (Locale.getDefault().getLanguage().equalsIgnoreCase("gl")) {
                url = this.getClass().getResource("/ayuda/gal/help.hs");
            } else {
                url = this.getClass().getResource("/ayuda/esp/help.hs");

            }

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(null, url);
            HelpBroker hb = helpset.createHelpBroker();

            hb.enableHelpOnButton(btnAyuda, "paginaprincipal", helpset);
        } catch (HelpSetException ex) {
            Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblBienvenida.setText(rb.getString("lblBienvenida"));
        lblSubtitulo.setText(rb.getString("lblSubtitulo"));
        btnInformeComics.setText(rb.getString("btnInformeComics"));
        btnColecciones.setText(rb.getString("btnColecciones"));
        btnComics.setText(rb.getString("btnComics"));

        errorConexion = rb.getString("dialogErrorConexion");

    }

}
