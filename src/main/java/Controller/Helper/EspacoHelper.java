/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.EspacoModel;
import View.Espaco;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class EspacoHelper implements IHelper{

    private final Espaco view;
    
    public EspacoHelper(Espaco view) {
        this.view = view;
    }
    
 
    
 
    @Override
    public EspacoModel obterModelo() {
        String nome = view.getjTextNome().getText();
        String lotacaoString = view.getjTextLotacao().getText();
        int lotacao = Integer.parseInt(lotacaoString);
        
        EspacoModel espaco = new EspacoModel(0, nome, lotacao);
        return espaco;
    }

    @Override
    public void limparTela() {
        view.getjTextNome().setText("");
        view.getjTextLotacao().setText("");
    }

    public void preencherTabela(ArrayList<Model.EspacoModel> espacos) {

        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableEspaco().getModel();
        tableModel.setNumRows(0);
        
        // percorrer a lista preenchendo o tableModel
        
        for (Model.EspacoModel espaco : espacos) {
                        
            tableModel.addRow(new Object[]{
                    
                    espaco.getNome(),
                    espaco.getLotacao()
                                
                    });
            
        }
        
    }
    
    
    
    
}
