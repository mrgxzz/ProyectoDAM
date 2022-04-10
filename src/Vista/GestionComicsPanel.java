/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.JOptionPane;

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
     */
    public GestionComicsPanel() {
        initComponents();
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

        lblGestionPeliculas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTituloPelicula = new javax.swing.JTextField();
        lblSinopsis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSinopsis = new javax.swing.JTextArea();
        lblPuntuacion = new javax.swing.JLabel();
        txtPuntuacion = new javax.swing.JTextField();
        lblDuracion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        lblFechaEstreno = new javax.swing.JLabel();
        txtFechaEstreno = new javax.swing.JTextField();
        lblFotoPortada = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAltaPelicula = new javax.swing.JButton();
        btnBorrarPelicula = new javax.swing.JButton();
        lblMarcaBorrarPelicula = new javax.swing.JLabel();
        lblIndicacionBorrado = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(518, 491));

        lblGestionPeliculas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGestionPeliculas.setText("Gestión de peliculas");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTitulo.setText("Título");

        lblSinopsis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSinopsis.setText("Sinopsis");

        txtAreaSinopsis.setColumns(20);
        txtAreaSinopsis.setRows(5);
        jScrollPane1.setViewportView(txtAreaSinopsis);

        lblPuntuacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPuntuacion.setText("Puntuación");

        lblDuracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDuracion.setText("Duración (en min.)");

        lblFechaEstreno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFechaEstreno.setText("Fecha estreno");

        lblFotoPortada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFotoPortada.setText("Foto de portada");

        jButton1.setText(". . .");

        btnAltaPelicula.setText("Alta película");
        btnAltaPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaPeliculaActionPerformed(evt);
            }
        });

        btnBorrarPelicula.setText("Borrar película");
        btnBorrarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPeliculaActionPerformed(evt);
            }
        });

        lblMarcaBorrarPelicula.setText("*");

        lblIndicacionBorrado.setText("* : Para borrar una película solamente es necesario indicar el nombre de la misma");

        lblGenero.setText("Género");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("/ 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIndicacionBorrado)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBorrarPelicula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAltaPelicula)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblGestionPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(txtTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMarcaBorrarPelicula))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDuracion)
                                        .addComponent(lblPuntuacion, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFechaEstreno, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblFotoPortada)
                                    .addComponent(lblGenero)
                                    .addComponent(lblSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1)
                                            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                            .addComponent(txtPuntuacion)
                                            .addComponent(txtFechaEstreno))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1)))))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGestionPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTituloPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMarcaBorrarPelicula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSinopsis)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntuacion)
                    .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracion)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEstreno)
                    .addComponent(txtFechaEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFotoPortada)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(lblGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaPelicula)
                    .addComponent(btnBorrarPelicula))
                .addGap(18, 18, 18)
                .addComponent(lblIndicacionBorrado)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaPeliculaActionPerformed
/*
        Movie movie = Controller.DBControllerMovies.getMovie(txtTituloPelicula.getText());

        if (txtTituloPelicula.getText().isBlank() || txtAreaSinopsis.getText().isBlank() || txtDuracion.getText().isBlank() || txtFechaEstreno.getText().isBlank() || txtPuntuacion.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, camposObligatorios);
        } else {
            if (movie == null) {

                String puntuacion = txtPuntuacion.getText();
                String duracion = txtDuracion.getText();
                String fecha = txtFechaEstreno.getText();

                if (ValidationMethods.isNumeric(puntuacion)) {

                    if (ValidationMethods.isNumeric(duracion)) {

                        if (ValidationMethods.validarFecha(fecha)) {

                            int puntuacionValor = Integer.parseInt(txtPuntuacion.getText());

                            if (puntuacionValor > 5 || puntuacionValor < 0) {
                                JOptionPane.showMessageDialog(null, puntuacion05);
                            } else {

                                Genre genre = (Genre) cmbGenero.getSelectedItem();

                                Controller.DBControllerMovies.insertMovie(txtTituloPelicula.getText(), txtAreaSinopsis.getText(), Integer.parseInt(txtPuntuacion.getText()), Integer.parseInt(txtDuracion.getText()), txtFechaEstreno.getText(), "foto", genre.getIdGenre());

                                JOptionPane.showMessageDialog(null, peliculaAnadida);

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, fechaFormato);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, duracionNumerico);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, puntuacion05);
                }

            } else {
                JOptionPane.showMessageDialog(null, peliculaExistente);
            }
        }
*/
    }//GEN-LAST:event_btnAltaPeliculaActionPerformed

    private void btnBorrarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPeliculaActionPerformed
      /*  Movie movie = Controller.DBControllerMovies.getMovie(txtTituloPelicula.getText());

        if (movie != null) {
            Controller.DBControllerMovies.deleteMovie(txtTituloPelicula.getText());

            JOptionPane.showMessageDialog(null, peliculaEliminada);
        } else {
            JOptionPane.showMessageDialog(null, noExistePelicula);
        }*/
    }//GEN-LAST:event_btnBorrarPeliculaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaPelicula;
    private javax.swing.JButton btnBorrarPelicula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFechaEstreno;
    private javax.swing.JLabel lblFotoPortada;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblGestionPeliculas;
    private javax.swing.JLabel lblIndicacionBorrado;
    private javax.swing.JLabel lblMarcaBorrarPelicula;
    private javax.swing.JLabel lblPuntuacion;
    private javax.swing.JLabel lblSinopsis;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtAreaSinopsis;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFechaEstreno;
    private javax.swing.JTextField txtPuntuacion;
    private javax.swing.JTextField txtTituloPelicula;
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

        lblGestionPeliculas.setText(rb.getString("lblGestionPeliculas"));
        lblDuracion.setText(rb.getString("lblDuracion"));
        lblFechaEstreno.setText(rb.getString("lblFechaEstreno"));
        lblFotoPortada.setText(rb.getString("lblFotoPortada"));
        lblGenero.setText(rb.getString("lblGenero"));
        lblIndicacionBorrado.setText(rb.getString("lblIndicacionBorrado"));
        lblPuntuacion.setText(rb.getString("lblPuntuacion"));
        lblTitulo.setText(rb.getString("lblTitulo"));

        btnAltaPelicula.setText(rb.getString("btnAltaPelicula"));
        btnBorrarPelicula.setText(rb.getString("btnBorrarPelicula"));

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
