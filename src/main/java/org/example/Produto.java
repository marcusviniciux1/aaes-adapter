package org.example;

public class Produto {

    private IProduto produto;
    private ProdutoAdapter adaptador;

    public Produto() {
        produto = new ProdutoEstoque();
        adaptador = new ProdutoAdapter(produto);
    }

    public String getEstoque() {
        return adaptador.recuperarProduto();
    }

    public void setEstoque(String estoque) {
        produto.setEstoque(estoque);
        adaptador.salvarProduto();
    }

    public int getQuantidade() {
        return adaptador.getQuantidade();
    }
}