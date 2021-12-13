package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "data_id")
/**
 * Clase dataid, donde se almacena los usuarios,articulos y publicaciones que
 * hace.
 * Esta formada por id,usuario,articulo, publicacion(fk)
 * * @author Kevin Guevara
 */
public class DataId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idData;

    @Column(name = "usuarios")
    Long ultimoUsuario;

    @Column(name = "articulos")
    Long ultimoArticulo;

    @Column(name = "publicaciones")
    Long ultimaPublicacion;

}
