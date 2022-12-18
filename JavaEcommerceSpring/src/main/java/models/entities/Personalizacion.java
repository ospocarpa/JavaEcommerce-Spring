package models.entities;

import lombok.Getter;

@Getter
public class Personalizacion {
    private  TipoPersonalizacion tipoPersonalizacion;
    private AreaPersonalizacion areaPersonalizacion;
    private String descripcion;

}
