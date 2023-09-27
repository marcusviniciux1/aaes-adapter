package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveRetornarEstoqueDoProduto() {
        Produto produto = new Produto();
        produto.setEstoque("Produto em Estoque");

        assertEquals("Produto em Estoque", produto.getEstoque());
    }

    @Test
    void deveRetornarQuantidadeDoProduto() {
        Produto produto = new Produto();
        produto.setEstoque("Produto em Estoque");

        assertEquals(15, produto.getQuantidade());
    }
}