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
public class Cliente {

    private String nombre;
    private String contrasena;
    private String id;

    public Cliente(String nombre, String contrasena, String id) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.id = id;
    }

    public Cliente(String contrasena, String id) {
        this.contrasena = contrasena;
        this.id = id;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
