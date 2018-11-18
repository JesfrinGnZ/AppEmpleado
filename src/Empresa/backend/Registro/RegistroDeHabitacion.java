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
public class RegistroDeHabitacion {

    public void escribirHabitacion(Habitacion nuevaHabitacion) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();//Se crea la conexion
        String instruccionSql = "INSERT INTO HABITACION(CodigoDeHotel,Piso,TipoDeHabitacion,CostoPorNoche,CostoDeMantnimiento,NumeroDeHabitacion,EstaActiva)"
                + " " + "VALUES (?,?,?,?,?,?,?)";//Se crea la instruccion 
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);//Se crea la instruccion preparada
        instruccionPreparada.setString(1, nuevaHabitacion.getCodigoDeHotel());
        instruccionPreparada.setInt(2, nuevaHabitacion.getPiso());//Se anaden valores
        instruccionPreparada.setString(3, nuevaHabitacion.getTipoDeHabitacion());
        instruccionPreparada.setDouble(4, nuevaHabitacion.getCostoPorNoche());
        instruccionPreparada.setDouble(5, nuevaHabitacion.getCostoDeMantnimiento());
        instruccionPreparada.setInt(6, nuevaHabitacion.getNumeroDeHabitacion());
        instruccionPreparada.setString(7, nuevaHabitacion.getEstaActiva());
        instruccionPreparada.execute();//Se ejecuta la instruccion
        nuevaConexion.cerrarConexion();//Se cierra la conexion
    }
}
