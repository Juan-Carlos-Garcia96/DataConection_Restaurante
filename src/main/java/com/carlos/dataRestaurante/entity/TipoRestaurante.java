package com.carlos.dataRestaurante.entity;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa la tabla de tipo restaurante en base de datos
 *
 * */
public class TipoRestaurante  extends  CommonEntity{
 /**
  * Atributos defindos en las tablas para esta clase
  * */


    private  int idRestaurante;
    private  String descripcion;
    private List<Restaurante> restaurantes;

    public List<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
