package mycompany.projetopoo.controller;


import mycompany.projetopoo.model.Escritor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
