/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author debor
 */
public class LivroController {
    public boolean cadastraLivro(String titulo, String genero, String sinopse, Integer numPaginas) throws ExceptionDAO{
        if(titulo != null && titulo.length() > 0 && genero != null && genero.length() >0 && sinopse != null && sinopse.length() >0 && numPaginas != null && numPaginas > 0){
        Livro livro = new Livro(titulo, genero, sinopse, numPaginas);
           livro.cadastraLivro(livro);
           return true;
        }
        return false;
    }
    public ArrayList<Livro> listarLivros(String nome) throws ExceptionDAO{
        return new Livro().listarLivros(nome);
    }

    public boolean alterarLivro(Integer codLivro, String titulo, String genero, String sinopse, Integer numPaginas) throws ExceptionDAO{
        if(titulo != null && titulo.length() > 0 && genero != null && genero.length() >0 && sinopse != null && sinopse.length() >0 && numPaginas != null && numPaginas > 0){
        Livro livro = new Livro(titulo, genero, sinopse, numPaginas);
        livro.setCodLivro(codLivro);
        livro.alterarLivro(livro);
           return true;
        }
        return false;
    }
    public boolean apagarLivro(int codLivro) throws ExceptionDAO{
        if(codLivro == 0){
            return false;
        }else{
            Livro livro = new Livro();
            livro.setCodLivro(codLivro);
            livro.apagarLivro(livro);
            return true;
        } 
    }
}
