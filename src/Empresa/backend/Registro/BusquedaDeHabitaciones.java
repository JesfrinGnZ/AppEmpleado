/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Habitacion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeHabitaciones {

    /**
     * Buscar habitacion de una hotel en especifico
     *
     * @param codigoDeHotel
     * @return
     * @throws SQLException
     */
    public ArrayList<Habitacion> buscarHabitaciones(String codigoDeHotel) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Habitacion> listaDeHabitciones = new ArrayList<>();
        String instruccionSql = "SELECT * FROM HABITACION WHERE CodigoDeHotel=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, codigoDeHotel);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String codigoHabitcion = miResult.getString(1);
            String codigoDeHotel1 = miResult.getString(2);
            int piso = miResult.getInt(3);
            String tipoDeHabitacion = miResult.getString(4);
            double costoPorNoche = miResult.getDouble(5);
            double costoDeMantnimiento = miResult.getDouble(6);
            int numeroDeHabitacion = miResult.getInt(7);
            String estaActiva = miResult.getString(8);
            Habitacion nuevaHabitacion = new Habitacion(codigoHabitcion, codigoDeHotel1, piso, tipoDeHabitacion, costoPorNoche, costoDeMantnimiento, numeroDeHabitacion, estaActiva);
            listaDeHabitciones.add(nuevaHabitacion);
        }
        nuevaConexion.cerrarConexion();
        return listaDeHabitciones;
    }

    /**
     * Buscar habitacion de una empresa y numeroespecifico
     *
     * @param codigoDeHotel
     * @param numeroDeHabitacion
     * @return
     * @throws SQLException
     */
    public Habitacion buscarHabitacionRepetida(String codigoDeHotel, int numeroDeHabitacion) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        Habitacion habitacionEncontrada = null;
        String instruccionSql = "SELECT * FROM HABITACION WHERE CodigoDeHotel=? AND NumeroDeHabitacion=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, codigoDeHotel);
        instruccionPreparada.setInt(2, numeroDeHabitacion);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String codigoHabitcion = miResult.getString(1);
            String codigoDeHotel1 = miResult.getString(2);
            int piso = miResult.getInt(3);
            String tipoDeHabitacion = miResult.getString(4);
            double costoPorNoche = miResult.getDouble(5);
            double costoDeMantnimiento = miResult.getDouble(6);
            int numHabitacion = miResult.getInt(7);
            String estaActiva = miResult.getString(8);
            habitacionEncontrada = new Habitacion(codigoHabitcion, codigoDeHotel1, piso, tipoDeHabitacion, costoPorNoche, costoDeMantnimiento, numHabitacion, estaActiva);
        }
        nuevaConexion.cerrarConexion();
        return habitacionEncontrada;
    }

    public ArrayList<Habitacion> buscarHabitacionesSinReservacion(Date fechaCheckin, Date fechaCheckOut, String codigoDeEmpresa) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Habitacion> habitacionesDisponibles = new ArrayList<>();
        ArrayList<String> codigoDeHabitacionesNoDisponibles = new ArrayList<>();
        //Hallando habitaciones reservadas en fecha especificada
        String instruccionSql = "SELECT CodigoHabitacionReservacion FROM RESERVACION WHERE CodigoHotelReservacion=? AND (FechaCheckInReservacion BETWEEN ? AND ? OR FechaCheckOutReservacion BETWEEN ? AND ?)";
        PreparedStatement miPreparedStatement = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        miPreparedStatement.setString(1, codigoDeEmpresa);
        miPreparedStatement.setDate(2, fechaCheckin);
        miPreparedStatement.setDate(3, fechaCheckOut);
        miPreparedStatement.setDate(4, fechaCheckin);
        miPreparedStatement.setDate(5, fechaCheckOut);

        ResultSet miResult = miPreparedStatement.executeQuery();
        while (miResult.next()) {
            String codigoHabitcion = miResult.getString(1);
            codigoDeHabitacionesNoDisponibles.add(codigoHabitcion);
        }
        //Bucado habitaciones disponibles
        String instruccionSql2 = "SELECT * FROM HABITACION WHERE CodigoDeHotel=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql2);
        instruccionPreparada.setString(1, codigoDeEmpresa);
        ResultSet miResult2 = instruccionPreparada.executeQuery();
        while (miResult2.next()) {
            String codigoHabitcion = miResult2.getString(1);
            String codigoDeHotel1 = miResult2.getString(2);
            int piso = miResult2.getInt(3);
            String tipoDeHabitacion = miResult2.getString(4);
            double costoPorNoche = miResult2.getDouble(5);
            double costoDeMantnimiento = miResult2.getDouble(6);
            int numHabitacion = miResult2.getInt(7);
            String estaActiva = miResult2.getString(8);
            boolean esHabitacionNoDisponible = false;
            for (String codigoDeHabitacionesNoDisponible : codigoDeHabitacionesNoDisponibles) {
                if (codigoDeHabitacionesNoDisponible.equals(codigoHabitcion)) {
                    esHabitacionNoDisponible = true;
                    break;
                }
            }
            if (!esHabitacionNoDisponible) {
                habitacionesDisponibles.add(new Habitacion(codigoHabitcion, codigoDeHotel1, piso, tipoDeHabitacion, costoPorNoche, costoDeMantnimiento, numHabitacion, estaActiva));
            }
        }
        nuevaConexion.cerrarConexion();

        return habitacionesDisponibles;
    }
}
