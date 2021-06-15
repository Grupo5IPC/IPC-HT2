package hojadetrabajo2;

public class UserReg {
    
    //clase donde guarda registro de usuarios
    private Usuarios[] usuario;
    private Usuarios admin;
    
    
    public UserReg(String nombre, String pass){
    
         admin = new Usuarios(nombre, pass);
         usuario = new Usuarios[10];
    
    }
    
    public boolean existeUsuario(String nombre){
        if(admin.getNombre().equalsIgnoreCase(nombre)) return true;
        for(Usuarios registro : usuario){
            if(registro == null) continue;
            if(registro.getNombre().equalsIgnoreCase(nombre)) return true;
        }
        return false;
        
    }
    
        public Usuarios verCredenciales(String nombre, String pass){
    if(!existeUsuario(nombre)) return null;
    if(admin.verificarDatos(nombre, pass)) return admin;
    for(Usuarios registro : getUsuarios()){
            if(registro == null) continue;
            if(registro.verificarDatos(nombre, pass))
                return registro;
        }
    return null;
    }
        
        // Verificacion de si existe ya el usuario

        public boolean agregarUsuario(String nombre, String pass){
            if(existeUsuario(nombre)) return false;
            for (int i = 0; i < usuario.length; i++) {
                if(usuario[i] == null){
                    usuario[i] = new Usuarios(nombre, pass);
                    return true;
                }
                
            }
            return false;
        } 
        
    /**
     * @return the usuarios
     */
    public Usuarios[] getUsuarios() {
        return usuario;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Usuarios[] usuarios) {
        this.usuario = usuarios;
    }

    /**
     * @return the admin
     */
    public Usuarios getAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(Usuarios admin) {
        this.admin = admin;
    }
}
