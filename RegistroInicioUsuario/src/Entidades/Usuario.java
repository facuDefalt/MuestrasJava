package Entidades;

import igu.InicioSecion;


/**
 *
 * @author PC
 */
public class Usuario {
    private Integer id;
    private String correo;
    private String contraseña;

    public Usuario(String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public Usuario() {
    }
    
    public void IniciarSecion(){
        InicioSecion user = new InicioSecion(correo,contraseña);
        user.setVisible(true);
        user.setLocationRelativeTo(null);
    }
    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
   
}
