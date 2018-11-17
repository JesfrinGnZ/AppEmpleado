/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Entidades;

/**
 *
 * @author jesfrin
 */
public class Empresa {
    
    private String tipoDeEmpresa;
    private String nombreDeEmpresa;
    private String direccionDeEmpresa;
    private String codigoDeEmpresa;

    public Empresa(String tipoDeEmpresa, String nombreDeEmpresa, String direccionDeEmpresa, String codigoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
        this.nombreDeEmpresa = nombreDeEmpresa;
        this.direccionDeEmpresa = direccionDeEmpresa;
        this.codigoDeEmpresa = codigoDeEmpresa;
    }

    public String getTipoDeEmpresa() {
        return tipoDeEmpresa;
    }

    public void setTipoDeEmpresa(String tipoDeEmpresa) {
        this.tipoDeEmpresa = tipoDeEmpresa;
    }

    public String getNombreDeEmpresa() {
        return nombreDeEmpresa;
    }

    public void setNombreDeEmpresa(String nombreDeEmpresa) {
        this.nombreDeEmpresa = nombreDeEmpresa;
    }

    public String getDireccionDeEmpresa() {
        return direccionDeEmpresa;
    }

    public void setDireccionDeEmpresa(String direccionDeEmpresa) {
        this.direccionDeEmpresa = direccionDeEmpresa;
    }

    public String getCodigoDeEmpresa() {
        return codigoDeEmpresa;
    }

    public void setCodigoDeEmpresa(String codigoDeEmpresa) {
        this.codigoDeEmpresa = codigoDeEmpresa;
    }
    
}
