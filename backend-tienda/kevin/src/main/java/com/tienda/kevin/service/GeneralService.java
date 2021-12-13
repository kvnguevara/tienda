package com.tienda.kevin.service;

import java.io.Serializable;
import java.util.List;

/**
 * Interface, GeneralService,
 * Se indica los metodos que se utilizan en los serivicios de cada Entidad.
 * 
 */
public interface GeneralService<T, ID extends Serializable> {
    /** Listar */
    List<T> listar();

    /** buscar */
    T buscar(ID id);

    /** Agregar */
    void agregar(T nuevoT);

    /** Modificar */
    void modificar(ID id, T t);

    /** Borrar */
    void borrar(ID id);

}
