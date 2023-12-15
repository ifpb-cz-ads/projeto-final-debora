/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ExceptionDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Cliente;

/**
 *
 * @author debor
 */
public class ClienteController {
    public boolean cadastrarCliente(String nome, String cpf, String email, String endereco, String nascimento) throws ParseException, ExceptionDAO{
        if(nome ==null && nome.length() < 0 && validarCPF(cpf) && email == null && email.length() < 0 && endereco == null && endereco.length() < 0 && validarData(nascimento)){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date data = formato.parse(nascimento);
        Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
        cliente.casdastrarCliente(cliente);
        return true;
        }
        return false;
    }
    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO{
        return new Cliente().listarLivros(nome);
    }
    public boolean validarCPF(String cpf){
        for(int i = 0; i < cpf.length(); i++){
           if(!Character.isDigit(cpf.charAt(i))){
               if(!(i == 3 || i == 7 || i == 11)){
                   return false;
               }
           }
        }
        return true;
    }
    
    public boolean validarData(String data){
        for(int i = 0; i < data.length(); i++){
           if(!Character.isDigit(data.charAt(i))){
               if(!(i == 2 || i == 5)){
                   return false;
               }
           }
        }
      return true;
    } 
    public boolean alterarCliente(Integer codCliente, String nome, String cpf, String email, String endereco, String nascimento) throws ParseException, ExceptionDAO{
        if(nome ==null && nome.length() < 0 && validarCPF(cpf) && email == null && email.length() < 0 && endereco == null && endereco.length() < 0 && validarData(nascimento)){
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        Date data = formato.parse(nascimento);
        Cliente cliente = new Cliente(nome, cpf, email, endereco, data);
        cliente.setCodCliente(codCliente);
        cliente.alterarCliente(cliente);
        return true;
        }
        return false;
    }
    public boolean apagarCliente(int codCliente) throws ExceptionDAO{
        if(codCliente == 0){
            return false;
        }else{
            Cliente cliente = new Cliente();
            cliente.setCodCliente(codCliente);
            cliente.apagarCliente(cliente);
            return true;
        } 
    }
}
