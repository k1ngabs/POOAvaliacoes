package model;

import java.time.LocalDate;

public class Fornecimento {
    private LocalDate data;
    private Double vTotal;
    private Produto produto;
    private Fornecedor fornecedor;

    public Fornecimento() {
    }

    public Fornecimento(LocalDate data, Double valorTotal, Produto produto, Fornecedor fornecedor) {
        this.data = data;
        this.vTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return vTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.vTotal = valorTotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto prod) {
        this.produto = prod;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString(){
        return "\n\nFornecimento de " + data +
                "\nValor total - " + Math.ceil(vTotal) +
                "\nFornecedor - " + fornecedor.getNome() +
                "\nProduto - " + produto.getNome();
    }
}