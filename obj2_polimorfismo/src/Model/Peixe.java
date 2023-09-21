package Model;

public class Peixe extends Animal{
    protected double z;

    public void mover(double nx, double ny, double nz) {
        super.mover(nx, ny);
        this.z = nz;

    }

    @Override
    public void desenhar() {

    }
}
