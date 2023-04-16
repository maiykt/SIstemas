/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class reservas {
   
private int ID_del_cliente;	
private String Nombre_completo;	
private String Dirección;	
private String Número_de_teléfono;	
private String Correo_electrónico;	
private String Producto_reservado;	
private String Precio;
private String Fecha_de_reserva;
private String Fecha_de_recogida;		
private String Estado_de_la_reserva;	
  



    public reservas() {
    }

    public reservas(int ID_del_cliente, String Nombre_completo, String Dirección, String Número_de_teléfono, String Correo_electrónico , String Producto_reservado  , String Precio , String Fecha_de_reserva  , String Fecha_de_recogida  , String Estado_de_la_reserva ) {
       
        this.ID_del_cliente = ID_del_cliente;
       this.Nombre_completo =  Nombre_completo;	
 this.Dirección = Dirección;	
 this.Número_de_teléfono = Número_de_teléfono;	
 this.Correo_electrónico = Correo_electrónico;	
  this.Producto_reservado = Producto_reservado;	
this.Precio = Precio;
 this.Fecha_de_reserva = Fecha_de_reserva;
 this.Fecha_de_recogida = Fecha_de_recogida;		
 this.Estado_de_la_reserva = Estado_de_la_reserva;
        
        
    }

    public int getID_del_cliente() {
        return ID_del_cliente;
    }

    public void setID_del_cliente(int ID_del_cliente) {
        this.ID_del_cliente = ID_del_cliente;
    }

    public String getNombre_completo() {
        return Nombre_completo;
    }

    


    public void setNombre_completo(String Nombre_completo) {
        this.Nombre_completo = Nombre_completo;
    }
    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }



    public String getCorreo_electrónico() {
        return Correo_electrónico;
    }
    public  void setCorreo_electrónico(String Correo_electrónico) {
         this.Correo_electrónico = Correo_electrónico;
    }
    
    public  String getDirección() {
               return Dirección;
    }

   
    
     public String getProducto_reservado() {
        return Producto_reservado;
    }

    public void setProducto_reservado(String Producto_reservado) {
        this.Producto_reservado = Producto_reservado;
    }
     public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }
     public String getFecha_de_reserva() {
        return Fecha_de_reserva;
    }

    public void setFecha_de_reserva(String Fecha_de_reserva) {
        this.Fecha_de_reserva = Fecha_de_reserva;
    }
     public String getFecha_de_recogida() {
        return Fecha_de_recogida;
    }

    public void setFecha_de_recogida(String Fecha_de_recogida) {
        this.Fecha_de_recogida = Fecha_de_recogida;
    }
    public String getEstado_de_la_reserva() {
        return Estado_de_la_reserva;
    }

    public void setEstado_de_la_reserva(String Estado_de_la_reserva) {
        this.Estado_de_la_reserva= Estado_de_la_reserva;
    }



 

       public String getNúmero_de_teléfono() {
        return Número_de_teléfono;
    }

  

   public  void setNúmero_de_teléfono(String Número_de_teléfono) {
 this.Número_de_teléfono = Número_de_teléfono;
    }

   }

    

