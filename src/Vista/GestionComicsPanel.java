/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HiloCliente;
import Modelo.Comic;
import Modelo.TablaComics;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 *
 * @author Manu Romeo
 */
public class GestionComicsPanel extends javax.swing.JPanel {

    private String camposObligatorios;
    private String peliculaExistente;
    private String puntuacionNumerico;
    private String duracionNumerico;
    private String peliculaAnadida;
    private String fechaFormato;
    private String puntuacion05;

    private String peliculaEliminada;
    private String noExistePelicula;

    /**
     * Creates new form MoviesBoardPanel
     *
     * @param h Class HiloCliente
     */
    public GestionComicsPanel(HiloCliente h) {
        initComponents();

        ArrayList<Comic> listaComics = (ArrayList<Comic>) h.solicitarListaComic();

        TablaComics modeloTabla = new TablaComics(listaComics);
        tablaComics.setModel(modeloTabla);

        /*
        ArrayList<Genre> listaGeneros = Controller.DBControllerMovies.getGenreList();

        for (Genre genero : listaGeneros) {
            cmbGenero.addItem(genero);
        }

        traduccion();

        activarAyuda();
         */
        // ¿Llega con hacer el set locale en la pantalla de seleccion de idioma y despues hacer el get bundle sin especificar idioma?
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGestionComics = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaComics = new javax.swing.JTable();
        lblAnhadir = new javax.swing.JLabel();
        lblTítulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(518, 491));

        lblGestionComics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGestionComics.setText("Gestión de cómics");

        tablaComics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaComics);

        lblAnhadir.setText("Añadir un cómic");

        lblTítulo.setText("Título");

        jFormattedTextField1.setText("jFormattedTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblGestionComics, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnhadir)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblTítulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtTitulo))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGestionComics, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAnhadir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnhadir;
    private javax.swing.JLabel lblGestionComics;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTable tablaComics;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    /*
    private void activarAyuda() {
        try {

            URL url = this.getClass().getResource("/ayuda/help.hs");

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(null, url);
            HelpBroker hb = helpset.createHelpBroker();

            hb.enableHelpKey(lblTitulo, "gestionpeliculas", helpset);

        } catch (HelpSetException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     */
    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblGestionComics.setText(rb.getString("lblGestionPeliculas"));

        camposObligatorios = rb.getString("camposObligatorios");
        peliculaEliminada = rb.getString("peliculaEliminada");
        peliculaExistente = rb.getString("peliculaExistente");
        peliculaAnadida = rb.getString("peliculaAnadida");
        fechaFormato = rb.getString("fechaFormato");
        noExistePelicula = rb.getString("noExistePelicula");
        puntuacion05 = rb.getString("puntuacion05");
        duracionNumerico = rb.getString("duracionNumerico");

    }

}
