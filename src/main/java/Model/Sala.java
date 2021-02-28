/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Sala {
    
    private int Id;
    private String Nome;
    private int Lotacao;

    public Sala(int Id, String Nome, int Lotacao) {
        this.Id = Id;
        this.Nome = Nome;
        this.Lotacao = Lotacao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
  
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getLotacao() {
        return Lotacao;
    }

    public void setLotacao(int Lotacao) {
        this.Lotacao = Lotacao;
    }
    
    @Override
    public String toString(){
        return getNome();
    }    
    
    
}
