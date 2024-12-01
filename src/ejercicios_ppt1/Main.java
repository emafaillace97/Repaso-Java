package ejercicios_ppt1;

import ejercicios_ppt1.clases.*;
import ejercicios_ppt1.excepciones.ArregloVacioEx;
import ejercicios_ppt1.excepciones.NumerosNegativosEx;
import ejercicios_ppt1.excepciones.RadioIncorrectoEx;


public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(EjerciciosPPT1.formanTriangulo(3,4,6));EjerciciosPPT1.formanTriangulo(3,4,6);
            System.out.println(EjerciciosPPT1.calcularDistancia(new Punto(2,2), new Punto(4,4)));
            int[] arreglo = {1,2,3,4,5,6};
            System.out.println(EjerciciosPPT1.formaProgresionAritmetica(arreglo));
            System.out.println(EjerciciosPPT1.getSumaPares(arreglo));
            System.out.println(EjerciciosPPT1.getVolumenEsfera(4));
        }catch(ArregloVacioEx | NumerosNegativosEx | RadioIncorrectoEx e){
            System.out.println(e.getMessage());
        }
    }
}