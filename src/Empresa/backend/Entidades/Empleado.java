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
public class Empleado {
    
    private String idEmpleado;
    private String contrasenaEmpleado;
    private String tipoDeEmpleado;
    private String codigoDeEmpresaParaEmpleado;
    private boolean pagoSemanal;

    public Empleado(String idEmpleado, String contrasenaEmpleado, String tipoDeEmpleado, String codigoDeEmpresaParaEmpleado, boolean pagoSemanal) {
        this.idEmpleado = idEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.tipoDeEmpleado = tipoDeEmpleado;
        this.codigoDeEmpresaParaEmpleado = codigoDeEmpresaParaEmpleado;
        this.pagoSemanal = pagoSemanal;
    }

    public Empleado(String idEmpleado, String contrasenaEmpleado, String tipoDeEmpleado) {
        this.idEmpleado = idEmpleado;
        this.contrasenaEmpleado = contrasenaEmpleado;
        this.tipoDeEmpleado = tipoDeEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getContrasenaEmpleado() {
        return contrasenaEmpleado;
    }

    public void setContrasenaEmpleado(String contrasenaEmpleado) {
        this.contrasenaEmpleado = contrasenaEmpleado;
    }

    public String getTipoDeEmpleado() {
        return tipoDeEmpleado;
    }

    public void setTipoDeEmpleado(String tipoDeEmpleado) {
        this.tipoDeEmpleado = tipoDeEmpleado;
    }

    public String getCodigoDeEmpresaParaEmpleado() {
        return codigoDeEmpresaParaEmpleado;
    }

    public void setCodigoDeEmpresaParaEmpleado(String codigoDeEmpresaParaEmpleado) {
        this.codigoDeEmpresaParaEmpleado = codigoDeEmpresaParaEmpleado;
    }

    public boolean isPagoSemanal() {
        return pagoSemanal;
    }

    public void setPagoSemanal(boolean pagoSemanal) {
        this.pagoSemanal = pagoSemanal;
    }
    
}
