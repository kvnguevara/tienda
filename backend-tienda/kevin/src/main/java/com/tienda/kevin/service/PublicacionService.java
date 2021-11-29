package com.tienda.kevin.service;

import com.tienda.kevin.model.Publicacion;
import com.tienda.kevin.repository.PublicacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PublicacionService extends GeneralServiceImpl<Publicacion, Long> {

    @Autowired
    PublicacionRepository publicacionRepository;

    public CrudRepository<Publicacion, Long> getRepository() {
        return publicacionRepository;
    }
}
