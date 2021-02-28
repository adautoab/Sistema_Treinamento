/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.PessoaInscrita;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PessoaDAO {
    
   /**
     * Insere um agendamento dentro do banco de dados
     * @param pessoa exige que seja passado um objeto do tipo pessoa
     */
    public void insert(PessoaInscrita pessoa){
          
        if(pessoa.getId() == 0){
            pessoa.setId(proximoId());
            Banco.pessoa.add(pessoa);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pessoa
     * @return 
     */
    public boolean update(PessoaInscrita pessoa){
        
        for (int i = 0; i < Banco.pessoa.size(); i++) {
            if(idSaoIguais(Banco.pessoa.get(i),pessoa)){
                Banco.pessoa.set(i, pessoa);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id da pessoa passado
     * @param pessoa
     * @return 
     */
    public boolean delete(PessoaInscrita pessoa){
        for (PessoaInscrita pessoaLista : Banco.pessoa) {
            if(idSaoIguais(pessoaLista,pessoa)){
                Banco.pessoa.remove(pessoaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos as pessoas do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<PessoaInscrita> selectAll(){
        return Banco.pessoa;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param pessoa
     * @param pessoaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(PessoaInscrita pessoa, PessoaInscrita pessoaAComparar) {
        return pessoa.getId() ==  pessoaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (PessoaInscrita pessoa : Banco.pessoa) {           
           int id = pessoa.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}

