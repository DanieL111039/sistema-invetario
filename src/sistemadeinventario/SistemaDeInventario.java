/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeinventario;
import java.util.Scanner;


/**
 *
 * @author ayala
 */
public class SistemaDeInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);   
        
        System.out.println("Va a entrar como admin o como usuario?");
        System.out.println("1) Admin          2)Usuario");
            int com = in.nextInt();
            
    switch(com){
    
        case 1:
    
    int pl=0;
        
        while (pl==0)
        {
            int i=0;
        int contador=0;
        
        //aqui el codigo para verificar que es el admin con una contraseña
        
        
        
        //menu de opciones para el admin
        
        System.out.println("Elija desea realizar: ");
        System.out.println("1) Agregar productos");
        System.out.println("2) agregar la cantidad del producto y la direccion en la que se encuentra");
        System.out.println("3) modificar algun producto");
        System.out.println("4) salir del menu");
        
        int x = in.nextInt();
        Producto[] pro =new Producto[100];
        Localizacion[] loc = new Localizacion[100];
        MovimientoDelProducto[] mov =new MovimientoDelProducto[100]; 
        Inventario inv= new Inventario(mov);
        
        switch(x){
            
            case 1:
                
                
                while (i==0){
            
           
            
            System.out.println("");
            System.out.println("Cree un producto, para esto lo primero que tiene que hacer ahora es ingresar el nombre del producto");
            String  name = in.next();
            System.out.println("Ahora, haga una breve descripcion de su producto");
            String descripcion = in.next();
            System.out.println("El siguiente paso es agregar el precio del producto");
            double precio = in.nextDouble();
            System.out.println("Y por ultimo digite cuanto cuesta el realizar este producto");
            double costo = in.nextDouble();
            
            
            pro[contador]= new Producto(name,descripcion,precio,costo);
            
            System.out.println("Desea agregar otro producto seleccione su respuesta?");
            System.out.println("1) Si          2)No");
            int comprobar = in.nextInt();
            if(comprobar==1){
                i=0;
                
                
                contador=contador+1;
            }else if(comprobar==2)
            {
                i=2;
            }
            
            
        }
        
               
                
                
        break;    
        
        
            case 2:
                
            for(int a=0;a<=contador;a++){
                System.out.println("ingrese la cantidad de "+pro[a].getNombre()+" que tiene");
                int cantidad= in.nextInt();
                System.out.println("Ahora ingrese la direccion o lugar en donde se encuentran su producto "+pro[a].getNombre());
                String direccion = in.next();
                System.out.println("Digite la hora y fecha en la que se ingreso, con el formato de hora militar y dd/mm/aa respectivamente");
                String fecha = in.next();
                loc[a]= new Localizacion(pro[a].getNombre(),direccion);
                mov[a]= new MovimientoDelProducto(pro[a],loc[a],cantidad,fecha);
        
    }
            
                
        break;
        
            case 3:
                int j=0;
                int l=0;
                while(l==0){
                 System.out.println("Elija cual producto quiere modificar");
                 
              for(int o=0;o<=contador;o++)
                {
                    System.out.println("");
                    System.out.print(o+") ");
                    pro[o].getNombre();
                    System.out.println("");
                }
               int productomod=in.nextInt();
               
                System.out.println("Elija que quiere cambiar de su producto:");
                System.out.println("1) Nombre");
                System.out.println("2) Descripcion");
                System.out.println("3) Precio");
                System.out.println("4) costo del producto");
                System.out.println("5) Cantidad Del producto");
                System.out.println("6) Direccion del producto");
                
               int cambio = in.nextInt();
               
               
                
                switch(cambio){
                    case 1:
                        System.out.println("Digite el nuevo nombre de su producto");
                        String name = in.next();
                        pro[productomod].setNombre(name);
                        System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                        String fecha = in.next();
                        mov[productomod].setFecha(fecha);
                    break;
                    
                     case 2:
                         System.out.println("Digite la nueva descripcion de su producto");
                         String descripcion = in.next();
                         pro[productomod].setDescripcion(descripcion);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = in.next();
                         mov[productomod].setFecha(fecha);
                        
                    break;
                    
                     case 3:
                         System.out.println("Agregue el nuevo precio del producto");
                         double precio = in.nextDouble();
                         pro[productomod].setPrecio(precio);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = in.next();
                         mov[productomod].setFecha(fecha);
                        
                    break;
                    
                     case 4:
                         System.out.println("Digite el nuevo costo de realizar este producto");
                         double costo = in.nextDouble();
                         pro[productomod].setPrecio(costo);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = in.next();
                         mov[productomod].setFecha(fecha);
                         
                    break;
                    
                     case 5:
                         System.out.println("Digite la nueva cantidad de su producto");
                         int cantidad = in.nextInt();
                         mov[productomod].setCantidad(cantidad);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = in.next();
                         mov[productomod].setFecha(fecha);
                         
                         
                    break;
                    
                     case 6:                      
                         System.out.println("Digite la nueva direccion de su producto");
                         String direcc = in.next();
                         loc[productomod].setDireccion(direcc);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = in.next();
                         mov[productomod].setFecha(fecha);
                         
                         
                    break;   
                }
                    
                   
                    System.out.println("Desea realizar otro cambio?   1)Si    2)No");
                     int comprobar = in.nextInt();
                    if(comprobar==1){
                          l=0;
                    }else if(comprobar==2)
                      {
                              l=2;
                      }
                    
                    
                }
                break;
                
            case 4: 
                
                pl=2;
                break;
        }
        
        
        
        
        }
            
        
        
        
        System.out.println("Fin del programa.");
    
            break;
        
            
            
            
            
            
            
            //usuario
          case 2:
              
              
              
              
              System.out.println("Work in progress");
              break;
              
    }
    }
    
}
