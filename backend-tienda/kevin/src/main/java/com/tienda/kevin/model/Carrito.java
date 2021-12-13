package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "carrito")
/**
 * Clase de carrito o linea de pedido, se almacena
 * id carrito, fecha, precio id usario, cantidad
 */
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reg_carrito")
    Long idCarrito;

    @Column(name = "fecha_agregado")
    Date fechaAgregado;

    @Column(name = "precio")
    Double precio;

    @ManyToOne
    CuentaUsuario cuentaId;

    @ManyToOne
    Publicacion publicacionId;

    @Column(name = "cantidad")
    Integer cantidad;

}
