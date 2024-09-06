package domain;

public class ItemPedido {

    private Pedido pedido;
    private Produto produto;
    private Double precoVenda;
    private Integer quantidade;
    private Double desconto;

    public ItemPedido(Pedido pedido, Produto produto, Integer quantidade, Double desconto) {
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    public Double calculaValorItemPedido() {
        this.precoVenda = produto.calculaPreco(desconto);
        return this.precoVenda * this.quantidade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    
}
