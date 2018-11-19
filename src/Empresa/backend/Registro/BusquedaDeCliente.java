/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeCliente {
    
       public Cliente buscarCliente(Cliente nuevoCliente) throws SQLException {
        Cliente clienteEncontrado = null;
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        String instruccionSql = "SELECT * FROM CLIENTE WHERE ID_Cliente = ? AND ContrasenaCliente= SHA(?)";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, nuevoCliente.getId());
        instruccionPreparada.setString(2, nuevoCliente.getContrasena());
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String nombre = miResult.getString(1);
            String contrasena = miResult.getString(2);
            String id = miResult.getString(3);
            clienteEncontrado = new Cliente(nombre, contrasena, id);
        }
        nuevaConexion.cerrarConexion();
        return clienteEncontrado;
    }
    
}
