package Main;

import Vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        //.Instancia de la vista login
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);
        
        // crear instancia clase conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
    }

}
