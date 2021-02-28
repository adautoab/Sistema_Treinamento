/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.DAO.Banco;
import Model.DAO.SalaDAO;
import Model.Sala;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Teste {
    public static void main(){
        Banco.inicia();
        SalaDAO salaDAO = new SalaDAO();
        
        ArrayList<Sala> salas = salaDAO.selectAll();
        System.out.println(salas.get(0));
        
    }
}
