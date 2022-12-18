package models.entities;

import java.util.List;

public class CarritoCompra {
    private Comprador comprador;
    private List<Item> items;
    private Double precioParcial=0.0;

    public void agregarItem(Publicacion publicacion,Integer cantidad) {
        Item unItem = new Item(publicacion,cantidad);
        Double precioItem=publicacion.getProductoPersonalizado().calcularPrecioFinal()*cantidad;
        precioParcial += precioItem;
        items.add(unItem);
    }
    public void generarCompra(){
        //TODO
    }

}
