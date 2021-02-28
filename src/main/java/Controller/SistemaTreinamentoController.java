/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Espaco;
import View.Pessoa;
import View.Sala;
import View.SistemaTreinamento;

/**
 *
 * @author User
 */
public class SistemaTreinamentoController {

    private final SistemaTreinamento view;

    public SistemaTreinamentoController(SistemaTreinamento view) {
        this.view = view;
    }
    
    public void navegarParaPessoa(){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setVisible(true);
        
    }

    public void navegarParaSala() {
        Sala sala = new Sala();
        sala.setVisible(true);
    }

    public void navegarParaEspaco() {
        Espaco espaco = new Espaco();
        espaco.setVisible(true);
    }
    
}
