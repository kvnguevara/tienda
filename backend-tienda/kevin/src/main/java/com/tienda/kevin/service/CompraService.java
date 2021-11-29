package com.tienda.kevin.service;

import com.tienda.kevin.model.Compra;
import com.tienda.kevin.repository.CompraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CompraService extends GeneralServiceImpl<Compra, String> {

    @Autowired
    CompraRepository compraRepository;

    @Override
    public CrudRepository<Compra, String> getRepository() {
        return compraRepository;
    }
}
