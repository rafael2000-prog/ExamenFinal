/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ESTUDIANTE
 */
public class Cliente {
    
    private String Identificacion;
    private String nombres;
    private String correo;
    private String direccion;
    private String telefono;
    
    public Cliente(){
        
    }

    public Cliente(String Identificacion, String nombres, String correo, String direccion, String telefono) {
        this.Identificacion = Identificacion;
        this.nombres = nombres;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Identificacion=" + Identificacion + ", nombres=" + nombres + ", correo=" + correo + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
    
}
