package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "imagen")
/**
 * Clase o entidad que contiene la informacion de la imagen
 * 
 * @author Kevin Guevara
 */
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_imagen")
    Long idImagen;

    @Column(name = "nombre_archivo")
    String nombreArchivo;

    @Column(name = "fecha_creacion")
    Date fechaCreacion;

    @ManyToOne(cascade = CascadeType.ALL)
    TieneImagen articuloId;

}
