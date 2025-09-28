package Model;

public class Cuadrado extends Figura{
    protected int lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}
