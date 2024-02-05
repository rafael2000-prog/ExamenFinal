/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Reserva {
    private int codigo;
    private List<Restaurante> listaRestaurante;
    private Cliente cliente;
    private int nPersonas;
    private Date fechaReserva;

    public Reserva(List<Restaurante> listaRestaurante) {
        listaRestaurante = new ArrayList<>();
    }

    public Reserva(int codigo, int nPersonas, Date fechaReserva) {
        listaRestaurante = new ArrayList<>();
        this.codigo = codigo;
        this.nPersonas = nPersonas;
        this.fechaReserva = fechaReserva;
    }

    
    public Reserva(int codigo, Cliente cliente, int nPersonas, Date fechaReserva) {
        listaRestaurante = new ArrayList<>();
        this.codigo = codigo;
        this.cliente = cliente;
        this.nPersonas = nPersonas;
        this.fechaReserva = fechaReserva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Restaurante> getListaRestaurante() {
        return listaRestaurante;
    }

    public void setListaRestaurante(List<Restaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getnPersonas() {
        return nPersonas;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void agregarRestaurante(Restaurante restaurante){
        listaRestaurante.add(restaurante);
    }
    
    public List<Restaurante> listaRestaurantes(){
        return listaRestaurante;
    }
    
    
    
    
    
}
