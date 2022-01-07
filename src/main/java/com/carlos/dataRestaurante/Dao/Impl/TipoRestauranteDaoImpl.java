package com.carlos.dataRestaurante.Dao.Impl;

import com.carlos.dataRestaurante.Dao.TipoRestauranteDao;
import com.carlos.dataRestaurante.entity.TipoRestaurante;

import java.util.List;

/**
 * Clase donde se implementa CRUD y otros métodos personalizados de transacciones a la base de datos
 * en la tabla Tipo_Restaurante
 * **/

public class TipoRestauranteDaoImpl implements TipoRestauranteDao {

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
