/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Manu Romeo
 */
public class UtilMethods {

    public static Calendar toCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    /**
     * Devuelve el texto asociado al identificador en el idioma de la
     * aplicación.
     *
     * @param key el identificador del texto.
     * @return texto traducido al idioma de la aplicación.
     */
    public static String translateString(String key) {
        ResourceBundle rb = ResourceBundle.getBundle("languages.translation");
        return rb.getString(key);
    }

    /**
     * Abre un explorador de ficheros y devuelve una imagen.
     *
     * @return imagen.
     * @throws NoImageSelectedException si no hay ninguna imagen seleccionada.
     * @throws SelectedFileIsNotImageException si el fichero seleccionado no es
     * una imagen.
     * @throws ImageCouldNotBeLoadedException si no se pudo cargar la imagen.
     */
    public static byte[] getImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("jpeg", "jpg", "png"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        int result = fileChooser.showOpenDialog(null);

        if (result != JFileChooser.APPROVE_OPTION) {
            System.out.println("");
        }

        File image = fileChooser.getSelectedFile();
        try {
            if (ImageIO.read(image) == null) {
                //throw new SelectedFileIsNotImageException();
            }
        } catch (IOException e) {
            //throw new SelectedFileIsNotImageException();
        }
        byte[] imageBytes = null;
        try ( FileInputStream fis = new FileInputStream(image)) {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            for (int dataLength; (dataLength = fis.read(buffer)) != -1;) {
                baos.write(buffer, 0, dataLength);
            }
            imageBytes = baos.toByteArray();
        } catch (IOException e) {
            //throw new ImageCouldNotBeLoadedException();
        }
        return imageBytes; 
    }

}
