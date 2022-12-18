package models.entities;

import java.util.List;

public class Tienda {
    private String nombre;
    private List<Publicacion> publicaciones;
    private List<ProductoPersonalizado> productosPersonalizados;
    private List<TipoMedioDePago> mediosDesPago;

    public void personalizarProducto(ProductoBase productoBase) {
        //TODO
    }
    public void generarPublicacion(ProductoPersonalizado productoPersonalizado){
        //TODO
    }
}
