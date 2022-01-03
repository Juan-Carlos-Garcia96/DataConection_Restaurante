package com.carlos.dataRestaurante.principal;

import com.carlos.dataRestaurante.conection;

import java.sql.Connection;
import java.sql.SQLException;

public class principal {

    public static void main(String[] args) {


        try {
            Connection conecxion = conection.conectar();
            return;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
