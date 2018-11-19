/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeEmpleados {

    /**
     * Busca un empleados pertenecientes a una empresa
     *
     * @param codigoDeEmpresa
     * @return
     * @throws SQLException
     */
    public ArrayList<Empleado> buscarEmpleadosSegunEmpresa(String codigoDeEmpresa) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Empleado> listaDeEmpleados = new ArrayList<>();
        String instruccionSql = "SELECT * FROM EMPLEADO WHERE CodigoDeEmpresaParaEmpleado=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, codigoDeEmpresa);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String nombreEmpleado = miResult.getString(1);
            String idEmpleado = miResult.getString(2);
            String contrasenaEmpleado = miResult.getString(3);
            String tipoDeEmpleado = miResult.getString(4);
            String codigoDeEmpresaParaEmpleado = miResult.getString(5);
            double pagoSemanal = miResult.getDouble(6);
            Empleado nuevoEmpleado = new Empleado(nombreEmpleado, idEmpleado, contrasenaEmpleado, tipoDeEmpleado, codigoDeEmpresaParaEmpleado, pagoSemanal);
            listaDeEmpleados.add(nuevoEmpleado);
        }
        nuevaConexion.cerrarConexion();
        return listaDeEmpleados;
    }

    public Empleado buscarEmpleado(String id, String contrasena) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        Empleado empleadoActual = null;
        String instruccionSql = "SELECT * FROM EMPLEADO WHERE IdEmpleado=? AND ContrasenaEmpleado=SHA(?)";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, id);
        instruccionPreparada.setString(2, contrasena);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String nombreEmpleado = miResult.getString(1);
            String idEmpleado = miResult.getString(2);
            String contrasenaEmpleado = miResult.getString(3);
            String tipoDeEmpleado = miResult.getString(4);
            String codigoDeEmpresaParaEmpleado = miResult.getString(5);
            double pagoSemanal = miResult.getDouble(6);
            empleadoActual = new Empleado(nombreEmpleado, idEmpleado, contrasenaEmpleado, tipoDeEmpleado, codigoDeEmpresaParaEmpleado, pagoSemanal);
        }
        nuevaConexion.cerrarConexion();
        return empleadoActual;
    }

}
