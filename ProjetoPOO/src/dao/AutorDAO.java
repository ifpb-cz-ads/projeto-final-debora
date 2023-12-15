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
import model.Escritor;

/**
 *
 * @author debor
 */
public class AutorDAO {
    public void cadastrarEscritor(Escritor escritor) throws ExceptionDAO{
        String sql = "Insert into escritor (nome, nacionalidade) value (?, ?)";
         PreparedStatement pStatement = null;
         Connection connection = null;
         
         try{
             connection = new ConnectionMVC().getConnection();
             pStatement = connection.prepareStatement(sql);
             pStatement.setString(1, escritor.getNome());
             pStatement.setString(2, escritor.getNacionalidade());
             pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao cadastrar Ator: " + e);
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
     public ArrayList<Escritor> listarAutores(String nome) throws ExceptionDAO{
       String sql = "select * from escritor where nome like '%" + nome + "%' order by by nome";
        
       Connection connection = null;
       PreparedStatement pStatement = null;
       ArrayList<Escritor> escritores = null;
       
       try{
           connection = new ConnectionMVC().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet rs = pStatement.executeQuery(sql);
           
           if(rs!=null){
               escritores = new ArrayList<Escritor>();
               while(rs.next()){
                   Escritor escritor = new Escritor();
                   escritor.setCodAutores(rs.getInt("CodAutor"));
                   escritor.setNome(rs.getString("Nome"));
                   escritor.setNacionalidade(rs.getString("Nacionalidade"));
                   escritores.add(escritor);
                   
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o Escritor." + e);
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
    return escritores;
    }
     public void alterarEscritor(Escritor escritor) throws ExceptionDAO{
        String sql = "Update escritor set nome = ?, nacionalidade = ? where codAutores = ?";
         PreparedStatement pStatement = null;
         Connection connection = null;
         
         try{
             connection = new ConnectionMVC().getConnection();
             pStatement = connection.prepareStatement(sql);
             pStatement.setString(1, escritor.getNome());
             pStatement.setString(2, escritor.getNacionalidade());
             pStatement.setInt(3, escritor.getCodAutores());
             pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao alterar Ator: " + e);
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
     public void apagarEscritor(Escritor escritor) throws ExceptionDAO{
        String sql = "Delete From Escritor where codAutores = ?";
         PreparedStatement pStatement = null;
         Connection connection = null;
         
         try{
             connection = new ConnectionMVC().getConnection();
             pStatement = connection.prepareStatement(sql);
             pStatement.setInt(1, escritor.getCodAutores());
             pStatement.execute();
             
         }catch (SQLException e) {
            throw new ExceptionDAO("Error ao apagar Ator: " + e);
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
