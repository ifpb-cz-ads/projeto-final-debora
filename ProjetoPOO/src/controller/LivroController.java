/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Livro;

/**
 *
 * @author debor
 */
public class LivroController {
    public boolean cadastraLivro(String titulo, String genero, String sinopse, Integer numPaginas){
        if(titulo != null && titulo.length() > 0 && genero != null && genero.length() >0 && sinopse != null && sinopse.length() >0 && numPaginas != null && numPaginas > 0){
        Livro livro = new Livro(titulo, genero, sinopse, numPaginas);
           livro.cadastraLivro(livro);
           return true;
        }
        return false;
    }
    
}
