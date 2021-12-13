package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cuenta_usuario")
/**
 * Clase o entidad de usuario, esta formada por id,nombre, apellido, email,
 * password * @author Kevin Guevara
 */
public class CuentaUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cuenta")
    Long idCuentaUsuario;

    @Column(name = "data_id")
    Long dataId;

    @Column(name = "email")
    String email;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "apellido")
    String apellido;

    @Column(name = "passwrd")
    String passwrd;

    @Column(name = "articulos")
    Integer articulos;

    @Column(name = "fecha_creacion")
    Date fechaCreacion;

    @Column(name = "fecha_modificado")
    Date fechaModificado;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentaId")
    List<Carrito> carritos; // todas las publicaciones que están en el carrito

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "compradorId")
    List<Compra> compras;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "vendedorId")
    List<Compra> ventas;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "autorId")
    List<Publicacion> publicaciones;

    @Override
    public String toString() {
        return "CuentaUsuario{" +
                "idCuentaUsuario=" + idCuentaUsuario +
                ", email='" + email + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", passwrd='" + passwrd + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaModificado=" + fechaModificado +
                ", carrito=" + carritos +
                ", compras=" + compras +
                ", publicaciones=" + publicaciones +
                '}';
    }
}
