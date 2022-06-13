/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.HiloCliente;
import Modelo.Autor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;


/**
 *
 * @author Manu Romeo
 */
public class InformesComicsPanel extends javax.swing.JPanel {

    /**
     * Creates new form MoviesBoardPanel
     */
    public InformesComicsPanel(HiloCliente h) {
        initComponents();

        /*
        ArrayList<Movie> listaPeliculas = Controller.DBControllerMovies.getMovieList();
        ArrayList<Genre> listaGeneros = Controller.DBControllerMovies.getGenreList();
        txtVerPeliculas.setText("");

        for (Movie pelicula : listaPeliculas) {
            txtVerPeliculas.append(pelicula.toString() + "\n");
        }

        for (Genre genero : listaGeneros) {
            cmbGenero.addItem(genero);
        }
        */
        
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

        VerInformeComics = new javax.swing.JButton();
        VerInformeComicsColeccion = new javax.swing.JButton();
        lblGeneracionInformesComics = new javax.swing.JLabel();
        cmbColeccion = new javax.swing.JComboBox<>();
        lblColeccion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(518, 491));

        VerInformeComics.setBackground(new java.awt.Color(204, 0, 0));
        VerInformeComics.setForeground(new java.awt.Color(255, 255, 255));
        VerInformeComics.setText("Ver informe de cómics");
        VerInformeComics.setBorderPainted(false);
        VerInformeComics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInformeComicsActionPerformed(evt);
            }
        });

        VerInformeComicsColeccion.setBackground(new java.awt.Color(204, 0, 0));
        VerInformeComicsColeccion.setForeground(new java.awt.Color(255, 255, 255));
        VerInformeComicsColeccion.setText("Ver informe de cómics por colección");
        VerInformeComicsColeccion.setBorderPainted(false);
        VerInformeComicsColeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerInformeComicsColeccionActionPerformed(evt);
            }
        });

        lblGeneracionInformesComics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGeneracionInformesComics.setText("Generación de informes: Cómics");

        lblColeccion.setText("Colección:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VerInformeComics, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(VerInformeComicsColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblColeccion)
                        .addGap(18, 18, 18)
                        .addComponent(cmbColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblGeneracionInformesComics))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblGeneracionInformesComics)
                .addGap(18, 18, 18)
                .addComponent(VerInformeComics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColeccion)
                        .addComponent(cmbColeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VerInformeComicsColeccion))
                .addContainerGap(365, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerInformeComicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInformeComicsActionPerformed
       /* String informe = "./src/Informes/InformePeliculas.jrxml";

        try {

            Statement st = Controller.DBConnector.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM peliculas.pelicula");

            JRResultSetDataSource dataSource = new JRResultSetDataSource(rs);

            JasperReport report = JasperCompileManager.compileReport(informe);

            JasperPrint visor = JasperFillManager.fillReport(report, null, dataSource);

            JasperViewer.viewReport(visor, false);

        } catch (Exception e) {
        }
*/
    }//GEN-LAST:event_VerInformeComicsActionPerformed

    private void VerInformeComicsColeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerInformeComicsColeccionActionPerformed
       /* String informe = "./src/Informes/InformePeliculasGenero.jrxml";

        try {

            Genre genero = (Genre) cmbGenero.getSelectedItem();

            PreparedStatement st = Controller.DBConnector.getConexion().prepareStatement("SELECT * FROM peliculas.pelicula WHERE pelicula.idGenero = ?");
            st.setInt(1, genero.getIdGenre());

            ResultSet rs = st.executeQuery();

           
                JRResultSetDataSource dataSource = new JRResultSetDataSource(rs);

                HashMap<String, Object> parametros = new HashMap<>();
                parametros.put("idGenero", genero.getIdGenre());         
                
                System.out.println(parametros.get("idGenero"));
                System.out.println(genero.getIdGenre());
                
                JasperReport report = JasperCompileManager.compileReport(informe);

                JasperPrint visor = JasperFillManager.fillReport(report, parametros, dataSource);

                JasperViewer.viewReport(visor, false);
            

        } catch (Exception e) {
        }
*/
    }//GEN-LAST:event_VerInformeComicsColeccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerInformeComics;
    private javax.swing.JButton VerInformeComicsColeccion;
    private javax.swing.JComboBox<Autor> cmbColeccion;
    private javax.swing.JLabel lblColeccion;
    private javax.swing.JLabel lblGeneracionInformesComics;
    // End of variables declaration//GEN-END:variables

     private void traduccion() {

        ResourceBundle rb = ResourceBundle.getBundle("Idiomas.idioma");

        activarTraduccion(rb);

    }

    private void activarTraduccion(ResourceBundle rb) {

        lblGeneracionInformesComics.setText(rb.getString("lblGeneracionInformesComics"));
        

    }
}
