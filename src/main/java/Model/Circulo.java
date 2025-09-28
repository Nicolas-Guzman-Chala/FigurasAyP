package Model;

public class Circulo extends Figura{
    protected int radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * 3.14;
    }

    @Override
    public double calcularPerimetro() {
        return Math.pow(radio,2) * 3.14;
    }
}
