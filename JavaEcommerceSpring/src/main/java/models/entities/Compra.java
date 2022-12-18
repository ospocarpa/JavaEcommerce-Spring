package models.entities;

import java.util.List;

public class Compra {
    private Comprador comprador;
    private TipoMedioDePago medioDePago;
    private TipoEstadoPago estadoPago;
    private List<Item> items;
    private Double precioFInal;

    public void cambiarEstadoPago(TipoEstadoPago nuevoEstadoPago) {
        //TODO

    }
    public void seleccionarMedioDePago(TipoMedioDePago medioDePago) {
        //TODO
    }

}
