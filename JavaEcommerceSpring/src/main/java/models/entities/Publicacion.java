package models.entities;

import lombok.Getter;

import java.time.LocalDate;
@Getter
public class Publicacion {
    private  String nombre;
    private TipoEstado estado;
    private ProductoPersonalizado productoPersonalizado;
    private LocalDate fecha;

    public  void cambiarEstado(TipoEstado nuevoEstado) {
        this.estado=nuevoEstado;
    }

}
