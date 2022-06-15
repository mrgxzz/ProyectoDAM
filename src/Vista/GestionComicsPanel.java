/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HiloCliente;
import Modelo.Autor;
import Modelo.Coleccion;
import Modelo.Comic;
import Modelo.Estado;
import Modelo.Tabla.TablaComics;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Manu Romeo
 */
public class GestionComicsPanel extends javax.swing.JPanel {

    HiloCliente h;
    byte[] image = null;
    private String noImagen;
    private String huboProblema;
    private String camposObligatorios;
    private String errorCreadoComic;
    private String comicCreado;
    private String existeComic;
    private String errorBorradoComic;
    private String comicEliminado;
    private String noExisteComic;

    /**
     * Creates new form MoviesBoardPanel
     *
     * @param h Class HiloCliente
     */
    public GestionComicsPanel(HiloCliente h) {
        initComponents();

        this.h = h;

        cargarCmb();
        refrescarTabla();
        
        activarAyuda();

        traduccion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        txtAutor = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        cmbAutor = new javax.swing.JComboBox<>();
        lblPortada = new javax.swing.JLabel();
        btnPortada = new javax.swing.JButton();
        btnAnhadirComic = new javax.swing.JButton();
        txtRutaImagen = new javax.swing.JTextField();
        btnBorrarComic = new javax.swing.JButton();
        btnModificarComic = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        lblColeccion = new javax.swing.JLabel();
        cmbColeccion = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(700, 635));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        tablaComics.setFillsViewportHeight(true);
        tablaComics.setRowHeight(75);
        jScrollPane2.setViewportView(tablaComics);

        lblAnhadir.setText("Añadir un cómic");

        lblTítulo.setText("Título");

        dateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
    dateChooserCombo.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
    dateChooserCombo.setFormat(2);

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

    txtRutaImagen.setEditable(false);

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

