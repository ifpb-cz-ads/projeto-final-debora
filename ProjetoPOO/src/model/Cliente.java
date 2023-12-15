/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import dao.ClienteDAO;
import dao.ExceptionDAO;
import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    
    private Integer codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private Date nascimento;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public Cliente(){}
    
    public Cliente(String nome, String cpf, String email, String endereco, Date nascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.nascimento = nascimento;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    public void casdastrarCliente(Cliente cliente) throws ExceptionDAO{
        new ClienteDAO().CadastrarCliente(cliente);
    }
     

    public ArrayList<Cliente> listarLivros(String nome)throws ExceptionDAO{
        return new ClienteDAO().listarClientes(nome);
        
    }
    public void alterarCliente(Cliente cliente) throws ExceptionDAO{
        new ClienteDAO().alterarCliente(cliente);
    }
     public void apagarCliente(Cliente cliente) throws ExceptionDAO{
        new ClienteDAO().apagarCliente(cliente);
    }
}


