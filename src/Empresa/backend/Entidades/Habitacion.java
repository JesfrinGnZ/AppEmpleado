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
public class Habitacion {
    private String CodigoDeHotel;
    private int Piso;
    private String TipoDeHabitacion;
    private double CostoPorNoche;
    private double CostoDeMantnimiento;
    private int numeroDeHabitacion;
    private String estaActiva;

    public Habitacion(String CodigoDeHotel, int Piso, String TipoDeHabitacion, double CostoPorNoche, double CostoDeMantnimiento, int numeroDeHabitacion,String estaActiva) {
        this.CodigoDeHotel = CodigoDeHotel;
        this.Piso = Piso;
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.CostoPorNoche = CostoPorNoche;
        this.CostoDeMantnimiento = CostoDeMantnimiento;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.estaActiva=estaActiva;
    }

    public String getCodigoDeHotel() {
        return CodigoDeHotel;
    }

    public void setCodigoDeHotel(String CodigoDeHotel) {
        this.CodigoDeHotel = CodigoDeHotel;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public String getTipoDeHabitacion() {
        return TipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String TipoDeHabitacion) {
        this.TipoDeHabitacion = TipoDeHabitacion;
    }

    public double getCostoPorNoche() {
        return CostoPorNoche;
    }

    public void setCostoPorNoche(double CostoPorNoche) {
        this.CostoPorNoche = CostoPorNoche;
    }

    public double getCostoDeMantnimiento() {
        return CostoDeMantnimiento;
    }

    public void setCostoDeMantnimiento(double CostoDeMantnimiento) {
        this.CostoDeMantnimiento = CostoDeMantnimiento;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

  

    public String getEstaActiva() {
        return estaActiva;
    }

    public void setEstaActiva(String estaActiva) {
        this.estaActiva = estaActiva;
    }

}
