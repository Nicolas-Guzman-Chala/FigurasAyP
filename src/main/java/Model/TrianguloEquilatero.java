package Model;

public class TrianguloEquilatero extends Figura {
    protected int lado;

    public TrianguloEquilatero(int lado){
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
        return lado * 3;
    }

    @Override
    public double calcularArea() {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }
}
