package herencia;

public class Demo {

    public static void main(String[] args){
        Figura f1 = new Rectangulo(4, 5);
        Figura f2 = new Triangulo(3);
        Figura f3 = new Cuadrado(4);
        Figura f4 = new Elipse(3, 2);
        Figura f5 = new Circulo(3);
        Figura[] figuras = {f1, f2, f3, f4, f5};
        for(int i = 0; i < figuras.length; i++){
            System.out.println(figuras[i]);
        }
    }
}
