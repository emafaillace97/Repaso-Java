package ejercicios_ppt1;

import ejercicios_ppt1.excepciones.*;
import ejercicios_ppt1.clases.*;

public class EjerciciosPPT1 {

    /*
    Comprobar si tres números enteros forman un triángulo
     */
    public static boolean formanTriangulo(int a, int b, int c) throws NumerosNegativosEx {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new NumerosNegativosEx();
        } else {
            return ((a + b) > c) && ((a + c) > b) && ((b + c > a));
        }
    }

    /*
    Calcular el voluemen de varias esferas segun un radio
     */
    public static double getVolumenEsfera(double r) throws RadioIncorrectoEx {
        if (r <= 0) {
            throw new RadioIncorrectoEx();
        } else {
            return ((double) 4 / 3) * Math.PI * (Math.pow(r, 3));
        }
    }

    /*
    Calcular la distancia entre dos puntos
     */
    public static Punto calcularDistancia(Punto p1, Punto p2) {
        return p1.calcularDistancia(p2);
    }

    /*
    Verificar si un arreglo conforma una progresion aritmetica
     */
    public static boolean formaProgresionAritmetica(int[] arreglo) throws ArregloVacioEx {
        if (arreglo.length == 0) {
            throw new ArregloVacioEx();
        } else {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
    Hallar la suma de los numeros pares dentro de un arreglo
     */
    public static int getSumaPares(int[] arreglo) throws ArregloVacioEx {
        if (arreglo.length == 0) {
            throw new ArregloVacioEx();
        } else {
            int suma = 0;
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] % 2 == 0) {
                    suma += arreglo[i];
                }
            }
            return suma;
        }
    }
}
