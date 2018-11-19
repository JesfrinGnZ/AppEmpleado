/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa.gui.Frames;

import Empresa.backend.Entidades.Cliente;
import Empresa.backend.Entidades.Empleado;
import Empresa.backend.Entidades.Empresa;
import Empresa.backend.Registro.BusquedaDeCliente;
import Empresa.backend.Registro.BusquedaDeEmpleados;
import Empresa.backend.Registro.BusquedaDeEmpresas;
import Empresa.backend.Registro.RegistroDeClientes;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jesfrin
 */


public class LoginFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame1() {
        this.setTitle("EMPRESA HOTELERA Y DE RESTAURANTES");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanelSlider = new diu.swe.habib.JPanelSlider.JPanelSlider();
        loginClientePanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        contrasenaLabel = new javax.swing.JLabel();
        identificacionTextFiled = new javax.swing.JTextField();
        contrasenaPaswordField = new javax.swing.JPasswordField();
        infoLabelLabel = new javax.swing.JLabel();
        accederButton = new javax.swing.JButton();
        resgistrarseButton = new javax.swing.JButton();
        appClienteLabel = new javax.swing.JLabel();
        registroClientePanel = new javax.swing.JPanel();
        registroNombreLabel = new javax.swing.JLabel();
        idRegistroLabel = new javax.swing.JLabel();
        contrasenaRegistroLabel = new javax.swing.JLabel();
        registroLabel = new javax.swing.JLabel();
        registrarseBaseDeDatosButton = new javax.swing.JButton();
        nombreRegistroTextField = new javax.swing.JTextField();
        idRegistroTextField = new javax.swing.JTextField();
        registroPasswordField = new javax.swing.JPasswordField();
        cancelarRegistroButton = new javax.swing.JButton();
        empleadoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idInicioSesionTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inicioSesionButton = new javax.swing.JButton();
        contrasenaSesionTextField = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cambioAEmpleadoMenuItem = new javax.swing.JMenuItem();
        cambioAClienteMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLabel.setText("Identificacion:");

        contrasenaLabel.setText("Contrasena:");

        infoLabelLabel.setText("No posee una cuenta?? Registrese ");

