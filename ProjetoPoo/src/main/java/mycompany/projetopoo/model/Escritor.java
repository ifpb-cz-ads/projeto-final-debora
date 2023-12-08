
package mycompany.projetopoo.model;

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
    
    public void cadastrarEscritor(Escritor escritor){
        
    }
}
