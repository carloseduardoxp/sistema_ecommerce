package domain;

import java.util.List;

public class Produto {

    private Integer id;
    private String nome;
    private Double preco;
    private Integer unidadesEstoque;
    private String imagem;
    private Categoria categoria;
    private List<ItemPedido> itensPedido;
    
    public Produto(Integer id, String nome, Double preco, Integer unidadesEstoque, String imagem, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.unidadesEstoque = unidadesEstoque;
        this.imagem = imagem;
        this.categoria = categoria;
    }

    public Double calculaPreco(Double desconto) {
        return preco - desconto;
    }

    public Boolean validaEstoque(Integer quantidade) {
        return unidadesEstoque - quantidade >= 0;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getUnidadesEstoque() {
        return unidadesEstoque;
    }
    public void setUnidadesEstoque(Integer unidadesEstoque) {
        this.unidadesEstoque = unidadesEstoque;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    

}
