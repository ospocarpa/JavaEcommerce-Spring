package models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalizacionPosibleProducto {
    private Personalizacion personalizacion;
    private ProductoBase productoBase;
    private String contenido;
    private Float precioPersonalizacion;
}
