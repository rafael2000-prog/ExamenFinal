/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.IDAO.RestauranteIDAO;
import ec.edu.ups.modelo.Restaurante;

/**
 *
 * @author ESTUDIANTE
 */
public class RestauranteControlador {
    private RestauranteIDAO restauranteDAO;
    private Restaurante restaurante;

    public RestauranteControlador(RestauranteIDAO restauranteDAO) {
        this.restauranteDAO = restauranteDAO;
    }
    
    public void crear(String nombre, String direccion, String telefono,String aforo){
        restaurante=new Restaurante(nombre, direccion, telefono, aforo);
        restauranteDAO.crear(restaurante);
    }
    
    
}
