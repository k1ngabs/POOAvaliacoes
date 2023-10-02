package model;

public class Cliente implements Associado{
    private String nome;
    private String id;
    private int cotas;
    private double valorCotas;
    public Cliente() {}

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCotas() {
        return cotas;
    }

    public void setCotas(int cotas) {
        this.cotas = cotas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome='" + nome + ", cotas="+ cotas +'}';
    }

    @Override
    public void lucros(int qtdCotas, double valorCota) {
        this.cotas = qtdCotas;
        this.valorCotas = valorCota;
    }
}
