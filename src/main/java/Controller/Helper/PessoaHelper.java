/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.EspacoModel;
import Model.PessoaInscrita;
import Model.Sala;
import View.Pessoa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author User
 */
public class PessoaHelper implements IHelper {
    
    private final Pessoa view;

    public PessoaHelper(Pessoa view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.PessoaInscrita> pessoas) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTablePessoa().getModel();
        tableModel.setNumRows(0);
        
        // percorrer a lista preenchendo o tableModel
        for (Model.PessoaInscrita pessoa : pessoas) {
            
            tableModel.addRow(new Object[]{
                    
                    pessoa.getId(),
                    pessoa.getNome(),
                    pessoa.getSobrenome(),
                    pessoa.getSalaEtapa1().getNome(),
                    pessoa.getSalaEtapa2().getNome(),
                    pessoa.getEspacoEtapa1().getNome(),
                    pessoa.getEspacoEtapa2().getNome()
            
                    });
            
        }
    }


    public void preencherEspacos1(ArrayList<EspacoModel> espacos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxEspaco1().getModel();
        
        for (EspacoModel espaco : espacos) {
            comboBoxModel.addElement(espaco); //aqui está o truque           
        }
        
    }

    public void preencherEspacos2(ArrayList<EspacoModel> espacos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxEspaco2().getModel();
        
        for (EspacoModel espaco : espacos) {
            comboBoxModel.addElement(espaco); //aqui está o truque           
        }
    }

    public void preencherSalas2(ArrayList<Sala> salas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxSalaEtapa2().getModel();
        
        for (Sala sala : salas) {
            comboBoxModel.addElement(sala); //aqui está o truque 
        }
    }

    public void preencherSalas1(ArrayList<Sala> salas) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxSalaEtapa1().getModel();
        
        for (Sala sala : salas) {
            comboBoxModel.addElement(sala); //aqui está o truque            
        }
    }
    
    public Sala obterSala1(){
        return (Sala) view.getjComboBoxSalaEtapa1().getSelectedItem();
    }
    
    public Sala obterSala2(){
        return (Sala) view.getjComboBoxSalaEtapa2().getSelectedItem();
    }    

    public EspacoModel obterEspaco1(){
        return (EspacoModel) view.getjComboBoxEspaco1().getSelectedItem();
    }    
    
    public EspacoModel obterEspaco2(){
        return (EspacoModel) view.getjComboBoxEspaco2().getSelectedItem();
    }    
    
    
    @Override
    public PessoaInscrita obterModelo() {
        //String  idString = view.getjTextId().getText();
        //int id = Integer.parseInt(idString);
        String nome = view.getjTextNome().getText();
        String sobrenome = view.getjTextSobrenome().getText();
        Sala sala1 = obterSala1();
        Sala sala2 = obterSala2();
        EspacoModel espaco1 = obterEspaco1();
        EspacoModel espaco2 = obterEspaco2();
        
        PessoaInscrita pessoaInscrita = new PessoaInscrita(0,nome,sobrenome,sala1,sala2,espaco1,espaco2);
        return pessoaInscrita;
    }

    @Override
    public void limparTela() {
        view.getjTextNome().setText("");
        view.getjTextSobrenome().setText("");
    }
    
    
    
    
}
