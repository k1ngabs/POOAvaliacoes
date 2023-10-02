package model;

public abstract class Conta {
    private double saldo;
    private String idDono;

    public Conta(){}
    public Conta(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) {
        this.saldo = this.saldo - valor;
    }
    public void atualiza(double taxa) {
        double taxaAtt;
        taxaAtt = taxa/100;
        this.saldo = this.saldo + (this.saldo * taxaAtt);
    }
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
