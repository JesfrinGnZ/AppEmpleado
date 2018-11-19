/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class RegistroDeClientes {
    
        public void escribirEmpleado(Cliente nuevoCliente) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();//Se crea la conexion
        String instruccionSql = "INSERT INTO CLIENTE(NombreCliente,ContrasenaCliente,ID_Cliente)"
                + " " + "VALUES (?,SHA(?),?)";//Se crea la instruccion 
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);//Se crea la instruccion preparada
        instruccionPreparada.setString(1, nuevoCliente.getNombre());//Se anaden valores
        instruccionPreparada.setString(2, nuevoCliente.getContrasena());
        instruccionPreparada.setString(3, nuevoCliente.getId());
        instruccionPreparada.execute();//Se ejecuta la instruccion
        nuevaConexion.cerrarConexion();//Se cierra la conexion
    }
    
}
