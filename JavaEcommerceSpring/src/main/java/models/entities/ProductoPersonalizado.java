package models.entities;

import java.util.List;

public class ProductoPersonalizado {
    private String nombre;
    private ProductoBase productoBase;
    private List<PersonalizacionPosibleProducto> personalizacionesProducto;
    private Double precioFinal=this.calcularPrecioFinal();
    public Double calcularPrecioFinal() {
        return 1.11;
    }
}
