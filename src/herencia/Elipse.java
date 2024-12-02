package herencia;

public class Elipse extends Figura{

    public Elipse(double lado1, double lado2){
        super(lado1, lado2, 0);
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.getLado1() * this.getLado2();
    }

    @Override
    public double calcularPerimetro() {
        double e1 = (Math.pow(this.getLado1(), 2) + Math.pow(this.getLado2(), 2)) * 0.5;
        return 2*Math.PI*Math.pow(e1, 0.5);
    }

    public String toString(){
        return String.format("[ELIPSE] Lado 1: %.2f cm - Lado 2: %.2f cm - Area: %.2f cm2 - Perimetro: %.2f cm", this.getLado1(), this.getLado2(), this.calcularArea(), this.calcularPerimetro());
    }
}