    lblColeccion.setText("Coleccion");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAnhadir)
                        .addGap(318, 318, 318)
                        .addComponent(btnModificarComic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarComic, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblColeccion)
                                .addGap(73, 73, 73)
                                .addComponent(cmbColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTítulo)
                                    .addComponent(lblFechaAdquisicion)
                                    .addComponent(lblTapa)
                                    .addComponent(lblEstado)
                                    .addComponent(txtAutor)
                                    .addComponent(lblPortada))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTapa)
                                    .addComponent(dateChooserCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTitulo)
                                    .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbAutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAnhadirComic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPortada)
                        .addGap(29, 29, 29)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(lblGestionComics, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(463, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblGestionComics, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblAnhadir, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarComic)
                    .addComponent(btnBorrarComic)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTítulo)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dateChooserCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFechaAdquisicion))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTapa))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAutor)
                        .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPortada)
                        .addComponent(txtRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPortada)))
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblColeccion)
                .addComponent(cmbColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(btnAnhadirComic)
            .addContainerGap(147, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarComicActionPerformed
        String nomComic = (String) tablaComics.getModel().getValueAt(tablaComics.getSelectedRow(), 1);

        Comic comic = h.solicitarGetComic(nomComic);

        if (comic != null) {

            ModificarComicDialog modComic = new ModificarComicDialog(null, true, comic, h);
            modComic.setVisible(true);

            refrescarTabla();

        } else {

            JOptionPane.showMessageDialog(null, noExisteComic);

        }
    }//GEN-LAST:event_btnModificarComicActionPerformed

    private void btnBorrarComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarComicActionPerformed
        String nomComic = (String) tablaComics.getModel().getValueAt(tablaComics.getSelectedRow(), 1);

        int opt = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el "
                + "cómic con título: " + nomComic + " ? Los cambios realizados son permanentes", "Eliminar un cómic", JOptionPane.YES_NO_OPTION);

        if (opt == JOptionPane.YES_OPTION) {
            int result = h.solicitarEliminarComic(nomComic);

            if (result > 0) {
                JOptionPane.showMessageDialog(null, comicEliminado);

                refrescarTabla();

            } else {
                JOptionPane.showMessageDialog(null, errorBorradoComic);
            }

        }
    }//GEN-LAST:event_btnBorrarComicActionPerformed

    private void btnAnhadirComicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhadirComicActionPerformed

        Autor autor = (Autor) cmbAutor.getSelectedItem();
        Estado estado = (Estado) cmbEstado.getSelectedItem();
        Coleccion coleccion = (Coleccion) cmbColeccion.getSelectedItem();

        if (txtTitulo.getText().isBlank() || txtTapa.getText().isBlank() || txtAutor.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, camposObligatorios);
        } else {

            Comic c = new Comic(txtTitulo.getText(), dateChooserCombo.getSelectedDate().getTime(), txtTapa.getText(), estado.getIdEstado(), autor.getIdAutor(), image, lblPortada.getText(), coleccion.getIdColeccion());

            if (h.solicitarGetComic(c.getNombreComic()) != null) {
                JOptionPane.showMessageDialog(null, existeComic);
            } else {

                int result = h.solicitarAnhadirComic(c);

                if (result == 1) {
                    JOptionPane.showMessageDialog(null, comicCreado);

                    txtTitulo.setText("");
                    txtTapa.setText("");
                    txtRutaImagen.setText("");
                    lblFoto.setText("");

                    image = null;

                    refrescarTabla();

                } else {
                    JOptionPane.showMessageDialog(null, errorCreadoComic);
                }

            }

        }
    }//GEN-LAST:event_btnAnhadirComicActionPerformed

    private void btnPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPortadaActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Imágenes", "jpeg", "jpg", "png"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        int result = fileChooser.showOpenDialog(null);

        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File image = fileChooser.getSelectedFile();
        try {
            if (ImageIO.read(image) == null) {
                JOptionPane.showMessageDialog(null, noImagen);
                return;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, huboProblema);
            return;
        }

        byte[] imageBytes;
        try ( FileInputStream fis = new FileInputStream(image)) {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int dataLength; (dataLength = fis.read(buffer)) != -1;) {
                baos.write(buffer, 0, dataLength);
            }
            imageBytes = baos.toByteArray();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, huboProblema);
            return;
        }

        txtRutaImagen.setText(image.getAbsolutePath());

        this.image = imageBytes;
        lblFoto.setIcon(new ImageIcon(new ImageIcon(this.image).getImage().getScaledInstance(lblFoto.getSize().width,
                lblFoto.getSize().height, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btnPortadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnhadirComic;
    private javax.swing.JButton btnBorrarComic;
    private javax.swing.JButton btnModificarComic;
    private javax.swing.JButton btnPortada;
    private javax.swing.JComboBox<Autor> cmbAutor;
    private javax.swing.JComboBox<Coleccion> cmbColeccion;
    private javax.swing.JComboBox<Estado> cmbEstado;
    private datechooser.beans.DateChooserCombo dateChooserCombo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnhadir;
    private javax.swing.JLabel lblColeccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaAdquisicion;
    private javax.swing.JLabel lblFoto;
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

    private void cargarCmb() {

        ArrayList<Autor> listaAutores = (ArrayList<Autor>) h.solicitarListaAutores();

        for (Autor autor : listaAutores) {
            cmbAutor.addItem(autor);
        }

        ArrayList<Estado> listaEstados = (ArrayList<Estado>) h.solicitarListaEstado();

        for (Estado estado : listaEstados) {
            cmbEstado.addItem(estado);
        }

        ArrayList<Coleccion> listaColecciones = (ArrayList<Coleccion>) h.solicitarListaColecciones();

        for (Coleccion coleccion : listaColecciones) {
            cmbColeccion.addItem(coleccion);
        }

    }

    private void refrescarTabla() {

        ArrayList<Comic> listaComics = (ArrayList<Comic>) h.solicitarListaComic();

        TablaComics modeloTabla = new TablaComics(listaComics, h);
        tablaComics.setModel(modeloTabla);

    }

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

            hb.enableHelpKey(txtTitulo, "panelcomics", helpset);
        } catch (HelpSetException ex) {
            Logger.getLogger(PaginaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      
    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblGestionComics.setText(rb.getString("lblGestionComics"));
        lblAnhadir.setText(rb.getString("lblAnhadirComic"));
        lblFechaAdquisicion.setText(rb.getString("lblFechaAdquisicion"));
        btnAnhadirComic.setText(rb.getString("btnAñadir"));
        
        noImagen = rb.getString("noImagen");
        huboProblema = rb.getString("huboProblema");
        camposObligatorios = rb.getString("camposObligatorios");
        
        errorCreadoComic = rb.getString("errorCreadoComic");
        comicCreado = rb.getString("comicCreado");
        existeComic = rb.getString("existeComic");
        errorBorradoComic = rb.getString("errorBorradoComic");
        comicEliminado = rb.getString("comicEliminado");
        noExisteComic = rb.getString("noExisteComic");

    }

}
