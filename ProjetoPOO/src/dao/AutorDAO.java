/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
}
