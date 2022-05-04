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
import Modelo.TablaAutores;
import Modelo.TablaComics;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Manu Romeo
 */
public class GestionAutoresPanel extends javax.swing.JPanel {
    private String camposObligatorios;
    private String camposMarcados;
    private String fechaFormato;
    private String actorYaExiste;
    private String actorAnadido;
    private String actorBorrado;
    private String actorNoExiste;
    
    HiloCliente h;
    
    /**
     * Creates new form MoviesBoardPanel
     * @param h
     */
    public GestionAutoresPanel(HiloCliente h) {
        initComponents();
        
        this.h = h;
        
        ArrayList<Autor> listaAutores = (ArrayList<Autor>) h.solicitarListaAutores();

        TablaAutores modeloTabla = new TablaAutores(listaAutores);
        tablaAutores.setModel(modeloTabla);
        
        //traduccion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGestionActores = new javax.swing.JLabel();
        lblNombreActor = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        lblFechaNac = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnSeleccionFotoActor = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutores = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        txtFotoAutor = new javax.swing.JTextField();
        dateChooserFechaNac = new datechooser.beans.DateChooserCombo();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(700, 635));

        lblGestionActores.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGestionActores.setText("Gestión de autores");

        lblNombreActor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreActor.setText("Nombre y apellidos");

        lblFechaNac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFechaNac.setText("Fecha de nacimiento");

        lblFoto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFoto.setText("Foto");

        btnSeleccionFotoActor.setText(". . .");

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAutores);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        dateChooserFechaNac.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(71, 71, 71)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGestionActores, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(89, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNombreActor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreAutor)
                                .addComponent(txtFotoAutor)
                                .addComponent(dateChooserFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                        .addComponent(btnAnadir))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeleccionFotoActor)
                    .addGap(129, 129, 129))))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(lblGestionActores, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnEliminar)
                .addComponent(btnModificar))
            .addGap(38, 38, 38)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreActor)
                        .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addComponent(lblFechaNac))
                .addComponent(dateChooserFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblFoto)
                .addComponent(btnSeleccionFotoActor)
                .addComponent(txtFotoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
            .addComponent(btnAnadir)
            .addContainerGap())
    );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
       

        Autor autor = new Autor(WIDTH, actorBorrado, fechaNac)
        
        if (txtNombreAutor.getText().isBlank() || txtFotoAutor.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar cubiertos.");
        } else {

            if (h.solicitarGetAutor(txtNombreAutor.getText()) != null) {
                JOptionPane.showMessageDialog(null, "Ya existe un autor con el mismo nombre y apellidos asociado.");
            } else {

                int result = h.solicitarAnhadirComic(c);

                if (result == 1) {
                    JOptionPane.showMessageDialog(null, "El comic ha sido creado correctamente.");

                    imagen = null;

                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error durante la creación del cómic.");
                }

            }

        }


    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      /*  Actor actor = Controller.DBControllerMovies.getActor(txtNombreActor.getText(), txtApellidos.getText());

        if (txtNombreActor.getText().isBlank() || txtApellidos.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, camposMarcados);
        } else {
            if (actor != null) {

                Controller.DBControllerMovies.deleteActor(txtNombreActor.getText(), txtApellidos.getText());

                JOptionPane.showMessageDialog(null, actorBorrado);
            } else {
                JOptionPane.showMessageDialog(null, actorNoExiste);
            }
        }
*/
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSeleccionFotoActor;
    private datechooser.beans.DateChooserCombo dateChooserFechaNac;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblGestionActores;
    private javax.swing.JLabel lblNombreActor;
    private javax.swing.JTable tablaAutores;
    private javax.swing.JTextField txtFotoAutor;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables

    public static boolean validarFecha(String fechaIntroducida) {

        try {

            LocalDate fecha = LocalDate.parse(fechaIntroducida, DateTimeFormatter.ISO_LOCAL_DATE);
            return true;

        } catch (DateTimeParseException ex) {
            return false;
        }

    }
    
    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblGestionActores.setText(rb.getString("lblGestionActores"));
        lblFechaNac.setText(rb.getString("lblFechaNac"));
        lblFoto.setText(rb.getString("lblFoto"));
        lblNombreActor.setText(rb.getString("lblNombreActor"));
        
        
        btnAnadir.setText(rb.getString("btnAñadir"));
        btnEliminar.setText(rb.getString("btnEliminar"));
        
        camposObligatorios = rb.getString("camposObligatorios");
        camposMarcados = rb.getString("camposMarcados");
        actorYaExiste = rb.getString("actorYaExiste");
        actorAnadido = rb.getString("actorAnadido");
        fechaFormato = rb.getString("fechaFormato");
        actorNoExiste = rb.getString("actorNoExiste");
        actorBorrado = rb.getString("actorBorrado");
        
        

    }

}
