/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Sala;
import Model.EspacoModel;
import Model.PessoaInscrita;
import java.util.ArrayList;

/**
 *
 * @author adauto
 */
public class Banco {
    
    public static ArrayList<Sala> sala;
    public static ArrayList<EspacoModel> espaco;
    public static ArrayList<PessoaInscrita> pessoa;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        sala = new ArrayList<Sala>();
        espaco = new ArrayList<EspacoModel>();
        pessoa = new ArrayList<PessoaInscrita>();
        
        //criando elementos  
                 
        Sala sala1 = new Sala(1, "Sala Java", 30);
        Sala sala2 = new Sala(2, "Sala Banco de Dados", 30);
        Sala sala3 = new Sala(3, "Sala Html", 15);
        

        EspacoModel espaco1 = new EspacoModel(1, "Café Colonial", 30);
        EspacoModel espaco2 = new EspacoModel(2, "Café Gourmet", 25);
        
        PessoaInscrita pessoa1 = new PessoaInscrita(1, "Alan", "Figueiredo", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa2 = new PessoaInscrita(2, "Judite", "Oliveira", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa3 = new PessoaInscrita(3, "Paulo", "Ricado", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa4 = new PessoaInscrita(4, "Neymar", "Santos", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa5 = new PessoaInscrita(5, "Debruine", "Pipoqueiro", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa6 = new PessoaInscrita(6, "Matuidi", "Pareira", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa7 = new PessoaInscrita(7, "Marta", "Souza", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa8 = new PessoaInscrita(8,"Aline", "Ferrari", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa9 = new PessoaInscrita(9, "Samuel", "Coltinho", sala1, sala2, espaco1, espaco2);
        PessoaInscrita pessoa10 = new PessoaInscrita(10, "Felipe", "Luis", sala1, sala2, espaco1, espaco2);
        
       
        
        //Adiciona Elementos na lista
                

        
        sala.add(sala1);
        sala.add(sala2);
        sala.add(sala3);
        
        espaco.add(espaco1);
        espaco.add(espaco2);
        
        pessoa.add(pessoa1);
        pessoa.add(pessoa2);
        pessoa.add(pessoa3);
        pessoa.add(pessoa4);
        pessoa.add(pessoa5);
        pessoa.add(pessoa6);
        pessoa.add(pessoa7);
        pessoa.add(pessoa8);
        pessoa.add(pessoa9);
        pessoa.add(pessoa10);        
                
    }
    
    
}
