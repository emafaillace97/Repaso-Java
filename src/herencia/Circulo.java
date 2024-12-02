package herencia;

public class Circulo extends Elipse{

    public Circulo(double lado1) {
        super(lado1, lado1);
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(this.getLado1(), 2);
    }

    @Override
    public double calcularPerimetro(){
        return Math.PI * this.getLado1() * 2;
    }

    public String toString(){
        return String.format("[CIRCULO] Lado 1: %.2f cm - Area: %.2f cm2 - Perimetro: %.2f cm", this.getLado1(), this.calcularArea(), this.calcularPerimetro());
    }

}
