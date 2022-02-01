package com.carlos.dataRestaurante.Dao;

import com.carlos.dataRestaurante.entity.TipoRestaurante;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

/**
 * CRUD para la tabla TipoRestaurante
 * */
public interface TipoRestauranteDao {

    //Método que guardara información  en la tabla tipoRestaurante
    //1 en caso de ser exitoso, 0 en caso de ser error
    int guardar (TipoRestaurante tipoRestaurante) throws SQLException;

    /**
     * Método permitira actualizar datos en la tabla tipoRestaurante
     *
     * 1 en caso de ser exitoso, 0 en caso de tener error
     * */
    int actualizar(TipoRestaurante tipoRestaurante);

    /**
     * Método que permite eliminar un registro
     * */
    int delete(int idTipoRestaurante);

    /**
     * Método que permite realizar la consulta de valores en tipo de restaurante
     * en este caso no es necesario ingresar parametros ya que no son necesarios
     * cuando realizamos cosultas no ingresamos valores, solo hacemos un SELECT
     * */

    List<TipoRestaurante> consultar ();

    /**
     * En caso de necesitar solo la información de un restaurante esta sentencia es por medio de
     * un SELECT pero con un WHERE  condlicionando por ID
     * por ello a diferencia de la sentencia anterior donde el tipo de dato era una lista, en este caso
     * sera TipoRestaurante es decir el tipo de datos es la clase
     * */

    TipoRestaurante consultarPorId (int idTipoRestaurante);
}
