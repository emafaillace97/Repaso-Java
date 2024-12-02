package herencia;

public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado1) {
        super(lado1, lado1);
    }

    @Override
    public double calcularArea(){
        return this.getLado1() * this.getLado1();
    }

    @Override
    public double calcularPerimetro(){
        return this.getLado1() * 4;
    }

    public String toString(){
        return String.format("[CUADRADO] Lado 1: %.2f cm - Area: %.2f cm2 - Perimetro: %.2f cm", this.getLado1(), this.calcularArea(), this.calcularPerimetro());
    }
}
