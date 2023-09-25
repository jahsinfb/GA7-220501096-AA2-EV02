
package modelo;

abstract public class Persona {
    
    private String nombres, apellidos, direccion, telefonos, fecha_nacimiento;
    public Persona() {}
    public Persona(int id, String nombres, String apellidos, String direccion, String telefonos, String fecha_nacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.fecha_nacimiento = fecha_nacimiento;
    }
    

       public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
   

   
   public int agregar(){ return 0;}
   public int modificar(){return 0;}
   public int  eliminar(){return 0;}
   
            
            
    
}
