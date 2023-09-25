
package modelo;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Empleado extends Persona {
   
    private String nit; // nit hace referencia al codigo del empleado
   // private int id_empleado; // primary key
    private int id_puesto;

    public Empleado() {
    }

    public Empleado(String nit, int id_empleado , int id_puesto) {
        this.nit = nit;
       // this.id_empleado = id_empleado;
        this.id_puesto = id_puesto;
    }

    public Empleado(String nit,  int id_puesto, int id, String nombres, String apellidos, String direccion, String telefonos, String fecha_nacimiento) {
        super(id, nombres, apellidos, direccion, telefonos, fecha_nacimiento);
        this.nit = nit;
        //.id_empleado = id_empleado;
        this.id_puesto = id_puesto;
    }
        
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

//    public int getId_empleado() {
//        return id_empleado;
//    }

//    public void setId_empleado(int id_empleado) {
//        this.id_empleado = id_empleado;
//    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }
    
//    public DefaultTableModel leer(){
//        DefaultTableModel tabla = new DefaultTableModel();
//        try{
//            Conexion cn = new  Conexion();
//            cn.abrirConexion();
//            
//            String query;
//            query = "select nit, nombres, apellidos,direccion, telefonos, fecha_nacimiento, puesto from clientes inner join puesto on puesto.id_puesto = clientes.id_cliente;";
//            // aqui guaradmos las filas de la consulta query
//            ResultSet consulta = cn.con.createStatement().executeQuery(query);
//            // llenar la tala con los emcabellzados
//            String columna[] = {"ID", "Nit", "Nombre", "Apellido", "Direccion", "Telefono", "Nacimiento", "Puesto"};
//            tabla.setColumnIdentifiers(columna);
//
//            //capturar los datos de la consulta para llenar las filas de la tablas de acuerdo al emcabezado
//            String datos[];
//            datos = new String[7];
//
//            while (consulta.next()) {
//                datos[0] = consulta.getString("id_cliente");
//                datos[1] = consulta.getString("nit");
//                datos[2] = consulta.getString("nombres");
//                datos[3] = consulta.getString("apellidos");
//                datos[4] = consulta.getString("direccion");
//                datos[5] = consulta.getString("telefonos");
//                datos[6] = consulta.getString("fecha_nacimiento");
//                datos[7] = consulta.getString("id_puesto");
//                tabla.addRow(datos);
//            }
//                     
//            cn.cerrarConexion();
//        }catch(SQLException e){
//            
//        }
//    return tabla;
//    }
   
       
    @Override
    public int  agregar(){
        int retorno= 0;
                   try{
            
            PreparedStatement parametro;
            Conexion cone = new Conexion();
            String query = "insert into clientes (nit, nombres, apellidos, direccion, telefonos,fecha_nacimiento, id_puesto)values(?,?,?,?,?,?,?);";
            cone.abrirConexion();
            parametro = (PreparedStatement)cone.con.prepareStatement(query);
            parametro.setString(1, getNit());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefonos());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setInt(7, getId_puesto());
           
           retorno =  parametro.executeUpdate();
//            System.out.println("Conexion Exitosa");
            cone.cerrarConexion();
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            retorno = 0;
        }
        return retorno;
      }
}
