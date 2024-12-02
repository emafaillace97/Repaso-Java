package herencia;

public abstract class Figura {

    private final double lado1, lado2, lado3;

    public Figura(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    /**
     * Se calcula el area de la figura
     * @return
     */
    public abstract double calcularArea();

    /**
     * Se calcula el perimetro de la figura
     * @return
     */
    public abstract double calcularPerimetro();
}
