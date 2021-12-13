package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "articulo")
/**
 * Clase articulo que contiene los siguientes atributos
 * id_articulo,dataid,titulo,url,descripcion,categoria,fechacreacion,fechamodificacion
 * * @author Kevin Guevara
 */
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_articulo")
    Long idArticulo;

    @Column(name = "data_id")
    Long dataId;

    @Lob
    @Column(name = "titulo", nullable = false)
    String titulo;

    @Lob
    @Column(name = "url_representativo")
    String url;

    @Lob
    @Column(name = "descripcion", nullable = false)
    String descripcion;

    @Column(name = "categoria")
    String categoria;

    @Column(name = "fecha_creacion")
    Date fechaCreacion;

    @Column(name = "fecha_modificado")
    Date fechaModificado;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articuloId")
    List<Compra> compras;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articuloId")
    List<Publicacion> publicaciones;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "articulo")
    List<TieneImagen> imagenes;

    public String tituloURL() {
        final String permitidos = "abcdefghijklmnopqrstuvwxyz0123456789-";
        String s = titulo;
        while (s.contains("  "))
            s = s.replaceAll("  ", " ");
        for (int i = 0; i < s.length(); i++) {
            String c = s.charAt(i) + "";
            if (!permitidos.contains(c.toLowerCase()))
                s = s.replaceAll(c, "-");
        }
        while (s.contains("--"))
            s = s.replaceAll("--", "-");
        return s;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "idArticulo=" + idArticulo +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaModificado=" + fechaModificado +
                // ", carritos=" + carritos +
                ", compras=" + compras +
                ", publicaciones=" + publicaciones +
                '}';
    }
}
