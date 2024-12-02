package herencia;

public class Triangulo extends Figura{

    public Triangulo(double lado1){
        super(lado1, lado1, lado1);
    }

    @Override
    public double calcularArea() {
        return this.getLado1() * this.getLado1() * 0.5;
    }

    @Override
    public double calcularPerimetro() {
        return this.getLado1() * 3;
    }

    public String toString(){
        return String.format("[TRIANGULO] Lado 1: %.2f cm - Area: %.2f cm2 - Perimetro: %.2f cm", this.getLado1(), this.getLado1(), this.getLado1(), this.calcularArea(), this.calcularPerimetro());
    }


}
