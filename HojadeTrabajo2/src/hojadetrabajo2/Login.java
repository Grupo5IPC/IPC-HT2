package hojadetrabajo2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Login extends JFrame implements ActionListener{
        JFrame ventanaPrincipal;
        JTextField loginUsuario;
        JPasswordField loginContraseña;
        JButton loginBoton;
        JLabel lblLogin, lblUsuario, lblContraseña, actualizar;
        UserReg user;
                
    public Login(UserReg user) {
        this.user = user;
        ventanaPrincipal = new JFrame();
        configurarVentana();
        ingresarUsuario();
        configurarBotones();
        agregarTexto();
}
    private void configurarVentana(){
        /*Buscamos el tamaño de la pantalla sin importar la resolucion
        o el tamaño de la misma y lo dejamos en el centro*/
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamPantalla = mipantalla.getScreenSize();
        
            int alturaPantalla = tamPantalla.height;
            int anchoPantalla = tamPantalla.width;
        
            setSize(anchoPantalla/2,alturaPantalla/2);
            
            setLocation(anchoPantalla/4, alturaPantalla/4);
                    
        setTitle("Hoja de Trabajo de IPC");
        //Icono
        Image miIcono = mipantalla.getImage("build/classes/ipc1/proyecto1_201900597/principal.jpg");
        
        setIconImage(miIcono);
        //Visible el marco
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminar el programa al cerrar
        //Escribimos sobre el menu principal lo generado en escribirMarco

    }
    private void ingresarUsuario(){
            // Espacios para llenar
            //login
        loginUsuario = new JTextField("");
        loginUsuario.setBounds(300, 100, 175, 50);
        loginContraseña = new JPasswordField("");
        loginContraseña.setBounds(300, 150, 175, 50);

        add(loginUsuario);
        add(loginContraseña);
        repaint();
    }
    private void configurarBotones(){
        // Colocacion de los botones 
        loginBoton = new JButton("Login");
        loginBoton.setBounds(300, 225, 75, 40);
        loginBoton.addActionListener(this);
        add(loginBoton);
        repaint();
    }
    private void agregarTexto(){
        // Identificadores de los espacios JText
        lblLogin = new JLabel("Login");
        lblLogin.setBounds(310, 30, 500, 60);
        lblLogin.setFont(new Font ("Times New Roman", Font.BOLD, 22));
        lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(175, 100, 175, 50);
        lblUsuario.setFont(new Font ("Times New Roman", Font.BOLD, 14));
        lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(175, 150, 175, 50);
        lblContraseña.setFont(new Font ("Times New Roman", Font.BOLD, 14));
        actualizar = new JLabel("");
        actualizar.setBounds(0,0,0,0);
        actualizar.setFont(new Font ("Times New Roman", Font.BOLD, 14));
        add(lblLogin);
        add(lblUsuario);
        add(lblContraseña);
        add(actualizar);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton para ingresar
        if(e.getSource() == loginBoton){
            Usuarios registro = this.user.verCredenciales(this.loginUsuario.getText(), this.loginContraseña.getText());
        if(registro == null){
            JOptionPane.showMessageDialog(this, "ERROR: No se pudo iniciar sesion");
        }else{
            this.setVisible(false);
            new HojadeTrabajo2();
            this.dispose();
        }
        }
    }
}