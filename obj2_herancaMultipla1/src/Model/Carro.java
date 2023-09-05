package Model;

public class Carro extends Veiculo implements Automovel{
    private int capacidadeDePortaMalas;

    public Carro() {
        super();
    }

    public Carro(int capacidadeDePortaMalas) {
        this.capacidadeDePortaMalas = capacidadeDePortaMalas;
    }

    public Carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDePortaMalas) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDePortaMalas = capacidadeDePortaMalas;
    }

    public int getCapacidadeDePortaMalas() {
        return capacidadeDePortaMalas;
    }

    public void setCapacidadeDePortaMalas(int capacidadeDePortaMalas) {
        this.capacidadeDePortaMalas = capacidadeDePortaMalas;
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
