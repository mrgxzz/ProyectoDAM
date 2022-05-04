/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HiloCliente;
import Modelo.Autor;
import Modelo.Comic;
import Modelo.Estado;
import Modelo.TablaComics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu Romeo
 */
public class GestionComicsPanel extends javax.swing.JPanel {

    HiloCliente h;
    byte[] imagen;

    /**
     * Creates new form MoviesBoardPanel
     *
     * @param h Class HiloCliente
     */
    public GestionComicsPanel(HiloCliente h) {
        initComponents();

        this.h = h;

        ArrayList<Comic> listaComics = (ArrayList<Comic>) h.solicitarListaComic();

        TablaComics modeloTabla = new TablaComics(listaComics);
        tablaComics.setModel(modeloTabla);

        ArrayList<Autor> listaAutores = (ArrayList<Autor>) h.solicitarListaAutores();

        for (Autor autor : listaAutores) {
            cmbAutor.addItem(autor);
        }

        ArrayList<Estado> listaEstados = (ArrayList<Estado>) h.solicitarListaEstado();

        for (Estado estado : listaEstados) {
            cmbEstado.addItem(estado);
        }

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
        dateChooserCombo = new datechooser.beans.DateChooserCombo();
        lblFechaAdquisicion = new javax.swing.JLabel();
        txtTapa = new javax.swing.JTextField();
        lblTapa = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        txtAutor = new javax.swing.JLabel();
        cmbAutor = new javax.swing.JComboBox<>();
        lblPortada = new javax.swing.JLabel();
        btnPortada = new javax.swing.JButton();
        btnAnhadirComic = new javax.swing.JButton();
        txtRutaImagen = new javax.swing.JTextField();
        btnBorrarComic = new javax.swing.JButton();
        btnModificarComic = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(700, 635));

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

        dateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo.setFormat(0);

    lblFechaAdquisicion.setText("Fecha de adquisición");

    lblTapa.setText("Tapa");

    lblEstado.setText("Estado");

    txtAutor.setText("Autor");

    lblPortada.setText("Portada");

    btnPortada.setText(". . .");
    btnPortada.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPortadaActionPerformed(evt);
        }
    });

    btnAnhadirComic.setText("Añadir");
    btnAnhadirComic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAnhadirComicActionPerformed(evt);
        }
    });

    btnBorrarComic.setText("Borrar");
    btnBorrarComic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBorrarComicActionPerformed(evt);
        }
    });

    btnModificarComic.setText("Modificar");
    btnModificarComic.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnModificarComicActionPerformed(evt);
        }
    });

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
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBorrarComic)
                                .addComponent(btnModificarComic)))))
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAnhadirComic)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTítulo)
                                .addComponent(lblFechaAdquisicion)
                                .addComponent(lblTapa)
                                .addComponent(lblEstado)
                                .addComponent(txtAutor)
                                .addComponent(lblPortada))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTapa)
                                .addComponent(dateChooserCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(txtTitulo)
                                .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRutaImagen))))
                    .addGap(17, 17, 17)
                    .addComponent(btnPortada)))
            .addContainerGap(131, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblGestionComics, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnModificarComic)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnBorrarComic)))
            .addGap(18, 18, 18)
            .addComponent(lblAnhadir)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTítulo)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblFechaAdquisicion))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblTapa))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblEstado)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtAutor)
                .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblPortada)
                .addComponent(btnPortada)
                .addComponent(txtRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(35, 35, 35)
            .addComponent(btnAnhadirComic)
            .addContainerGap(72, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnhadirComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhadirComicActionPerformed

        Autor autor = (Autor) cmbAutor.getSelectedItem();
        Estado estado = (Estado) cmbEstado.getSelectedItem();   
        
        Comic c = new Comic(txtTitulo.getText(), dateChooserCombo.getSelectedDate().getTime(), txtTapa.getText(), imagen, estado.getIdEstado(), autor.getIdAutor());

        if (h.solicitarGetComic(c.getNombreComic()) != null) {
            JOptionPane.showMessageDialog(null, "Ya existe un comic");
        }
        
        int result = h.solicitarAnhadirComic(c);
        
        if (result == 1) {
            JOptionPane.showMessageDialog(null, "El comic ha sido creado correctamente.");
            
            imagen = null;
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la creación del cómic.");
        }
    }//GEN-LAST:event_btnAnhadirComicActionPerformed

    private void btnPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortadaActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(lblPortada);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fileChooser.getSelectedFile();

            txtRutaImagen.setText(fichero.getPath());
            
            imagen = toByteArray(fichero);

        }
    }//GEN-LAST:event_btnPortadaActionPerformed

    private void btnBorrarComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarComicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBorrarComicActionPerformed

    private void btnModificarComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarComicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarComicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnhadirComic;
    private javax.swing.JButton btnBorrarComic;
    private javax.swing.JButton btnModificarComic;
    private javax.swing.JButton btnPortada;
    private javax.swing.JComboBox<Autor> cmbAutor;
    private javax.swing.JComboBox<Estado> cmbEstado;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnhadir;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaAdquisicion;
    private javax.swing.JLabel lblGestionComics;
    private javax.swing.JLabel lblPortada;
    private javax.swing.JLabel lblTapa;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTable tablaComics;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JTextField txtRutaImagen;
    private javax.swing.JTextField txtTapa;
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
    private byte[] toByteArray(File file) {

        try ( FileInputStream fis = new FileInputStream(file)) {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int dataLength; (dataLength = fis.read(buffer)) != -1;) {
                baos.write(buffer, 0, dataLength);
            }
            
            byte[] imageBytes = baos.toByteArray();
            
            return imageBytes;
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema con el archivo seleccionado.");
            
        }
        
        return null;

    }

    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        

    }

}
