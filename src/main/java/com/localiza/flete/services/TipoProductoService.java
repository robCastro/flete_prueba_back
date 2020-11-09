package com.localiza.flete.services;

import java.util.List;

import com.localiza.flete.entities.TipoProducto;
import com.localiza.flete.repositories.TipoProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoProductoService {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }
}
