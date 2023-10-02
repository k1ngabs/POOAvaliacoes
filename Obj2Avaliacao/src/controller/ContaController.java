package controller;

import model.*;

import java.util.*;

public class ContaController {
    public double valor;
    public static void main(String[] args) {

        //1.a
        Corrente c1 = new Corrente(250);
        Corrente c2 = new Corrente(300);
        Corrente c3 = new Corrente(500);

        Poupanca p1 = new Poupanca(900);
        Poupanca p2 = new Poupanca(10000);
        Poupanca p3 = new Poupanca(42069);

        Cliente cli1 = new Cliente("Ariel");
        Cliente cli2 = new Cliente("Bariel");
        Cliente cli3 = new Cliente("Cariel");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(cli1);
        System.out.println(cli2);
        System.out.println(cli3);

        //1.b
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        contas.add(p1);
        contas.add(p2);
        contas.add(p3);

        ArrayList<Associado> associados = new ArrayList<>();
        associados.add(cli1);
        associados.add(cli2);
        associados.add(cli3);
        associados.add(c1);
        associados.add(c2);
        associados.add(c3);

        System.out.println("\n\n Coleção de Contas: " + contas);
        System.out.println("\n\n Coleção de Associados: " + associados);

        //1.c
        System.out.println("\n1.c: Valor atual da poupanca:" + p1.getSaldo());
        p1.deposita(1000);
        System.out.println("\n1.c: Valor da poupanca apos deposito:" + p1.getSaldo());
        p1.atualiza(5);
        System.out.println("\n1.c: Valor da poupanca apos atualizacao:" + p1.getSaldo());
        p1.saca(50);
        System.out.println("\n1.c: Valor da poupanca apos saque:" + p1.getSaldo());

        //1.d
        System.out.println("\n1.d: Valor atual da corrente:" + c1.getSaldo());
        c1.deposita(500);
        System.out.println("\n1.d: Valor atual da corrente apos deposito:" + c1.getSaldo());
        c1.saca(400);
        System.out.println("\n1.d: Valor atual da corrente apos saque:" + c1.getSaldo());

        //1.e
        c1.setCotas(100);
        c2.setCotas(400);
        c3.setCotas(600);
        cli1.setCotas(300);
        cli2.setCotas(600);
        cli3.setCotas(600);
        System.out.println("\n\n Coleção de Associados: " + associados);

        //1.f
        associados.sort(Comparator.comparing(Associado::getCotas).reversed());
        System.out.println("\n\n Coleção de Associados por quantidade de cotas em ordem decrescente: " + associados);

        System.out.print("\n\nAssociado com maior quantidade de cotas: ");
        Associado aMC = Collections.max(associados, Comparator.comparing(Associado::getCotas));
        associados.forEach(a -> {
            if(a.getCotas() >= aMC.getCotas()) {
                System.out.print(a+"\n");
            }
        });

        //1.g
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n\n Coleção de Contas por saldo em ordem decrescente: " + contas);

        System.out.println("Associados que possuem conta:\n");
        associados.forEach(a -> {
            if(a instanceof Conta){
                System.out.println(a+"\n");
            }
        });

        System.out.print("\n\nConta com o maior saldo: ");
        Conta cMS = Collections.max(contas, Comparator.comparing(Conta::getSaldo));
        contas.forEach(c -> {
            if(c.getSaldo() >= cMS.getSaldo()) {
                System.out.print(c+"\n");
            }
        });

    }
}
