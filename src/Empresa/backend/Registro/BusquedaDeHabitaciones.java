/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Habitacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeHabitaciones {

    public ArrayList<Habitacion> buscarEmpresas(String codigoDeHotel) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Habitacion> listaDeHabitciones = new ArrayList<>();
        String instruccionSql = "SELECT * FROM HABITACION WHERE CodigoDeHotel=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, codigoDeHotel);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String codigoDeHotel1 = miResult.getString(1);
            int piso = miResult.getInt(2);
            String tipoDeHabitacion = miResult.getString(3);
            double costoPorNoche = miResult.getDouble(4);
            double costoDeMantnimiento = miResult.getDouble(5);
            int numeroDeHabitacion = miResult.getInt(6);
            String estaActiva = miResult.getString(7);
            Habitacion nuevaHabitacion = new Habitacion(codigoDeHotel1, piso, tipoDeHabitacion, costoPorNoche, costoDeMantnimiento, numeroDeHabitacion, estaActiva);
            listaDeHabitciones.add(nuevaHabitacion);
        }
        nuevaConexion.cerrarConexion();
        return listaDeHabitciones;
    }

}
