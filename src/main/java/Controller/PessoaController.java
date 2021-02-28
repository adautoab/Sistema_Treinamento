/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.PessoaHelper;
import Model.DAO.EspacoDAO;
import Model.DAO.PessoaDAO;
import Model.DAO.SalaDAO;
import Model.EspacoModel;
import Model.PessoaInscrita;
import Model.Sala;
import View.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class PessoaController {

    private final Pessoa view;
    private final PessoaHelper helper;

    public PessoaController(Pessoa view) {
        this.view = view;
        this.helper = new PessoaHelper(view);
    }
 
    public void atualizarTabela(){
        
        // buscar lista com pessoas no BD
        PessoaDAO pessoaDAO = new PessoaDAO();
        ArrayList<Model.PessoaInscrita> pessoas = pessoaDAO.selectAll();
        
        // exibir lista na view
        helper.preencherTabela(pessoas);
        
    }
    
    
    public void atualizaSala(){
        
        // buscar salas no banco de dados
        SalaDAO salaDAO = new SalaDAO();
        ArrayList<Sala> salas = salaDAO.selectAll();
        
        // exibir salas no combobox salas
        helper.preencherSalas1(salas);
        helper.preencherSalas2(salas);
        
    }
    
    public void atualizaEspaco(){
        
        // buscar espacos no banco de dados
        EspacoDAO espacoDAO = new EspacoDAO();
        ArrayList<EspacoModel> espacos = espacoDAO.selectAll();
        // exibir espacos no combobox espacos
        helper.preencherEspacos1(espacos);
        helper.preencherEspacos2(espacos);
        
         
    }

    public void inscreverPessoa(){
        // Buscar Objeto PessoaInscrita da tela
        PessoaInscrita pessoaInscrita = helper.obterModelo();
        // Salvar objeto no bando de dados
        new PessoaDAO().insert(pessoaInscrita);
        // inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
    }
    
}
