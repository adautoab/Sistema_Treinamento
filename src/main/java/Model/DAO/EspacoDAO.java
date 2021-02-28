/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.EspacoModel;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EspacoDAO {
    
  /**
     * Insere um servico dentro do banco de dados
     * @param espaco exige que seja passado um objeto do tipo espaco
     */
    public void insert(EspacoModel espaco){
        Banco.espaco.add(espaco);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param espaco
     * @return 
     */
    public boolean update(EspacoModel espaco){
        
        for (int i = 0; i < Banco.espaco.size(); i++) {
            if(idSaoIguais(Banco.espaco.get(i),espaco)){
                Banco.espaco.set(i, espaco);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param espaco
     * @return 
     */
    public boolean delete(EspacoModel espaco){
        for (EspacoModel espacoLista : Banco.espaco) {
            if(idSaoIguais(espacoLista,espaco)){
                Banco.espaco.remove(espacoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os espacos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<EspacoModel> selectAll(){
        return Banco.espaco;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param espaco
     * @param espacoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(EspacoModel espaco, EspacoModel espacoAComparar) {
        return espaco.getId() ==  espacoAComparar.getId();
    }
    
}

