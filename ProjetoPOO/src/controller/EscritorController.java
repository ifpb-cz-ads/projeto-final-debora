/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ExceptionDAO;
import java.util.ArrayList;
import model.Escritor;

/**
 *
 * @author debor
 */
public class EscritorController {
    boolean sucesso = true;
    public boolean cadastrarEscritor(String nome, String nacionalidade) throws ExceptionDAO{
        if(nome != null && nome.length()>0 && nacionalidade != null && nacionalidade.length()>0){
           Escritor escritor = new Escritor(nome, nacionalidade);
           escritor.cadastrarEscritor(escritor);
            return sucesso;
        }else{
            return false;
        }
    }
    public ArrayList<Escritor> listarAutores(String nome) throws ExceptionDAO{
     return new Escritor().listarAutores(nome);
        
    }
    public boolean alterarEscritor(Integer codAutor, String nome, String nacionalidade) throws ExceptionDAO{
        if(nome != null && nome.length()>0 && nacionalidade != null && nacionalidade.length()>0){
           Escritor escritor = new Escritor(nome, nacionalidade);
           escritor.setCodAutores(codAutor);
           escritor.alterarEscritor(escritor);
            return true;
        }else{
            return false;
        }
    }
    public boolean apagarEscritor(int codAutor) throws ExceptionDAO{
        if(codAutor == 0){
            return false;
        }else{
            Escritor escritor = new Escritor();
            escritor.setCodAutores(codAutor);
            escritor.apagarEscritor(escritor);
            return true;
        } 
    }
}
