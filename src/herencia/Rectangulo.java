package herencia;

public class Rectangulo extends Figura{

    public Rectangulo(double lado1, double lado2){
        super(lado1, lado2, 0);
    }

    @Override
    public double calcularArea() {
        return this.getLado1() * this.getLado2();
    }

    @Override
    public double calcularPerimetro() {
        return (this.getLado1() + this.getLado2()) * 2;
    }

    public String toString(){
        return String.format("[RECTANGULO] Lado 1: %.2f cm - Lado 2: %.2f cm - Area: %.2f cm2 - Perimetro: %.2f cm", this.getLado1(), this.getLado2(), this.calcularArea(), this.calcularPerimetro());
    }

}
