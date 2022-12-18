package models.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class ProductoBase {
    public ProductoBase(String nombre, Float precioBase, String descripcion, Integer diasFabricacion, List<PersonalizacionPosibleProducto> personalizacionesPosiblesProductos) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
        this.diasFabricacion = diasFabricacion;
        this.personalizacionesPosiblesProductos = personalizacionesPosiblesProductos;
    }

    private String nombre;
    private Float precioBase;

    private String descripcion;
    private Integer diasFabricacion;

    private List<PersonalizacionPosibleProducto> personalizacionesPosiblesProductos;

    public void cargarPosiblePersonalizacion(Personalizacion personalizacion,String contenido ,Float precio) {

        PersonalizacionPosibleProducto unaPersonalizacionPosibleProducto = new PersonalizacionPosibleProducto();
        unaPersonalizacionPosibleProducto.setPersonalizacion(personalizacion);
       //TODO :como pasar la misma instancia de clase como parametro
        unaPersonalizacionPosibleProducto.setProductoBase(new ProductoBase
                (this.nombre,this.precioBase,this.descripcion,this.diasFabricacion,this.personalizacionesPosiblesProductos));
        unaPersonalizacionPosibleProducto.setContenido(contenido);
        unaPersonalizacionPosibleProducto.setPrecioPersonalizacion(precio);

        personalizacionesPosiblesProductos.add(unaPersonalizacionPosibleProducto);

    }
}
