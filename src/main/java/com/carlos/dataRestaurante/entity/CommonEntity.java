package com.carlos.dataRestaurante.entity;


import java.time.LocalDateTime;

/**
 * Clase que contiene los campos similares de cada clase
 * */
public class CommonEntity {

    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
    private Boolean status;

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
