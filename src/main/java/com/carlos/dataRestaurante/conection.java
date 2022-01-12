package com.carlos.dataRestaurante;

import java.sql.*;

public class conection {

    /**
     * Clase donde se observara  como se lleva acabo la conexion con base de datos
     * */

    private static Connection connection;

    /**
     * Atributo de tipo sentencia preparada
     * */
    private static Statement statement;

    /**
     * Metodo que intentara hacer la conexion con la base de datos, es aqui donde se agregara
     * el try y catch para recibir la excpciones en caso de algún error al intentar conectarse
     * 1_Paso Uno cargar el diver de conxion
     *  throws exception creada al no cargar el driver
     * */
    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2._ Establecer los datos de conexion
        // Como tip el ejemplo para conocer la URL   podemos consultarlo en el sitio oficial de mysql
        //los datos como usar y password son los definidos en la base de datos con los cuales accderemos
        String Url="jdbc:mysql://localhost:3306/restaurante?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String  user="root";
        String password="root";

        /**
         * 3._ Establecer la conexion con el objeto connection
         * */

        connection = DriverManager.getConnection(Url,user,password);


        statement=connection.createStatement();
        return connection;
    }

    /**
     * Método que trabaja  la manipulacion de datos ya sea INSERT, DELETE O UPDATE
     * @param sql : depende de la accion a realizar como se menciono anteriormente, INSERT etc
     * */
    public static int ejecutarSQL(String sql) throws SQLException {
        System.out.println("Echo " + sql);
        return statement.executeUpdate(sql);

    }
    /**
     * Método que  ejecutara sentencias de consulta SQL como son SELECT
     * */
    public  static ResultSet ejecutaConsultaSQL(String sql) throws SQLException {
        System.out.println("Query " +sql);
        return  statement.executeQuery(sql);

    }

}
