package com.tienda.kevin.service;

import com.tienda.kevin.model.TieneImagen;
import com.tienda.kevin.repository.TieneImagenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class TieneImagenService extends GeneralServiceImpl<TieneImagen, Long> {
    @Autowired
    TieneImagenRepository tieneImagenRepository;

    @Override
    public CrudRepository<TieneImagen, Long> getRepository() {
        return tieneImagenRepository;
    }
}
