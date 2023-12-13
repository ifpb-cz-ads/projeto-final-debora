/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Livro;
/**
 *
 * @author debor
 */
public class LivroDAO {
    public void cadastraLivro(Livro livro) throws ExceptionDAO {
        String sql = "insert into filme(titulo, genero, sinopse, paginas) value (?, ?, ?, ?)";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, livro.getTitulo());
            pStatement.setString(2, livro.getGenero());
            pStatement.setString(3, livro.getSinopse());
            pStatement.setInt(4, livro.getNumPaginas());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("ERROR ao tentar cadastrar Livro:" + e);
        } finally{
            
            try{
                if(pStatement != null){ pStatement.close();}
           
            }catch(SQLException e){
                throw new ExceptionDAO("ERROR ao fechar o Statement: " + e);
            }try{
                if(connection != null){ connection.close();}
                }catch(SQLException e){
                    throw new ExceptionDAO ("ERROR ao tenta fechar conexão:" + e);
            }
        }
    }
}
