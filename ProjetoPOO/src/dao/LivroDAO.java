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
    
    public ArrayList<Livro> listarLivros(String nome) throws ExceptionDAO{
       String sql = "select * from livro where titulo like '%" + nome + "%' order by by titulo";
        
       Connection connection = null;
       PreparedStatement pStatement = null;
       ArrayList<Livro> livros = null;
       
       try{
           connection = new ConnectionMVC().getConnection();
           pStatement = connection.prepareStatement(sql);
           ResultSet rs = pStatement.executeQuery(sql);
           
           if(rs!=null){
               livros = new ArrayList<Livro>();
               while(rs.next()){
                   Livro livro = new Livro();
                   livro.setCodLivro(rs.getInt("CodLivro"));
                   livro.setTitulo(rs.getString("Titulo"));
                   livro.setSinopse(rs.getString("Sinopse"));
                   livro.setGenero(rs.getString("Genero"));
                   livro.setNumPaginas(rs.getInt("Paginas"));
                   livros.add(livro);
               }
           }
           
       } catch (SQLException e) {
           throw new ExceptionDAO("Error ao consultar o livro." + e);
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
    return livros;
    }
    public void alterarLivro(Livro livro) throws ExceptionDAO{
        String sql = "Update Livro set titulo = ?, genero = ?, sinopse = ?, paginas = ? where codLivro = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
               pStatement.setString(1, livro.getTitulo());
               pStatement.setString(2, livro.getGenero());
               pStatement.setString(3, livro.getSinopse());
               pStatement.setInt(4, livro.getNumPaginas());
               pStatement.setInt(5, livro.getCodLivro());
               pStatement.execute();
        } catch (SQLException e) {
             throw new ExceptionDAO("Error ao alterar o livro." + e);
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
    }
    public void apagarLivro(Livro livro) throws ExceptionDAO {
        String sql = "Delete From Livro where codLivro = ?";
        PreparedStatement pStatement = null;
        Connection connection = null;
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, livro.getCodLivro());
            pStatement.execute();
        }catch(SQLException e){
            throw new ExceptionDAO("ERROR ao tentar apagar o Livro:" + e);
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
