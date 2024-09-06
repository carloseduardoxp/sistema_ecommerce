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
    
}
