/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import model.Cliente;

/**
 *
 * @author debor
 */
public class ClienteDAO {
     public void CadastrarCliente(Cliente cliente) throws ExceptionDAO{
        String sql = "Insert into cliente (nome, cpf, email, endereço, nascimento) value (?, ?, ?, ?, ?)";
         PreparedStatement pStatement = null;
         Connection connection = null;
         
         try{
             connection = new ConnectionMVC().getConnection();
                pStatement = connection.prepareStatement(sql);
                pStatement.setString(1, cliente.getNome());
                pStatement.setString(2, cliente.getCpf());
                pStatement.setString(3, cliente.getEmail());
                pStatement.setString(4, cliente.getEndereco());
                pStatement.setDate(5, (java.sql.Date) new Date (cliente.getNascimento().getTime()));
                pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao cadastrar Cliente: " + e);
        }finally{
             try{
                 if (pStatement != null) { pStatement.close();}
                 
             }catch (SQLException e) {
                throw new ExceptionDAO("Error ao fechar Statement: " + e);
            }
             
             try{
                 if(connection != null) {connection.close();}
             }catch (SQLException e) {
                throw new ExceptionDAO("Error ao fechar a conexão: " + e);
            }
         }
    }
}
