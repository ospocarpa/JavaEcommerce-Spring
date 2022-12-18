package models.entities;


import lombok.Getter;

@Getter
public class Item {
    private Publicacion publicacion;
    private Integer cantidad;

    public Item(Publicacion publicacion, Integer cantidad) {
        this.publicacion = publicacion;
        this.cantidad = cantidad;
    }
}
