/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Empleado;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class ActualizacionDeEmpleado {

    public void actualizarEmpleado(Empleado empleadoActualizado, String idAntiguo) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        String instruccionSql = "UPDATE EMPLEADO SET NombreEmpleado=?, IdEmpleado=?, ContrasenaEmpleado=SHA(?), TipoDeEmpleado=? ,PagoSemanal=? WHERE IdEmpleado =?";
        PreparedStatement miPreparedStatement = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        miPreparedStatement.setString(1, empleadoActualizado.getNombre());
        miPreparedStatement.setString(2, empleadoActualizado.getIdEmpleado());
        miPreparedStatement.setString(3, empleadoActualizado.getContrasenaEmpleado());
        miPreparedStatement.setString(4, empleadoActualizado.getTipoDeEmpleado());
        miPreparedStatement.setDouble(5, empleadoActualizado.getPagoSemanal());
        miPreparedStatement.setString(6, idAntiguo);
        miPreparedStatement.execute();
        nuevaConexion.cerrarConexion();

    }

}
