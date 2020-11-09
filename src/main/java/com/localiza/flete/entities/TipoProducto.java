package com.localiza.flete.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TipoProducto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codTipoProducto;

    @Column(nullable = false, length = 100)
    private String nombreTipoProducto;

    @Column(length = 500)
    private String descripcion;

    @Column(nullable = false)
    private Double porcentajeFlete;

    @Column(nullable = false)
    private Double porcentajeCombustible;

    @Column(nullable = false)
    private Double porcentajeSeguro;

    @Column(nullable = false)
    private Double porcentajeAduanal;

    @Column(nullable = false)
    private Double porcentajeImpuestos;

    @Column(nullable = false)
    private Boolean cobrarIva;

}
