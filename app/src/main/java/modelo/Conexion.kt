package modelo

import java.sql.Connection
import java.sql.DriverManager

class Conexion {
    fun cadenaConexion(): Connection? {
        try{
            val url= "jdbc:oracle:thin:@192.168.1.24:1521.xe"
            val usuario = "sytem"
            val contrasena = "1234"

            val connection = DriverManager.getConnection(url, usuario, contrasena)
            return connection
        }
        catch (e: Exception){
            println("error: $e")
            return null
        }
    }
}