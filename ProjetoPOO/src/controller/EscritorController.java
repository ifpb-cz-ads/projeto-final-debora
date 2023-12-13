/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Escritor;

/**
 *
 * @author debor
 */
public class EscritorController {
    boolean sucesso = true;
    public boolean cadastrarEscritor(String nome, String nacionalidade){
        if(nome != null && nome.length()>0 && nacionalidade != null && nacionalidade.length()>0){
           Escritor escritor = new Escritor(nome, nacionalidade);
           escritor.cadastrarEscritor(escritor);
            return sucesso;
        }else{
            return false;
        }
    }
}
