/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.HiloCliente;
import Modelo.Autor;
import Utiles.UtilMethods;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Manu Romeo
 */
public class ModificarAutorDialog extends javax.swing.JDialog {

    HiloCliente h;
    Autor autorModificar;
    byte[] imagen;
    private String huboProblema;
    private String noImagen;
    private String noExisteAutor;
    private String errorModificacionAutor;
    private String autorModificado;
    private String camposObligatorios;

    /**
     * Creates new form ModificarAutorDialog
     *
     * @param parent
     * @param modal
     * @param autor
     * @param h
     */
    public ModificarAutorDialog(java.awt.Frame parent, boolean modal, Autor autor, HiloCliente h) {
        super(parent, modal);
        try {
            initComponents();
            
            traduccion();

            this.h = h;
            this.autorModificar = autor;

            txtNombreAutor.setText(autor.getNombre());
            dateChooserFechaNac.setSelectedDate(UtilMethods.toCalendar(autor.getFechaNac()));
            txtFotoAutor.setText(autor.getUrlFoto());

            if (autor.getFoto() != null) {

                BufferedImage img = ImageIO.read(new ByteArrayInputStream(autor.getFoto()));

                lblImagen.setIcon(new ImageIcon(img));

            }

        } catch (IOException ex) {
            Logger.getLogger(ModificarAutorDialog.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        lblGestionActores = new javax.swing.JLabel();
        lblNombreAutor = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        lblFechaNac = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        txtFotoAutor = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnSeleccionFotoActor = new javax.swing.JButton();
        dateChooserFechaNac = new datechooser.beans.DateChooserCombo();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblGestionActores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGestionActores.setText("Modificación de autores");

        lblNombreAutor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreAutor.setText("Nombre y apellidos");

        lblFechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFechaNac.setText("Fecha de nacimiento");

        lblFoto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFoto.setText("Foto");

        txtFotoAutor.setEditable(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSeleccionFotoActor.setText(". . .");
        btnSeleccionFotoActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionFotoActorActionPerformed(evt);
            }
        });

        dateChooserFechaNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
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
    dateChooserFechaNac.setCalendarPreferredSize(new java.awt.Dimension(300, 180));
    dateChooserFechaNac.setFormat(2);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblGestionActores, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnModificar)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateChooserFechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFotoAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnSeleccionFotoActor)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lblGestionActores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreAutor)
                        .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFechaNac)
                        .addComponent(dateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFoto)
                        .addComponent(txtFotoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeleccionFotoActor))
                    .addGap(18, 18, 18)
                    .addComponent(btnModificar)))
            .addContainerGap(118, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (autorModificar != null) {
            if (txtNombreAutor.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, camposObligatorios);
            } else {

                Autor autor = new Autor(autorModificar.getIdAutor(), txtNombreAutor.getText(), dateChooserFechaNac.getSelectedDate().getTime(), autorModificar.getFoto(), txtFotoAutor.getText());

                int result = h.solicitarUpdateAutor(autor);

                if (result == 1) {
                    JOptionPane.showMessageDialog(null, autorModificado);

                    this.dispose();
                    imagen = null;

                } else {
                    JOptionPane.showMessageDialog(null, errorModificacionAutor);
                }

            }

        } else {

            JOptionPane.showMessageDialog(null, noExisteAutor);

        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnSeleccionFotoActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionFotoActorActionPerformed

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
        this.imagen = imageBytes;
        
        autorModificar.setFoto(imagen);
        
        lblImagen.setIcon(new ImageIcon(new ImageIcon(this.imagen).getImage().getScaledInstance(lblImagen.getSize().width,
                lblImagen.getSize().height, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btnSeleccionFotoActorActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarAutorDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarAutorDialog dialog = new ModificarAutorDialog(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionFotoActor;
    private datechooser.beans.DateChooserCombo dateChooserFechaNac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGestionActores;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreAutor;
    private javax.swing.JTextField txtFotoAutor;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables


     private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblNombreAutor.setText(rb.getString("lblNombreAutor"));
        lblFechaNac.setText(rb.getString("lblFechaNac"));
        
        noExisteAutor = rb.getString("noExisteAutor");
        noImagen = rb.getString("noImagen");
        huboProblema = rb.getString("huboProblema");
        autorModificado = rb.getString("autorModificado");
        camposObligatorios = rb.getString("camposObligatorios");
        errorModificacionAutor = rb.getString("errorModificacionAutor");
    }
    
    
}
