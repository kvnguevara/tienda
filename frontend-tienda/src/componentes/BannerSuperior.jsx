import React, { useState } from "react";
import "./BannerSuperior.css";

/* redux */
import { useSelector } from "react-redux";

/* datos del programa */
import { categorias, Redirigir } from "../datos";
import { useParams } from "react-router-dom";
import { useEffect } from "react";

const BannerNormal = (props) => {
  let primerasCuatro = categorias;
  const [redirigir, setRedirigir] = useState(false);
  const [urlBusqueda, setUrlBusqueda] = useState(false);

  let { busqueda_query } = useParams();
  let usr = useSelector((state) => state.usuario);

  function buscarInput(e) {
    if (e.key !== "Enter") return;
    let busqueda = e.target.value;
    if (e.length !== 0) {
      setUrlBusqueda(busqueda);
      setRedirigir(true);
    }
  }
  return (
    <div className="banner">
      {redirigir && <Redirigir donde={"/busqueda/" + urlBusqueda} />}
      <div className="banner__logo-busqueda-accesos dflex">
        <a className="a-limpio link-logo" href="/">
          Home
        </a>
        <input
          className="banner-input-buscar"
          type="text"
          onLoad={(e) => {}}
          placeholder="Buscar articulos..."
          onKeyDown={(e) => buscarInput(e)}
        />
        <section className="banner__accesos">
          <a className="banner__acceso a-limpio" href="/producto">
            PRODUCTO
          </a>
          <span className="seccion-cuenta">
            {usr ? (
              <>
                <a className="banner__acceso a-limpio" href="/admin/compras">
                  {usr.nombre.toUpperCase()}
                </a>
                <div className="menu-cuenta">
                  <li className="menu-cuenta__item">
                    <a className="a-limpio" href="/admin/compras">
                      <i className="fas fa-user"></i>
                      <span style={{ marginLeft: 30 }}>CUENTA</span>
                    </a>
                  </li>
                  <hr className="hr" />
                  <li className="menu-cuenta__item">
                    <a className="a-limpio" href="/admin/carrito">
                      <i className="fas fa-shopping-cart"></i>
                      <span style={{ marginLeft: 30 }}>CARRO</span>
                    </a>
                  </li>
                  <hr className="hr" />
                  <li className="menu-cuenta__item">
                    <a className="a-limpio" href="/desconectar">
                      <i className="fas fa-arrow-left"></i>
                      <span style={{ marginLeft: 30 }}>SALIR</span>
                    </a>
                  </li>
                </div>
              </>
            ) : (
              <>
                <a className="banner__acceso a-limpio" href="/registro">
                  CREAR CUENTA
                </a>
                <a className="banner__acceso a-limpio" href="/ingresar">
                  INICIAR SESION
                </a>
              </>
            )}
          </span>
        </section>
      </div>

      <section className="nav-categorias-buscar dflex">
        <div className="navegacion-categorias">
          {primerasCuatro.map((item, i) => (
            <span className="nav-categoria" key={item.titulo}>
              <a
                className="nav-categoria__link a-limpio"
                href={
                  i === 0 ? "/" : "/categorias/" + item.categoria.toLowerCase()
                }
              >
                {" "}
                {item.titulo.toUpperCase()}{" "}
              </a>
              <div className="nav-categoria__borde"></div>
            </span>
          ))}
        </div>
        <div className="nav-esp"></div>
      </section>
    </div>
  );
};

const BannerSimple = (props) => {
  return (
    <div className="banner-extendido width100 roboto-c border-box of-x-hidden">
      <div className="dflex width100">
        <a className="a-limpio link-logo-extendido" href="/">
          tienda
        </a>
      </div>
    </div>
  );
};

export { BannerNormal, BannerSimple };
