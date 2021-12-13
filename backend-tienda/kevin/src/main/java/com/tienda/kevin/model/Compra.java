package com.tienda.kevin.model;

import javax.persistence.*;

import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "compra")
/**
 * Clase Compra o pedido, es donde se almacena las compra de los usuarios.
 * Esta formada por precio, cantidadm fecha, id pedido,
 * * @author Kevin Guevara
 */
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reg_compra")
    Long idCompra;

    @Column(name = "precio")
    Double precio;

    @Column(name = "cantidad")
    Integer cantidad;

    @Column(name = "fecha_compra")
    Date fechaCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comprador_id")
    CuentaUsuario compradorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendedor_id")
    CuentaUsuario vendedorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "articulo_id")
    Articulo articuloId;

    public Compra() {
        this.idCompra = 0L;
        this.fechaCompra = new Date(System.currentTimeMillis());
        this.precio = 0.0;
    }

    public String getPrecioStr() {
        String precio_str = String.valueOf(precio);
        precio_str = precio_str.endsWith(".0") ? precio_str.substring(0, precio_str.length() - 2) : precio_str;
        return precio_str;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "idCompra=" + idCompra +
                ", precio=" + precio +
                ", fechaCompra=" + fechaCompra +
                ", compradorId=" + compradorId.getIdCuentaUsuario() +
                ", articuloId=" + articuloId.getIdArticulo() +
                '}';
    }
}
