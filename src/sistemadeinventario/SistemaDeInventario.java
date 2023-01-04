/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeinventario;


import java.io.BufferedReader;  //bufferreader es un "scanner" pero que si sirve, por eso lo puse, en esto tambiien esta el inputstreamreader
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;        //Las listas son como unos arrays pero dinamicos, es decir no necesitan de saber cual es el ka canridad del array
import java.util.List;

/**
 *
 * @author ayala
 */
public class SistemaDeInventario {
   
    /**
     * @param args the command line arguments
     */
    
    String contraseñaadmin="12345";
    private final List<Producto> listaProductos = new ArrayList<>();
    private final List<MovimientoDelProducto> listaMovimientoProductos = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private void roles() throws IOException {
        System.out.println("Va a entrar como admin o como usuario?");
        System.out.println("1) Admin          2)Usuario");
        System.out.println("Nota: si es la primera vez que ingresa como admin la contraseña alfanumerica por defecto es: 12345");
        String rol = reader.readLine();
        if ("1".equals(rol)) {
            comprobarcontrasenna();
            menuAdmin();
            
            
        } else {

        }
    }

    private void comprobarcontrasenna() throws IOException{   
        System.out.println("ingrese la contraseña de administrador");
            String Contraseña = reader.readLine();
            
           if (contraseñaadmin.equals(Contraseña)){
           }else 
           {
               System.out.println("La contraseña no coincide tiene dos oportunidades o sera cerrado el programa");
               Contraseña = reader.readLine();
                if (contraseñaadmin.equals(Contraseña)){   
                }
                else {
                    System.out.println("tiene una ultima oportunidad o sera cerrado el programa");
                    Contraseña = reader.readLine();
                    if (contraseñaadmin.equals(Contraseña)){
                    }
                    else {
                        System.out.println("se equivoco 3 veces de contraseña, limite alcanzado se cerro el programa.");
                         System.exit(0);                   
                }
                }
           }
    }
    
    private void menuAdmin() throws IOException {
        System.out.println("Elija desea realizar: ");
        System.out.println("1) Agregar productos");
        System.out.println("2) agregar la cantidad del producto y la direccion en la que se encuentra");
        System.out.println("3) modificar algun producto");
        System.out.println("4) cambiar la contraseña de ingreso");
        System.out.println("5) salir del programa");
        String opcionAdmin = reader.readLine();
        if ("1".equals(opcionAdmin)) {
            agregarProducto();
        } else if ("2".equals(opcionAdmin)) {
            agregarCantidad();
        } else if ("3".equals(opcionAdmin)) {
            modificarProducto();
        }
          else if("4".equals(opcionAdmin)){
              crearcontrasenna();
          }
          else if("5".equals(opcionAdmin)){
              System.out.println("fin del programa.");
          }
    }

     public void agregarProducto() throws IOException {
        System.out.println("Cree un producto, para esto lo primero que tiene que hacer ahora es ingresar el nombre del producto");
        String name = reader.readLine();
        System.out.println("Ahora, haga una breve descripcion de su producto");
        String descripcion = reader.readLine();
        System.out.println("El siguiente paso es agregar el precio del producto");
        double precio = Double.parseDouble(reader.readLine());
        System.out.println("Y por ultimo digite cuanto cuesta el realizar este producto");
        double costo = Double.parseDouble(reader.readLine());
        Producto producto = new Producto(name, descripcion, precio, costo);
        listaProductos.add(producto);
        menuAdmin();

    }
     
