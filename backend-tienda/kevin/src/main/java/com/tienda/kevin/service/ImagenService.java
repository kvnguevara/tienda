package com.tienda.kevin.service;

import com.tienda.kevin.model.Imagen;
import com.tienda.kevin.repository.ImagenRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ImagenService extends GeneralServiceImpl<Imagen, Long> {
    @Autowired
    ImagenRepository imagenRepository;

    @Override
    public CrudRepository<Imagen, Long> getRepository() {
        return imagenRepository;
    }
}