        accederButton.setText("Acceder");
        accederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederButtonActionPerformed(evt);
            }
        });

        resgistrarseButton.setText("Registrarse");
        resgistrarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resgistrarseButtonActionPerformed(evt);
            }
        });

        appClienteLabel.setText("App del Cliente");

        javax.swing.GroupLayout loginClientePanelLayout = new javax.swing.GroupLayout(loginClientePanel);
        loginClientePanel.setLayout(loginClientePanelLayout);
        loginClientePanelLayout.setHorizontalGroup(
            loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginClientePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginClientePanelLayout.createSequentialGroup()
                        .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idLabel)
                            .addComponent(contrasenaLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contrasenaPaswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(identificacionTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginClientePanelLayout.createSequentialGroup()
                        .addComponent(infoLabelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resgistrarseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginClientePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appClienteLabel)
                .addGap(184, 184, 184))
        );
        loginClientePanelLayout.setVerticalGroup(
            loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginClientePanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(appClienteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(identificacionTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenaLabel)
                    .addComponent(contrasenaPaswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(accederButton)
                .addGap(18, 18, 18)
                .addGroup(loginClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabelLabel)
                    .addComponent(resgistrarseButton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        loginPanelSlider.add(loginClientePanel, "card2");

        registroNombreLabel.setText("Nombre:");

        idRegistroLabel.setText("Id:");

        contrasenaRegistroLabel.setText("Contrasena:");

        registroLabel.setText("Registro ");

        registrarseBaseDeDatosButton.setText("Registrarse");
        registrarseBaseDeDatosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseBaseDeDatosButtonActionPerformed(evt);
            }
        });

        cancelarRegistroButton.setText("Cancelar");
        cancelarRegistroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarRegistroButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registroClientePanelLayout = new javax.swing.GroupLayout(registroClientePanel);
        registroClientePanel.setLayout(registroClientePanelLayout);
        registroClientePanelLayout.setHorizontalGroup(
            registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroClientePanelLayout.createSequentialGroup()
                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registroClientePanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registroClientePanelLayout.createSequentialGroup()
                                .addComponent(contrasenaRegistroLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registroPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroClientePanelLayout.createSequentialGroup()
                                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registroNombreLabel)
                                    .addComponent(idRegistroLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreRegistroTextField)
                                    .addComponent(idRegistroTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))))
                    .addGroup(registroClientePanelLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(registroLabel)))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroClientePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cancelarRegistroButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarseBaseDeDatosButton)
                .addGap(30, 30, 30))
        );
        registroClientePanelLayout.setVerticalGroup(
            registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registroClientePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registroLabel)
                .addGap(18, 18, 18)
                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registroNombreLabel)
                    .addComponent(nombreRegistroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRegistroLabel)
                    .addComponent(idRegistroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenaRegistroLabel)
                    .addComponent(registroPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registroClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarseBaseDeDatosButton)
                    .addComponent(cancelarRegistroButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanelSlider.add(registroClientePanel, "card3");

        jLabel1.setText("Empresa \"Comer y dormir\"");

        jLabel2.setText("Inicio de sesión");

        jLabel3.setText("ID:");

        jLabel4.setText("Contraseña:");

        inicioSesionButton.setText("Iniciar sesión");
        inicioSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout empleadoPanelLayout = new javax.swing.GroupLayout(empleadoPanel);
        empleadoPanel.setLayout(empleadoPanelLayout);
        empleadoPanelLayout.setHorizontalGroup(
            empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleadoPanelLayout.createSequentialGroup()
                .addGroup(empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(empleadoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(inicioSesionButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empleadoPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(empleadoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(contrasenaSesionTextField))
                            .addGroup(empleadoPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(idInicioSesionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empleadoPanelLayout.createSequentialGroup()
                        .addGroup(empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empleadoPanelLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, empleadoPanelLayout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        empleadoPanelLayout.setVerticalGroup(
            empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idInicioSesionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(empleadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contrasenaSesionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(inicioSesionButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanelSlider.add(empleadoPanel, "card4");

        jMenu1.setText("Opciones");

        cambioAEmpleadoMenuItem.setText("Cambiar a Empleado");
        cambioAEmpleadoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioAEmpleadoMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cambioAEmpleadoMenuItem);

        cambioAClienteMenuItem.setText("Cambiar a Cliente");
        cambioAClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioAClienteMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cambioAClienteMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanelSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanelSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resgistrarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resgistrarseButtonActionPerformed
        loginPanelSlider.nextPanel(5, this.registroClientePanel, loginPanelSlider.left);
        this.identificacionTextFiled.setText("");
        this.contrasenaPaswordField.setText("");
    }//GEN-LAST:event_resgistrarseButtonActionPerformed

    private void cancelarRegistroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarRegistroButtonActionPerformed
        loginPanelSlider.nextPanel(5, this.loginClientePanel, loginPanelSlider.right);
        this.nombreRegistroTextField.setText("");
        this.registroPasswordField.setText("");
        this.idRegistroTextField.setText("");
    }//GEN-LAST:event_cancelarRegistroButtonActionPerformed

    private void registrarseBaseDeDatosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseBaseDeDatosButtonActionPerformed
        String nombre = this.nombreRegistroTextField.getText();
        String id = this.idRegistroTextField.getText();
        String contrasena = this.registroPasswordField.getText();
        if (nombre.isEmpty() || id.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos, intente de nuevo");
        } else {
            RegistroDeClientes nuevoRegistro = new RegistroDeClientes();
            try {
                Cliente nuevoCliente = new Cliente(nombre, contrasena, id);
                nuevoRegistro.escribirEmpleado(nuevoCliente);
                JOptionPane.showMessageDialog(this, "Se ha registrado correctamente");
                this.dispose();
                MenuParaClienteFrame nuevoMenu = new MenuParaClienteFrame(nuevoCliente);
                nuevoMenu.setVisible(true);
            } catch (SQLException ex) {
                if (ex instanceof MySQLIntegrityConstraintViolationException) {
                    JOptionPane.showMessageDialog(this, "EL CLIENTE CON ID:" + id + " " + "YA EXISTE");
                    this.nombreRegistroTextField.setText("");
                    this.idRegistroTextField.setText("");
                    this.registroPasswordField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Existio un error al conectar a la base de datos");
//                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } finally {
                this.nombreRegistroTextField.setText("");
                this.idRegistroTextField.setText("");
                this.registroPasswordField.setText("");
            }
        }
    }//GEN-LAST:event_registrarseBaseDeDatosButtonActionPerformed

    private void accederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederButtonActionPerformed
        String id = this.identificacionTextFiled.getText();
        String contrasena = this.contrasenaPaswordField.getText();
        if (id.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos, intente de nuevo");
        } else {
            try {
                BusquedaDeCliente nuevaBusquedaDeCliente = new BusquedaDeCliente();
                Cliente nuevoCliente = new Cliente(contrasena, id);
                Cliente clienteBuscado = nuevaBusquedaDeCliente.buscarCliente(nuevoCliente);
                if (clienteBuscado == null) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el cliente buscado");
                } else {
                    JOptionPane.showMessageDialog(this, "El cliente se ha encontrado   :v su nombre es:" + clienteBuscado.getNombre());
                    this.dispose();
                    MenuParaClienteFrame nuevoMenu = new MenuParaClienteFrame(clienteBuscado);
                    nuevoMenu.setVisible(true);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Existio un error al conectar con la base de datos");
                //Logger.getLogger(LoginFrame1.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                this.identificacionTextFiled.setText("");
                this.contrasenaPaswordField.setText("");
            }
        }
    }//GEN-LAST:event_accederButtonActionPerformed

    private void inicioSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionButtonActionPerformed
        String id = this.idInicioSesionTextField.getText();
        String contrasena = this.contrasenaSesionTextField.getText();
        if (id.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan datos, intente de nuevo");
            this.idInicioSesionTextField.setText("");
            this.contrasenaSesionTextField.setText("");
        } else if (id.equals("ROOT") && contrasena.equals("ROOT")) {

            JOptionPane.showMessageDialog(this, "Super usuario encontrado");
            this.dispose();
            RootFrame nuevoRoot = new RootFrame();
            nuevoRoot.setVisible(true);

        } else {
            BusquedaDeEmpleados nuevaBusqueda = new BusquedaDeEmpleados();
            try {
                Empleado empleadoEncontrado = nuevaBusqueda.buscarEmpleado(id, contrasena);
                if (empleadoEncontrado == null) {
                    JOptionPane.showMessageDialog(this, "No se encontro el empleado");
                } else {
                    BusquedaDeEmpresas nuevaBusquedaE = new BusquedaDeEmpresas();
                    Empresa empresaEncontrada = nuevaBusquedaE.buscarEmpresa(empleadoEncontrado.getCodigoDeEmpresaParaEmpleado());
                    String tipoDeEmpresa = empresaEncontrada.getTipoDeEmpresa();
                    String tipoDeEmpleado = empleadoEncontrado.getTipoDeEmpleado();
                    if (tipoDeEmpresa.equals("Hotel")) {
                        if (tipoDeEmpleado.equals("Gerente")) {
                            this.dispose();
                            RootFrame frameGerenteHotel = new RootFrame(empresaEncontrada);
                            frameGerenteHotel.setVisible(true);
                        } else {//Es resepcionista

                        }
                    } else {//La empresa sera restaurante
                        if (tipoDeEmpleado.equals("Gerente")) {
                            this.dispose();
                            RootFrame frameGerenteRestaurante = new RootFrame(empresaEncontrada, true);
                            frameGerenteRestaurante.setVisible(true);
                        } else {//Es camarero

                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Existio un error al conectar con la base de datos");
                //Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                this.idInicioSesionTextField.setText("");
                this.contrasenaSesionTextField.setText("");
            }
        }
    }//GEN-LAST:event_inicioSesionButtonActionPerformed

    private void cambioAEmpleadoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioAEmpleadoMenuItemActionPerformed
        this.loginPanelSlider.nextPanel(5, this.empleadoPanel, this.loginPanelSlider.left);
    }//GEN-LAST:event_cambioAEmpleadoMenuItemActionPerformed

    private void cambioAClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioAClienteMenuItemActionPerformed
        this.loginPanelSlider.nextPanel(5, this.loginClientePanel, this.loginPanelSlider.left);
    }//GEN-LAST:event_cambioAClienteMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accederButton;
    private javax.swing.JLabel appClienteLabel;
    private javax.swing.JMenuItem cambioAClienteMenuItem;
    private javax.swing.JMenuItem cambioAEmpleadoMenuItem;
    private javax.swing.JButton cancelarRegistroButton;
    private javax.swing.JLabel contrasenaLabel;
    private javax.swing.JPasswordField contrasenaPaswordField;
    private javax.swing.JLabel contrasenaRegistroLabel;
    private javax.swing.JPasswordField contrasenaSesionTextField;
    private javax.swing.JPanel empleadoPanel;
    private javax.swing.JTextField idInicioSesionTextField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idRegistroLabel;
    private javax.swing.JTextField idRegistroTextField;
    private javax.swing.JTextField identificacionTextFiled;
    private javax.swing.JLabel infoLabelLabel;
    private javax.swing.JButton inicioSesionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel loginClientePanel;
    private diu.swe.habib.JPanelSlider.JPanelSlider loginPanelSlider;
    private javax.swing.JTextField nombreRegistroTextField;
    private javax.swing.JButton registrarseBaseDeDatosButton;
    private javax.swing.JPanel registroClientePanel;
    private javax.swing.JLabel registroLabel;
    private javax.swing.JLabel registroNombreLabel;
    private javax.swing.JPasswordField registroPasswordField;
    private javax.swing.JButton resgistrarseButton;
    // End of variables declaration//GEN-END:variables
}
