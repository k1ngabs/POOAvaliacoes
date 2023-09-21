package Model;

public abstract class Animal {
    protected double x;
    protected double y;

    public void mover(double nx, double ny){
        this.x = nx;
        this.y = ny;
    }

    public abstract void desenhar();
}
