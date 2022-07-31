
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    //Crear instancia de la clase Connection
    Connection connection;
    //Atributos:
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_juan_prada";
    String Usuario = "root";
    String contrasena = "";
    
    // añadir el constructor sin args de clase

    public Conexion() {
        //intente conectar con la base de datos
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion,Usuario,contrasena);
            //verificamos conexión devuelve algo
            if(connection != null){
                System.out.println("Conexión exitosa con la base de datos");
            }
    }catch (ClassNotFoundException | SQLException e){
            System.out.println("No se pudo establecer conexi{on con la base de datos.");
    }
    
}
    //Crear función que retorna la clase connection
        public Connection getConnection(){
            return connection;
        }

}
