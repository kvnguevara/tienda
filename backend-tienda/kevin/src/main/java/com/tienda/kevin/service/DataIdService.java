package com.tienda.kevin.service;

import com.tienda.kevin.model.DataId;
import com.tienda.kevin.repository.DataIdRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DataIdService extends GeneralServiceImpl<DataId, Long> {
    @Autowired
    private DataIdRepository dataIdRepository;

    @Override
    public CrudRepository<DataId, Long> getRepository() {
        return dataIdRepository;
    }
}
