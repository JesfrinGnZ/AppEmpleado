/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Conexion;

/**
 *
 * @author jesfrin
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author jesfrin
 */
public class ManejadorDeConexion {

    private Connection miConexion;

    private static final String INICIO_DIRECCION = "jdbc:mysql://localhost:3306/";
    private static final String FIN_DIRECCION = "?autoReconnect=true&useSSL=false";
    public static String nombreBaseDeDatos = "EMPRESA_HOTELES_RESTAURANTES";
    public static String usuarioBaseDeDatos = "root";
    public static String contrasenaBaseDeDatos = "7321";

    public ManejadorDeConexion() throws SQLException {
        crearConexion();
    }

    public Connection getMiConexion() {
        return miConexion;
    }

    private void crearConexion() throws SQLException {//Templates
        Properties propiedades = new Properties();
        propiedades.setProperty("user", usuarioBaseDeDatos);
        propiedades.setProperty("password", contrasenaBaseDeDatos);
        this.miConexion = DriverManager.getConnection(INICIO_DIRECCION + nombreBaseDeDatos + FIN_DIRECCION, propiedades);
    }

    public void cerrarConexion() {
        try {
            miConexion.close();
        } catch (Exception ex) {

        }
    }

}
