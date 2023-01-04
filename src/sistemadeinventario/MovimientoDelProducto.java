/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeinventario;

/**
 *
 * @author ayala
 */
public class MovimientoDelProducto {
    private Producto Productos;
    private String Direccion;
    private int Cantidad;
    private String Fecha;

    public MovimientoDelProducto(Producto Productos, String Direccion, int Cantidad, String Fecha) {
        this.Productos = Productos;
        this.Direccion = Direccion;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
    }

    public Producto getProductos() {
        return Productos;
    }

    public void setProductos(Producto Productos) {
        this.Productos = Productos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
