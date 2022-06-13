/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.HiloCliente;
import Modelo.Autor;
import java.util.ArrayList;
import java.util.ResourceBundle;


/**
 *
 * @author Manu Romeo
 */
public class InformesAutoresPanel extends javax.swing.JPanel {

    /**
     * Creates new form MoviesBoardPanel
     * @param h
     */
    public InformesAutoresPanel(HiloCliente h) {
        initComponents();

        ArrayList<Autor> listaAutores = (ArrayList<Autor>) h.solicitarListaAutores();
        
        for (Autor autor : listaAutores) {
            cmbAutor.addItem(autor);
        }
        
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

        VerInformeAutores = new javax.swing.JButton();
        VerInformeComicsAutor = new javax.swing.JButton();
        lblAutor = new javax.swing.JLabel();
        lblGeneracionInformesAutores = new javax.swing.JLabel();
        cmbAutor = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(518, 491));

        VerInformeAutores.setBackground(new java.awt.Color(204, 0, 0));
        VerInformeAutores.setForeground(new java.awt.Color(255, 255, 255));
        VerInformeAutores.setText("Ver informe de autores");
        VerInformeAutores.setBorderPainted(false);
        VerInformeAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInformeAutoresActionPerformed(evt);
            }
        });

        VerInformeComicsAutor.setBackground(new java.awt.Color(204, 0, 0));
        VerInformeComicsAutor.setForeground(new java.awt.Color(255, 255, 255));
        VerInformeComicsAutor.setText("Ver informe de cómics por autor");
        VerInformeComicsAutor.setBorderPainted(false);
        VerInformeComicsAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInformeComicsAutorActionPerformed(evt);
            }
        });

        lblAutor.setText("Autor:");

        lblGeneracionInformesAutores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGeneracionInformesAutores.setText("Generación de informes: Autores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerInformeAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VerInformeComicsAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAutor)
                        .addGap(18, 18, 18)
                        .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGeneracionInformesAutores))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblGeneracionInformesAutores)
                .addGap(32, 32, 32)
                .addComponent(VerInformeAutores)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerInformeComicsAutor)
                    .addComponent(lblAutor)
                    .addComponent(cmbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(336, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerInformeAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInformeAutoresActionPerformed
     /*   try {                                                  
            File informeFile = new File(this.getClass().getResource("/Informes/InformeActores.jrxml").getFile());
            System.out.println(informeFile.getCanonicalPath());
            try {
                
                Statement st = Controller.DBConnector.getConexion().createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM peliculas.actor");
                
                JRResultSetDataSource dataSource = new JRResultSetDataSource(rs);
                
                JasperReport report = JasperCompileManager.compileReport(informeFile.toString());
                
                JasperPrint visor = JasperFillManager.fillReport(report, null, dataSource);
                
                JasperViewer.viewReport(visor, false);
                
            } catch (SQLException | JRException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la generación del informe.");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(InformesAutoresPanel.class.getName()).log(Level.SEVERE,null, ex);
        }
*/
    }//GEN-LAST:event_VerInformeAutoresActionPerformed

    private void VerInformeComicsAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInformeComicsAutorActionPerformed
      /*  String informe = "./src/Informes/InformePeliculasActor.jrxml";

        try {
            Actor actor = (Actor) cmbActor.getSelectedItem();

            PreparedStatement st = Controller.DBConnector.getConexion().prepareStatement("SELECT DISTINCT pelicula.* FROM pelicula INNER JOIN pelicula_actor\n"
                    + "	ON pelicula_actor.idPelicula = pelicula.idPelicula\n"
                    + "	WHERE pelicula_actor.idActor =  ? ");
            st.setInt(1, actor.getIdActor());

            ResultSet rs = st.executeQuery();

            JRResultSetDataSource dataSource = new JRResultSetDataSource(rs);

            HashMap<String, Object> parametros = new HashMap<>();
            parametros.put("ID_ACTOR", actor.getIdActor());

            JasperReport report = JasperCompileManager.compileReport(informe);

            JasperPrint visor = JasperFillManager.fillReport(report, parametros, dataSource);

            JasperViewer.viewReport(visor, false);

        } catch (SQLException | JRException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la generación del informe.");
        }*/

    }//GEN-LAST:event_VerInformeComicsAutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerInformeAutores;
    private javax.swing.JButton VerInformeComicsAutor;
    private javax.swing.JComboBox<Autor> cmbAutor;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblGeneracionInformesAutores;
    // End of variables declaration//GEN-END:variables

    private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblGeneracionInformesAutores.setText(rb.getString("lblGeneracionInformesAutores"));

    }
}
