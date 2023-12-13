/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import dao.AutorDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;
/**
 *
 * @author debor
 */
public class Escritor {
 private  Integer codAutores;
    private String nome;
    private String nacionalidade;
    private ArrayList<Livro> obras = new ArrayList<Livro>();
    
    public Escritor(){
        
    }
    public Escritor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Integer getCodAutores() {
        return codAutores;
    }

    public void setCodAutores(Integer codAutores) {
        this.codAutores = codAutores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Livro> getObras() {
        return obras;
    }

    public void setObras(ArrayList<Livro> obras) {
        this.obras = obras;
    }
    
    public void cadastrarEscritor(Escritor escritor) throws ExceptionDAO{
        new AutorDAO().cadastrarEscritor(escritor);
    }
}
    

