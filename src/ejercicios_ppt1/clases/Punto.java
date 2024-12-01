package ejercicios_ppt1.clases;

public class Punto {

    private int a, b;

    public Punto(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public Punto calcularDistancia(Punto p2){
        return new Punto(p2.getA() - this.a, p2.getB() - this.b);
    }

    public String toString(){
        return String.format("Coordenada x: %d - Coordenada y: %d", this.a, this. b);
    }
}
