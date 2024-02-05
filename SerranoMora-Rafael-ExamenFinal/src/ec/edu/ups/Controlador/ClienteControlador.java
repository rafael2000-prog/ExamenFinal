/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.IDAO.ClienteIDAO;
import ec.edu.ups.modelo.Cliente;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteControlador {
    private ClienteIDAO clienteDAO;
    private Cliente cliente;

    public ClienteControlador(ClienteIDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }
    
    public void crear (String Identificacion, String nombres, String correo, String direccion, String telefono){
        cliente = new Cliente(Identificacion, nombres, correo, direccion, telefono);
        clienteDAO.crear(cliente);
    }
}
