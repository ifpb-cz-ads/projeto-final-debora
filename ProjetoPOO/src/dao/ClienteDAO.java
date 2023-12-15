/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

    public ArrayList<Cliente> listarClientes(String nome) throws ExceptionDAO {
        String sql = "select * from cliente where nome like '%" + nome + "%' order by by nome";
        
       Connection connection = null;
       PreparedStatement pStatement = null;
       ArrayList<Cliente> clientes = null;
       
       try{
           connection = new ConnectionMVC().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet rs = pStatement.executeQuery(sql);
           
           if(rs!=null){
               clientes = new ArrayList<Cliente>();
               while(rs.next()){
                   Cliente cliente = new Cliente();
                   cliente.setCodCliente(rs.getInt("CodCliente"));
                   cliente.setNome(rs.getString("Nome"));
                   cliente.setCpf(rs.getString("CPF:"));
                   cliente.setEmail(rs.getString("Email"));
                   cliente.setEndereco(rs.getString("Endereço"));
                   cliente.setNascimento(rs.getDate("Nascimento"));
                   clientes.add(cliente);
                   
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o Cliente." + e);
        }finally{
           try{
               if(pStatement!=null) { pStatement.close();}
           } catch (SQLException e) {
                throw new ExceptionDAO("Error ao fechar o pStatement:" + e);
           }
           try{
               if(connection!=null) {connection.close();}
           } catch (SQLException e) {
                 throw new ExceptionDAO("Error ao fechar conexão:" + e);
           }
       }
    return clientes;
    }
     public void alterarCliente(Cliente cliente) throws ExceptionDAO{
        String sql = "Update Cliente set nome = ?, cpf = ?, email = ?, endereço = ?, nascimento = ? where codCliente = ?";
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
                pStatement.setInt(6, cliente.getCodCliente());
                pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao alterar Cliente: " + e);
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
     public void apagarCliente(Cliente cliente) throws ExceptionDAO{
        String sql = "Delete From cliente where codCliente = ?";
         PreparedStatement pStatement = null;
         Connection connection = null;
         
         try{
             
             connection = new ConnectionMVC().getConnection();
                pStatement = connection.prepareStatement(sql);
                pStatement.setInt(1, cliente.getCodCliente());
                pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao apagar Cliente: " + e);
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

