/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeEmpresas {

    /**
     * Busqueda de empresas solo por direccion
     *
     * @param direccion
     * @param tipoEmpresa
     * @return
     * @throws SQLException
     */
    public Empresa buscarEmpresaConDireccion(String direccion, String tipoEmpresa) throws SQLException {
        Empresa nuevaEmpresa = null;
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        String instruccionSql = "SELECT * FROM EMPRESA WHERE DireccionDeEmpresa = ? AND TipoDeEmpresa= ?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, direccion);
        instruccionPreparada.setString(2, tipoEmpresa);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String tipoDeEmpresa = miResult.getString(1);
            String nombreDeEmpresa = miResult.getString(2);
            String direccionDeEmpresa = miResult.getString(3);
            String codigoDeEmpresa = miResult.getString(4);
            nuevaEmpresa = new Empresa(tipoDeEmpresa, nombreDeEmpresa, direccionDeEmpresa, codigoDeEmpresa);
        }
        nuevaConexion.cerrarConexion();
        return nuevaEmpresa;
    }

    /**
     * Busqueda de empresas segun tipo
     * @param tipoDeEmpresa
     * @return
     * @throws SQLException 
     */
    public ArrayList<Empresa> buscarEmpresas(String tipoDeEmpresa) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Empresa> listaDeEmpresas = new ArrayList<>();
        String instruccionSql = "SELECT * FROM EMPRESA WHERE TipoDeEmpresa=?";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        instruccionPreparada.setString(1, tipoDeEmpresa);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String tipoEmpresa = miResult.getString(1);
            String nombreDeEmpresa = miResult.getString(2);
            String direccionDeEmpresa = miResult.getString(3);
            String codigoDeEmpresa = miResult.getString(4);
            Empresa nuevaEmpresa = new Empresa(tipoEmpresa, nombreDeEmpresa, direccionDeEmpresa, codigoDeEmpresa);
            listaDeEmpresas.add(nuevaEmpresa);
        }
        nuevaConexion.cerrarConexion();
        return listaDeEmpresas;
    }
}
