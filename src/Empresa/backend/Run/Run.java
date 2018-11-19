/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.backend.Run;

import Empresa.backend.Entidades.Empleado;
import Empresa.gui.Frames.LoginFrame1;

/**
 *
 * @author jesfrin
 */
public class Run {
    
    public final static Empleado SUPER_USUARIO = new Empleado("ROOT", "ROOT", "ROOT");
    
    
    public static void main(String[] args) {
        LoginFrame1 nuevoLogin = new LoginFrame1();
        nuevoLogin.setVisible(true);
    }
}
