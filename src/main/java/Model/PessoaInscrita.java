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
public class PessoaInscrita {
 
    private int Id;
    private String Nome;
    private String Sobrenome;
    private Sala SalaEtapa1;
    private Sala SalaEtapa2;
    private EspacoModel EspacoEtapa1;
    private EspacoModel EspacoEtapa2;

    public PessoaInscrita(int Id, String Nome, String Sobrenome, Sala SalaEtapa1, Sala SalaEtapa2, EspacoModel EspacoEtapa1, EspacoModel EspacoEtapa2) {
        this.Id = Id;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.SalaEtapa1 = SalaEtapa1;
        this.SalaEtapa2 = SalaEtapa2;
        this.EspacoEtapa1 = EspacoEtapa1;
        this.EspacoEtapa2 = EspacoEtapa2;
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

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public Sala getSalaEtapa1() {
        return SalaEtapa1;
    }

    public void setSalaEtapa1(Sala SalaEtapa1) {
        this.SalaEtapa1 = SalaEtapa1;
    }

    public Sala getSalaEtapa2() {
        return SalaEtapa2;
    }

    public void setSalaEtapa2(Sala SalaEtapa2) {
        this.SalaEtapa2 = SalaEtapa2;
    }

    public EspacoModel getEspacoEtapa1() {
        return EspacoEtapa1;
    }

    public void setEspacoEtapa1(EspacoModel EspacoEtapa1) {
        this.EspacoEtapa1 = EspacoEtapa1;
    }

    public EspacoModel getEspacoEtapa2() {
        return EspacoEtapa2;
    }

    public void setEspacoEtapa2(EspacoModel EspacoEtapa2) {
        this.EspacoEtapa2 = EspacoEtapa2;
    }
    
    
    
       
}
