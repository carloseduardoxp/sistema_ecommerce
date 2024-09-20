package dao;

import java.util.*;
import domain.*;
import java.sql.*;

public class CategoriaDao {

    public List<Categoria> getCategorias() {
        String sql = "select categoriaID,categoria,descricao from categorias";
        List<Categoria> categorias = new ArrayList<>();
        try {
            Connection conexao = ConexaoMysql.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria(rs.getInt(1),
                                            rs.getString(2), 
                                            rs.getString(3));
                categorias.add(c);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return categorias;
    }

    public Categoria getCategoriaById(Integer id) {
        String sql = "select categoriaID,categoria,descricao from categorias where categoriaID = ?";
        try {
            Connection conexao = ConexaoMysql.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return  new Categoria(rs.getInt(1),
                                            rs.getString(2), 
                                            rs.getString(3));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void inserirCategoria(Categoria categoria) {
        String sql = "insert into categorias(categoria,descricao) values (?,?)";
        try {
            Connection conexao = ConexaoMysql.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, categoria.getNome());
            stmt.setString(2, categoria.getDescricao());
            stmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void updateCategoria(Categoria categoria) {
        String sql = "update categorias set categoria = ?,descricao = ? where categoriaID = ?";
        try {
            Connection conexao = ConexaoMysql.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,categoria.getNome());
            stmt.setString(2,categoria.getDescricao());
            stmt.setInt(3,categoria.getId());
            stmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteCategoria(Integer id) {
        String sql = "delete from categorias where categoriaID = ?";
        try {
             Connection conexao = ConexaoMysql.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             stmt.setInt(1, id);
             stmt.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }



    
}