     private void agregarCantidad() throws IOException {
        System.out.println("Ingrese el nombre del producto");
        String nombre = reader.readLine();
        Producto producto = buscarProducto(nombre); //tenemos el producto
        System.out.println("ingrese la cantidad de "+producto.getNombre());
        int cantidad = Integer.parseInt(reader.readLine());
        System.out.println("Ahora ingrese la direccion o lugar en donde se encuentran su producto " + producto.getNombre());
        String direccion = reader.readLine();
        System.out.println("Digite la hora y fecha en la que se ingreso, con el formato de hora militar y dd/mm/aa respectivamente");
        String fecha = reader.readLine();
        MovimientoDelProducto movimientoDelProducto = new MovimientoDelProducto(producto, direccion, cantidad, fecha);
        listaMovimientoProductos.add(movimientoDelProducto);
        menuAdmin();
    }
     
     
    private void modificarProducto() throws IOException {
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String nombre = reader.readLine();
        
        
            System.out.println("Elija que quiere cambiar de su producto:");
                System.out.println("1) Nombre");
                System.out.println("2) Descripcion");
                System.out.println("3) Precio");
                System.out.println("4) costo del producto");
                System.out.println("5) Cantidad Del producto");
                System.out.println("6) Direccion del producto");
                
               int cambio = Integer.parseInt(reader.readLine());
               
               
                
                switch(cambio){
                    case 1:
                        System.out.println("Digite el nuevo nombre de su producto");
                        String name = reader.readLine();
                        buscarProducto(nombre).setNombre(name);
                        System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                        String fecha = reader.readLine();
                        buscarmovimiento(nombre).setFecha(fecha);
                    break;
                    
                     case 2:
                         System.out.println("Digite la nueva descripcion de su producto");
                         String descripcion = reader.readLine();
                         buscarProducto(nombre).setDescripcion(descripcion);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = reader.readLine();
                         buscarmovimiento(nombre).setFecha(fecha);
                        
                    break;
                    
                     case 3:
                         System.out.println("Agregue el nuevo precio del producto");
                         double precio = Double.parseDouble(reader.readLine());
                         buscarProducto(nombre).setPrecio(precio);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = reader.readLine();
                         buscarmovimiento(nombre).setFecha(fecha);
                        
                    break;
                    
                     case 4:
                         System.out.println("Digite el nuevo costo de realizar este producto");
                         double costo = Double.parseDouble(reader.readLine());
                         buscarProducto(nombre).setPrecio(costo);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = reader.readLine();
                         buscarmovimiento(nombre).setFecha(fecha);
                         
                    break;
                    
                     case 5:
                         System.out.println("Digite la nueva cantidad de su producto");
                         int cantidad = Integer.parseInt(reader.readLine());
                         buscarmovimiento(nombre).setCantidad(cantidad);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = reader.readLine();
                         buscarmovimiento(nombre).setFecha(fecha);
                         
                         
                    break;
                    
                     case 6:                      
                         System.out.println("Digite la nueva direccion de su producto");
                         String direcc = reader.readLine();
                         buscarmovimiento(nombre).setDireccion(direcc);
                         System.out.println("Digite la hora y fecha en la que se realizo este cambio, con el formato de hora militar y dd/mm/aa respectivamente");
                         fecha = reader.readLine();
                         buscarmovimiento(nombre).setFecha(fecha);
                         
                         
                    break;   
                }
                
    }

    private void crearcontrasenna() throws IOException {
        comprobarcontrasenna();
        int flag=0;
        while(flag==0){
        System.out.println("ahora ingrese la nueva contraseña");
        String nuevacontraseña1 = reader.readLine();
        System.out.println("confirme su nueva contraseña");
        String nuevacontraseña2 = reader.readLine();
            
        if(nuevacontraseña1.equals(nuevacontraseña2)){
            contraseñaadmin=nuevacontraseña1;
            System.out.println("Su nueva contraseña es: "+nuevacontraseña1);
            flag=2;
        }
        else{
            System.out.println("Las contraseñas no coinciden, intente de nuevo");
        }
        }
        menuAdmin();
    }

    public Producto buscarProducto(String nombre) {
        
        for (Producto producto : listaProductos) {
            if (nombre.equalsIgnoreCase(producto.getNombre())) {
                return producto;
            }
        }
        return null;

    }

    public MovimientoDelProducto buscarmovimiento(String nombre) {
        for (MovimientoDelProducto movimiento : listaMovimientoProductos) {
            Producto pro = movimiento.getProductos();           
            if (nombre.equalsIgnoreCase(pro.getNombre())) {
                return movimiento;
            }
        }
        return null;

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SistemaDeInventario sistemaDeInventario = new SistemaDeInventario();
        int flag=0;
        while (flag==0){
        sistemaDeInventario.roles();
            System.out.println("Desea volver a usar el programa?");
            System.out.println("1)Si            2)No");
            int comprobar = Integer.parseInt(reader.readLine());
            if(comprobar==2){
                flag=2;
            }
    }
    }
    
}
