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
public class RegistroDeEmpleados {

    public void escribirEmpleado(Empleado nuevoEmpleado) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();//Se crea la conexion
        String instruccionSql = "INSERT INTO EMPLEADO(NombreEmpleado,IdEmpleado,ContrasenaEmpleado,TipoDeEmpleado,CodigoDeEmpresaParaEmpleado,PagoSemanal)"
                + " " + "VALUES (?,?,SHA(?),?,?,?)";//Se crea la instruccion 
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);//Se crea la instruccion preparada
        instruccionPreparada.setString(1, nuevoEmpleado.getNombre());
        instruccionPreparada.setString(2, nuevoEmpleado.getIdEmpleado());//Se anaden valores
        instruccionPreparada.setString(3, nuevoEmpleado.getContrasenaEmpleado());
        instruccionPreparada.setString(4, nuevoEmpleado.getTipoDeEmpleado());
        instruccionPreparada.setString(5, nuevoEmpleado.getCodigoDeEmpresaParaEmpleado());
        instruccionPreparada.setDouble(6, nuevoEmpleado.getPagoSemanal());
        instruccionPreparada.execute();//Se ejecuta la instruccion
        nuevaConexion.cerrarConexion();//Se cierra la conexion
    }
}
