/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Sala;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class SalaDAO {


    /**
     * Insere um cliente dentro do banco de dados
     * @param sala exige que seja passado um objeto do tipo sala
     */
    public void insert(Sala sala){
        Banco.sala.add(sala);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param sala
     * @return 
     */
    public boolean update(Sala sala){
        
        for (int i = 0; i < Banco.sala.size(); i++) {
            if(idSaoIguais(Banco.sala.get(i),sala)){
                Banco.sala.set(i, sala);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param sala
     * @return 
     */
    public boolean delete(Sala sala){
        for (Sala salaLista : Banco.sala) {
            if(idSaoIguais(salaLista, sala)){
                Banco.sala.remove(salaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos as salas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Sala> selectAll(){
        return Banco.sala;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param sala
     * @param salaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Sala sala, Sala salaAComparar) {
        return sala.getId() ==  salaAComparar.getId();
    }
    
}

