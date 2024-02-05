/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.DAO;

import ec.edu.ups.IDAO.ClienteIDAO;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Restaurante;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteDAO implements ClienteIDAO {

    private List<Cliente> cliente;
    @Override
    public void crear(ec.edu.ups.modelo.Cliente cliente) {
        try {
            FileWriter archivoEscritura= new FileWriter ("Cliente",true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            String linea = String.format("%s,%s,%s,%s,%s\n", cliente.getIdentificacion(), cliente.getNombres(),cliente.getCorreo(),cliente.getDireccion(),cliente.getTelefono());
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
