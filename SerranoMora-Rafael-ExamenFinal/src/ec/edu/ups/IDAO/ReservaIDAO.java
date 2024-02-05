/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.IDAO;

import ec.edu.ups.modelo.Reserva;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ReservaIDAO {
    void crear (Reserva reserva);
    Reserva leer (int codigo);
    List<Reserva> listar();
    
}
