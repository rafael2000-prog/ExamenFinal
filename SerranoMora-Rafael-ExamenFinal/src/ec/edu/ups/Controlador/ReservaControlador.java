/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.IDAO.ReservaIDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Reserva;
import ec.edu.ups.modelo.Restaurante;
import java.util.Date;

/**
 *
 * @author ESTUDIANTE
 */
public class ReservaControlador {
    private ReservaIDAO reservaDAO;
    private Cliente cliente;
    private Restaurante restaurante;
    private Reserva reserva;
    
    public ReservaControlador(ReservaIDAO reservaDAO)
    {
        this.reservaDAO = reservaDAO;
    }
    
    public void crear (int codigo, int nPersonas, Date fechaReserva){
        reserva = new Reserva(codigo, nPersonas, fechaReserva);
        reservaDAO.crear(reserva);
    }
}
