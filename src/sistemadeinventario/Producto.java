/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadeinventario;

/**
 *
 * @author ayala
 */
public class Producto {
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private double CostoDeProduccion;

    public Producto(String Nombre, String Descripcion, double Precio,double CostoDeProduccion ) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.CostoDeProduccion = CostoDeProduccion;
    }

    public double getCostoDeProduccion() {
        return CostoDeProduccion;
    }

    public void setCostoDeProduccion(double CostoDeProduccion) {
        this.CostoDeProduccion = CostoDeProduccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
  public void imprimir()
  {
      System.out.println("El nombre del producto es "+Nombre);
      System.out.println("La descripcion del producto es "+Descripcion);
      System.out.println("El precio del producto es "+Precio);
      System.out.println("El costo de la produccion del producto es "+CostoDeProduccion);
  }
  
  
}
