package model;

public class Corrente extends Conta implements Associado{
    private int cotas;
    private double valorCotas;
    public Corrente() {
    }

    public Corrente(double saldo) {
        super(saldo);
    }

    public void setCotas(int cotas){
        this.cotas = cotas;
    }

    public int getCotas() {
        return cotas;
    }

    @Override
    public String toString() {
        return "Corrente{" +
        "saldo=" + getSaldo() +
                ", cotas=" + cotas +
                '}';
    }

    @Override
    public void lucros(int qtdCotas, double valorCota) {
        this.cotas = qtdCotas;
        this.valorCotas = valorCota;
    }
}
