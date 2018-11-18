/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class EliminacionDeEmpleados {
    /**
     * Eliminacion de empleado segun su id
     * @param idEmpleado
     * @throws SQLException 
     */
        public void borrarEmpleado(String idEmpleado) throws SQLException{
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        String instruccionSql = "DELETE FROM EMPLEADO WHERE IdEmpleado=?";
        PreparedStatement miPreparedStatement = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        miPreparedStatement.setString(1, idEmpleado);
        miPreparedStatement.execute();
        nuevaConexion.cerrarConexion();
    }
}
