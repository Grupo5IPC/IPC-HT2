package hojadetrabajo2;

public class Usuarios {
    
        private String nombre;
        private String pass;

        
    public Usuarios(String nombre, String pass) {
        this.nombre = nombre;
        this.pass = pass;
    }
    
    public boolean verificarDatos(String nombre, String pass){
        boolean nombreUsuario = this.nombre.equalsIgnoreCase(nombre);
        boolean passUsuario = this.pass.equals(pass);
        boolean correcto = nombreUsuario && passUsuario;
        return correcto;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
        
        
}