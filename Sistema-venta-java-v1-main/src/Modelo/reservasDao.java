/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class reservasDao {
    
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean Registrarreservas(reservas cl){
        String sql = "INSERT INTO reservas (ID_del_cliente , Nombre_completo , Dirección, Número_de_teléfono, Correo_electrónico, Producto_reservado, Precio, Fecha_de_reserva, Fecha_de_recogida, Estado_de_la_reserva ) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
               ps.setInt(1, cl.getID_del_cliente ());
            ps.setString(2, cl.getNombre_completo ());
            ps.setString(3, cl.getDirección ());
            ps.setString(4, cl.getNúmero_de_teléfono());
            ps.setString(5, cl.getCorreo_electrónico());
             ps.setString(6, cl.getProducto_reservado());
            ps.setString(7, cl.getPrecio());
            ps.setString(8, cl.getFecha_de_reserva());
            ps.setString(9, cl.getFecha_de_recogida());
            ps.setString(10, cl.getEstado_de_la_reserva());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    
    
   public List Listarreservas(){
       List<reservas> ListaCl = new ArrayList();
       String sql = "SELECT * FROM reservas";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               reservas cl = new reservas();
               cl.setID_del_cliente(rs.getInt("ID_del_cliente"));
               cl.setNombre_completo(rs.getString("Nombre_completo"));
               cl.setDirección(rs.getString("Dirección"));
               cl.setNúmero_de_teléfono(rs.getString("Número_de_teléfono"));
               cl.setCorreo_electrónico(rs.getString("Correo_electrónico"));
                cl.setProducto_reservado(rs.getString("Producto_reservado"));
                  cl.setPrecio(rs.getString("Precio"));
                    cl.setFecha_de_reserva(rs.getString("Fecha_de_reserva"));
                      cl.setFecha_de_recogida(rs.getString("Fecha_de_recogida"));
                        cl.setEstado_de_la_reserva(rs.getString("Estado_de_la_reserva"));
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
   public boolean Eliminarreservas(int  ID_del_cliente){
       String sql = "DELETE FROM reservas WHERE ID_del_cliente = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, ID_del_cliente);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
   

   public reservas Buscarreservas(int ID_del_cliente){
       reservas cl = new reservas();
       String sql = "SELECT * FROM reservas WHERE ID_del_cliente = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, ID_del_cliente);
           rs = ps.executeQuery();
           if (rs.next()) {
             
               
               cl.setID_del_cliente(rs.getInt("ID_del_cliente"));
               cl.setNombre_completo(rs.getString("Nombre_completo"));
               cl.setDirección(rs.getString("Dirección"));
               cl.setNúmero_de_teléfono(rs.getString("Número_de_teléfono"));
               cl.setCorreo_electrónico(rs.getString("Correo_electrónico"));
                cl.setProducto_reservado(rs.getString("Producto_reservado"));
                  cl.setPrecio(rs.getString("Precio"));
                    cl.setFecha_de_reserva(rs.getString("Fecha_de_reserva"));
                      cl.setFecha_de_recogida(rs.getString("Fecha_de_recogida"));
                        cl.setEstado_de_la_reserva(rs.getString("Estado_de_la_reserva"));
               
               
               
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }

  }