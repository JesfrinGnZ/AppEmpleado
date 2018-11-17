/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Empresa;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class RegistroDeEmpresas {
    
    
    
    public void escribirEmpresa(Empresa nuevaEmpresa) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();//Se crea la conexion
        String instruccionSql = "INSERT INTO EMPRESA(TipoDeEmpresa,NombreDeEmpresa,DireccionDeEmpresa,CodigoDeEmpresa)"
                + " " + "VALUES (?,?,?,?)";//Se crea la instruccion 
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);//Se crea la instruccion preparada
        instruccionPreparada.setString(1, nuevaEmpresa.getTipoDeEmpresa());//Se anaden valores
        instruccionPreparada.setString(2, nuevaEmpresa.getNombreDeEmpresa());
        instruccionPreparada.setString(3, nuevaEmpresa.getDireccionDeEmpresa());
        instruccionPreparada.setString(4, nuevaEmpresa.getCodigoDeEmpresa());
        instruccionPreparada.execute();//Se ejecuta la instruccion
        nuevaConexion.cerrarConexion();//Se cierra la conexion
    }
    
    
}
