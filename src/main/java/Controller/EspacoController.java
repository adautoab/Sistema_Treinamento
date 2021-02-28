/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.EspacoHelper;
import Model.DAO.EspacoDAO;
import Model.EspacoModel;
import View.Espaco;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class EspacoController {

    private final Espaco view;
    private final EspacoHelper helper;


    public EspacoController(Espaco view) {
        this.view = view;
        this.helper = new EspacoHelper(view);
    }
    
    
    public void atualizarTabela(){
        // buscar lista com pessoas no BD
        EspacoDAO espacoDAO = new EspacoDAO();
        ArrayList<Model.EspacoModel> espacos = espacoDAO.selectAll();
        
        // exibir lista na view
        helper.preencherTabela(espacos);

        
    }
    
    public void salvarEspaco(){
        //buscar objeto Espaco da tela
        EspacoModel espaco = helper.obterModelo();
        //salvar objeto no bando de dados
        new EspacoDAO().insert(espaco);
        //inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
    }
    
}
