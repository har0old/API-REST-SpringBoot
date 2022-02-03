package com.labodega.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasPorductoPK id;

    private Integer Cantidad;
    private Double total;
    private Boolean estado;


    public ComprasPorductoPK getId() {
        return id;
    }

    public void setId(ComprasPorductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}