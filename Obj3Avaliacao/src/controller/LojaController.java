package controller;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LojaController {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(1, "Ariel", "Rua Mostardas", "Laranjal", "11111-111", "Pelotas", "RS", "Sede");
        Vendedor v2 = new Vendedor(2, "Bariel", "Rua Getulio Vargas", "Centro", "22222-222", "Cangucu", "RS", "Escritorio");

        Fornecedor f1 = new Fornecedor("94.772.165/0001-49", "(53) 98141 6374", "PepsiCo");
        Fornecedor f2 = new Fornecedor("34.420.123/0001-69", "(53) 99901 9166", "Panificadora Marcinho");

        Produto prod1 = new Produto(1, "Agua", 50, 2.50);
        Produto prod2 = new Produto(2, "Pao", 50, 4.99);

        Item item1 = new Item(1, 10.0,10, prod1);
        Item item2 = new Item(2, 15.0, 15, prod2);
        prod1.getItemList().add(item1);
        prod2.getItemList().add(item2);

        //Exercicio 1.b:
        Pedido p1 = new Pedido(1, LocalDate.of(2023, 10, 23), v1);
        p1.addItens(item1);
        Pedido p2 = new Pedido(2, LocalDate.of(2023, 6, 16), v2);
        p2.addItens(item2);
        v1.getPedidoList().add(p1);
        v2.getPedidoList().add(p2);

        List<Pedido> vendas = new ArrayList<>();
        vendas.add(p1);
        vendas.add(p2);

        System.out.println("\nVendas: ");
        System.out.println(vendas);
        System.out.println("\nEstoque: ");
        System.out.println(prod1);
        System.out.println(prod2);

        // Exercicio 1.c:
        prod1.getFornecedorList().add(f1);
        prod2.getFornecedorList().add(f2);

        Fornecimento fmento1 = new Fornecimento(LocalDate.of(2023, 10, 21), prod1.getPreco() * 10, prod1, f1);
        Fornecimento fmento2 = new Fornecimento(LocalDate.of(2023, 10, 21), prod2.getPreco() * 15, prod2, f2);
        prod1.setQuantidade(prod1.getQuantidade() + 10);
        prod2.setQuantidade(prod2.getQuantidade() + 15);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fmento1);
        fornecimentoList.add(fmento2);

        System.out.println("Fornecimentos: ");
        System.out.println(fornecimentoList);

        System.out.println("\nValor total de cada fornecimento: ");
        Double vTotal = 0.0;
        for (Fornecimento fornecimento : fornecimentoList) {
            vTotal += fornecimento.getValorTotal();
        }
        System.out.println(vTotal);
    }
}