/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Registro;

import Empresa.backend.Conexion.ManejadorDeConexion;
import Empresa.backend.Entidades.Alimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jesfrin
 */
public class BusquedaDeAlimentos {
        public ArrayList<Alimento> buscarAlimentos() throws SQLException {
        ManejadorDeConexion nuevaConexion = new ManejadorDeConexion();
        ArrayList<Alimento> listaDeAlimentos = new ArrayList<>();
        String instruccionSql = "SELECT * FROM ALIMENTO  ";
        PreparedStatement instruccionPreparada = nuevaConexion.getMiConexion().prepareStatement(instruccionSql);
        ResultSet miResult = instruccionPreparada.executeQuery();
        while (miResult.next()) {
            String nombre = miResult.getString(1);
            double costo = miResult.getInt(2);
            String activa = miResult.getString(3);
            Alimento nuevoAlimento = new Alimento(nombre, costo, activa);
            listaDeAlimentos.add(nuevoAlimento);
        }
        nuevaConexion.cerrarConexion();
        return listaDeAlimentos;
    }
}
