/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Main {
    public static void main(String[]args) {
        
        Producto[] inventario= new Producto[3];
        
        inventario[0]= new Producto ("Laptop",1500000.0,25);
        inventario[1]=new Producto ("Teclado",50000.0);
        inventario[2]=new Producto();
        
        System.out.println("---- I N V E N T A R I O ----");
        System.out.println(" NOMBRE Y PRECIOS ORIGINALES");
        for(Producto p: inventario){
        System.out.println("Nombre: "+p.getNombre()+" | Precio Original: "+p.getPrecio());
        }
        
        for(Producto p: inventario){
        p.aplicarDescuento(10.0);
        }
        System.out.println("MODIFICANDO PRECIOS....");
        for(Producto p: inventario){
        System.out.println("Nombre: "+p.getNombre()+" | Precio actual: "+p.getPrecio());
        }
        
        inventario[0].actualizarStock(5,"nueva mercancia");
        inventario[1].actualizarStock(45);
        
        for(Producto p: inventario){
        System.out.println("Nombre: "+p.getNombre()+"STOCK: "+p.getStock());
        }
    }
}

