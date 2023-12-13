/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
/**
 *
 * @author debor
 */
public class Item {
    private Integer codItem;
    private double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Livro livro;
    private Cliente cliente; 
}
