package com.carlos.dataRestaurante.principal;

import com.carlos.dataRestaurante.Dao.Impl.TipoRestauranteDaoImpl;
import com.carlos.dataRestaurante.conection;
import com.carlos.dataRestaurante.entity.TipoRestaurante;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class principal {

    public static void main(String[] args) {


        // probando insert en base de datos
        TipoRestauranteDaoImpl tipoRestauranteDao = new TipoRestauranteDaoImpl();
        TipoRestaurante tipoRestaurante = new TipoRestaurante();
        tipoRestaurante.setDescripcion("Restaurante de tacos");
        tipoRestaurante.setFechaCreacion(LocalDateTime.now());
        tipoRestaurante.setStatus(true);

/**
 * Se intenta hacer el insert y se trata
 * */
        try {

            tipoRestauranteDao.guardar(tipoRestaurante);
        }catch (SQLException sl){
            System.err.println("El error es : " + sl);
            sl.printStackTrace();

        }


    }
}
