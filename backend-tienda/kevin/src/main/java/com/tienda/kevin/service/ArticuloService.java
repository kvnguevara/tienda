package com.tienda.kevin.service;

import com.tienda.kevin.model.Articulo;
import com.tienda.kevin.repository.ArticuloRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticuloService extends GeneralServiceImpl<Articulo, Long> {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public CrudRepository<Articulo, Long> getRepository() {
        return articuloRepository;
    }
}
