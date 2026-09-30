/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HOME
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre,double precio,int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public Producto(String nombre, double precio) {
        this(nombre,precio,0);
    }

    public Producto() {
        this("Sin asignar",0.0,0);
    }
    
    
    public String getNombre(){
    return this.nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public double getPrecio(){
    return this.precio;
    }
    public void setPrecio(){
    this.precio=precio;
    }
    
    public int getStock(){
    return this.stock;
    }
    public void setStock(){
    this.stock=stock;
    }
    
    public void aplicarDescuento(double porcentaje){
    
    if(porcentaje>0 && porcentaje<=100){
    
    double descuento= this.precio*(porcentaje/100.0);
    this.precio-=descuento;
    }
    }
    
    public void actualizarStock(int cantidad){
    
    if(cantidad>0){
    this.stock+=cantidad;
    }
    
    }
    
    public void actualizarStock(int cantidad,String motivo){
    
        if(cantidad>0){
        this.stock+=cantidad;
        }
        System.out.println("Nombre del producto: "+this.nombre+" | Motivo de la actualizacion: "+motivo);
    
    }
    
    
}
