/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.DAO;

import ec.edu.ups.IDAO.ReservaIDAO;
import ec.edu.ups.modelo.Reserva;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTUDIANTE
 */
public class ReservaDAO implements ReservaIDAO {

    @Override
    public void crear(Reserva reserva) {
        try {
            FileWriter archivoEscritura= new FileWriter ("Reserva",true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            String linea = String.format("%d,%d,%s\n", reserva.getCodigo(), reserva.getnPersonas(),fecha.format(reserva.getFechaReserva()));
            escritura.append(linea);
            escritura.close();
            archivoEscritura.close();
        } catch (IOException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Reserva leer(int codigo) {
        try {
            BufferedReader lectura = new BufferedReader(new FileReader("Reserva"));
            String linea;
            while ((linea=lectura.readLine()) != null){
                String[] list = linea.split(",");
                
                if (Integer.parseInt(list[0])==codigo){
                    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
                    Date fechareserva = fecha.parse(list[2]);
                    
                    Reserva reserva = new Reserva(Integer.parseInt(list[0]), Integer.parseInt(list[1]), fechareserva);
                    
                    return reserva;
                }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Reserva> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
