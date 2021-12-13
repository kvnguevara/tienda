package com.tienda.kevin.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public abstract class GeneralServiceImpl<T, ID extends Serializable> implements GeneralService<T, ID> {

    /** Metodo para listar */
    public List<T> listar() {
        List<T> lista = new ArrayList<>();
        getRepository().findAll().forEach(item -> lista.add(item));
        return lista;
    }

    /** Metodo para buscar por id */
    public T buscar(ID id) {
        Optional<T> resul = getRepository().findById(id);
        if (resul.isPresent())
            return (T) resul;
        return null;
    }

    /** Metodo para agregar, ya sea articulo, usuario, compra */
    public void agregar(T nuevoT) {
        getRepository().save(nuevoT);
    }

    /**
     * Metodo para modificar usuario, articulo...
     * se pasa el id
     */
    public void modificar(ID id, T t) {
        getRepository().save(t);
    }

    /** Metodo para borrar */
    public void borrar(ID id) {
        getRepository().deleteById(id);
    }

    public abstract CrudRepository<T, ID> getRepository();
}
