

import dao.CategoriaDao;
import domain.Categoria;
import domain.Cliente;
import domain.ItemPedido;
import domain.Pedido;
import domain.Produto;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Categoria categoria = new Categoria(1,"Eletrônicos","Importados");
        Produto produto = new Produto(1, "iphone 15", 5230.34 , 10, "", categoria);
        Cliente cliente = new Cliente("Carl", "Ronaldo Fenomeno", "Empresario","Rua X","Sao Paulo","11123","Brasil","11343434","123123");
        Pedido pedido = new Pedido(1,new Date(), cliente);
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 4,500.24);
        pedido.addItem(itemPedido);
        System.out.println(pedido.calculaValorPedido());

        CategoriaDao categoriaDao = new CategoriaDao();
        List<Categoria> categorias = categoriaDao.getCategorias();
        for (Categoria categoriaBanco: categorias) {
            System.out.println("TRouxe a categoria do banco "+categoriaBanco.getNome());
        }
    }
}
