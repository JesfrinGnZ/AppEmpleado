/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Run;

/**
 *
 * @author jesfrin
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jesfrin
 */
public class GeneradorDeCodigos {

    public static String generarCodigo() {
        Date fecha = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss.SSS dd/MM/yyyy");
        return hourdateFormat.format(fecha);
    }

    public static void extenderTiempo() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(GeneradorDeCodigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
