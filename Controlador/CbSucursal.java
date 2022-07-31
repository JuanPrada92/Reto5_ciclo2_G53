
package Controlador;

import Modelo.Conexion;
import Modelo.Sucursal;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;

public class CbSucursal {
    
     Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    ResultSet rs;
    
    public CbSucursal(){
        
    }
    
    public ArrayList getListaSucursales() {
        System.out.println("Funcion getListaSucursales");
        ArrayList mListaSucursales = new ArrayList();
        Sucursal sucursal = null;
        
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = st.executeQuery("SELECT idSucursal, nombreSucursal FROM `sucursal`;");
            while(rs.next()){
                sucursal = new Sucursal();
                sucursal.setIdSucursal(rs.getInt("idSucursal"));
                sucursal.setNombreSucursal(rs.getString("nombreSucursal"));
                mListaSucursales.add(sucursal);
            }
                       
        }catch (SQLException e){
            System.out.println(e);
        }
        return mListaSucursales;
    }
    
    
    
    
    
}
