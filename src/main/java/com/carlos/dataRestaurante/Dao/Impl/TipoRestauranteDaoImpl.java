package com.carlos.dataRestaurante.Dao.Impl;

import com.carlos.dataRestaurante.Dao.TipoRestauranteDao;
import com.carlos.dataRestaurante.conection;
import com.carlos.dataRestaurante.entity.TipoRestaurante;

import java.sql.SQLException;
import java.util.List;

/**
 * Clase donde se implementa CRUD y otros métodos personalizados de transacciones a la base de datos
 * en la tabla Tipo_Restaurante
 * **/

public class TipoRestauranteDaoImpl implements TipoRestauranteDao {

    static {

        /**
         * Bloque de código que intentará hacer la conexion a la base de datos para proceder con
         * los siguientes métodos como son guardar, actualizar etc.
         * */
        try {
            conection.conectar();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int guardar(TipoRestaurante tipoRestaurante) {
        return 0;
    }

    @Override
    public int actualizar(TipoRestaurante tipoRestaurante) {
        return 0;
    }

    @Override
    public int delete(int idTipoRestaurante) {
        return 0;
    }

    @Override
    public List<TipoRestaurante> consultar() {
        return null;
    }

    @Override
    public TipoRestaurante consultarPorId(int idTipoRestaurante) {
        return null;
    }
}
