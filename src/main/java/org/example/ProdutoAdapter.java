package org.example;

public class ProdutoAdapter extends ProdutoQuantidade {

    private IProduto produtoEstoque;

    public ProdutoAdapter(IProduto produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public String recuperarProduto() {
        if (this.getQuantidade() > 10)
            produtoEstoque.setEstoque("Produto em Estoque");
        else if (this.getQuantidade() > 0)
            produtoEstoque.setEstoque("Produto em Baixa Quantidade");
        else
            produtoEstoque.setEstoque("Produto Fora de Estoque");
        return produtoEstoque.getEstoque();
    }

    public void salvarProduto() {
        if (produtoEstoque.getEstoque().equals("Produto em Estoque"))
            this.setQuantidade(15);
        else if (produtoEstoque.getEstoque().equals("Produto em Baixa Quantidade"))
            this.setQuantidade(5);
        else
            this.setQuantidade(0);
    }
}