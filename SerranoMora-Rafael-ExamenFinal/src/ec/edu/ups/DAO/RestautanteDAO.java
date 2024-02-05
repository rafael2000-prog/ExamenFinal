/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.DAO;

import ec.edu.ups.IDAO.RestauranteIDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Restaurante;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class RestautanteDAO implements RestauranteIDAO {
    private List<Restaurante> restaurante;
    @Override
    public void crear(Restaurante restaurante) {
        try {
            FileWriter archivoEscritura= new FileWriter ("Restaurante",true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%s,%s,%s,%s\n", restaurante.getNombre(), restaurante.getDireccion(),restaurante.getTelefono(),restaurante.getAforo());
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
