package Model;

public class Caminhao extends Veiculo implements Automovel{
    private int capacidadeDeCarga;

    public Caminhao() {
        super();
    }

    public Caminhao(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public Caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    @Override
    public String getRenavam() {
        return null;
    }

    @Override
    public String getChassi() {
        return null;
    }

    @Override
    public String getPlaca() {
        return null;
    }

    @Override
    public void setRenavam(String renavam) {

    }

    @Override
    public void setChassi(String chassi) {

    }

    @Override
    public void setPlaca(String placa) {

    }
}
