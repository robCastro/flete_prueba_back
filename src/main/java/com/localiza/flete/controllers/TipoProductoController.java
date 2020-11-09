package com.localiza.flete.controllers;

import java.util.List;

import com.localiza.flete.entities.TipoProducto;
import com.localiza.flete.services.TipoProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipo_producto")
@CrossOrigin(origins = "*")
public class TipoProductoController {
    
    @Autowired
    private TipoProductoService tipoService;

    @GetMapping("/")
    public List<TipoProducto> findAll(){
        return tipoService.findAll();
    }

}
