package org.example;

public class ProdutoEstoque implements IProduto {

    private String estoque;

    @Override
    public String getEstoque() {
        return this.estoque;
    }

    @Override
    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
}