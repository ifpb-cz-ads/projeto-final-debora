/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import dao.ExceptionDAO;
import dao.LivroDAO;
import java.util.ArrayList;
/**
 *
 * @author debor
 */
public class Livro {
    private Integer codLivro;
    private String titulo;
    private String genero;
    private String sinopse;
    private int numPaginas;
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Escritor> autores  = new ArrayList<Escritor>();

    
    public Livro(String titulo, String genero, String sinopse, Integer numPaginas) {
       // throw new UnsupportedOperationException("Not supported yet."); esta parte do construtor em geral foi criada a partir de um erro na controller livro
    }
    
    

    public Integer getCodLivro() {
        return codLivro;
    }

    public void setCodLivro(Integer codLivro) {
        this.codLivro = codLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Escritor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Escritor> autores) {
        this.autores = autores;
    }
    
    public void cadastraLivro(Livro livro) throws ExceptionDAO{
        new LivroDAO().cadastraLivro(livro);
    }
}
