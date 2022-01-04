package com.carlos.dataRestaurante.entity;

public class Restaurante extends  CommonEntity   {

    /**
     * Atributos de la clase
     * */

    private int idRestaurante;
    private String nombre;
    private String descripcion;
    private String slogan;
    private TipoRestaurante tipoRestaurante;
    private Menu menu;


    public int getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public TipoRestaurante getTipoRestaurante() {
        return tipoRestaurante;
    }

    public void setTipoRestaurante(TipoRestaurante tipoRestaurante) {
        this.tipoRestaurante = tipoRestaurante;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
