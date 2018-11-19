/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Alimento;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author jesfrin
 */
public class RegistroDeAlimentos {

    public void escribirAlimento(Alimento nuevoAlimento) throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();//Se crea la conexion
        String instruccionSql = "INSERT INTO ALIMENTO(NombreAlimento,CostoAlimento,AlimentoActivo)"
                + " " + "VALUES (?,?,?)";//Se crea la instruccion 
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);//Se crea la instruccion preparada
        instruccionPreparada.setString(1, nuevoAlimento.getNombre());//Se anaden valores
        instruccionPreparada.setDouble(2, nuevoAlimento.getCosto());
        instruccionPreparada.setString(3, nuevoAlimento.getEstaActivo());//Se anaden valores
        instruccionPreparada.execute();//Se ejecuta la instruccion
        nuevaConexion.cerrarConexion();//Se cierra la conexion
    }

}
