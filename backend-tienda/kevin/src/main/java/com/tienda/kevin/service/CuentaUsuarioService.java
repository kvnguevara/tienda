package com.tienda.kevin.service;

import com.tienda.kevin.model.CuentaUsuario;
import com.tienda.kevin.repository.CuentaUsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class CuentaUsuarioService extends GeneralServiceImpl<CuentaUsuario, Long> {

    @Autowired
    private CuentaUsuarioRepository cuentaUsuarioRepository;

    @Override
    public CrudRepository<CuentaUsuario, Long> getRepository() {
        return cuentaUsuarioRepository;
    }
}
