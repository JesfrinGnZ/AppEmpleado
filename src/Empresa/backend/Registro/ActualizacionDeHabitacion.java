/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Habitacion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class ActualizacionDeHabitacion {

    public void actualizarHabitacion(Habitacion nuevaHabitacion,String codigoHabitacion) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        String instruccionSql = "UPDATE HABITACION SET Piso=?, TipoDeHabitacion=?, CostoPorNoche=?, CostoDeMantnimiento=? , EstaActiva=? WHERE CodigoDeHabitacion =?";
        PreparedStatement miPreparedStatement = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        miPreparedStatement.setInt(1, nuevaHabitacion.getPiso());
        miPreparedStatement.setString(2, nuevaHabitacion.getTipoDeHabitacion());
        miPreparedStatement.setDouble(3, nuevaHabitacion.getCostoPorNoche());
        miPreparedStatement.setDouble(4, nuevaHabitacion.getCostoDeMantnimiento());
        miPreparedStatement.setString(5, nuevaHabitacion.getEstaActiva());
        miPreparedStatement.setString(6,codigoHabitacion);
        miPreparedStatement.execute();
        nuevaConexion.cerrarConexion();

    }

}
