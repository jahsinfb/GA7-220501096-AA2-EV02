

package modelo;
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection con;
    public String bd = "db_empresa";
    public String urlConexion = String.format("jdbc:mysql://localhost:3307/%s", bd);
    public String Usuario = "root";
    public String contrasena = "Salome8325";
    public String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void abrirConexion(){
        try{
            Class.forName(jdbc);
            con = DriverManager.getConnection(urlConexion,Usuario,contrasena);
//            JOptionPane.showMessageDialog(null,"Conexion Exitosa", "Exito",JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            System.out.println("Error" +ex.getMessage());
        }
    }
    public void cerrarConexion(){
        try{
            con.close();
        }catch(SQLException ex){
            System.out.println("Error de conexion ");
        }
    }
}
