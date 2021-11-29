package com.tienda.kevin.service;

import com.tienda.kevin.model.Carrito;
import com.tienda.kevin.repository.CarritoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CarritoService extends GeneralServiceImpl<Carrito, Long> {

    @Autowired
    CarritoRepository carritoRepository;

    @Override
    public CrudRepository<Carrito, Long> getRepository() {
        return carritoRepository;
    }
}
