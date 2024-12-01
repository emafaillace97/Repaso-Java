package ejercicios_ppt1.excepciones;

public class NumerosNegativosEx extends Exception {

    public NumerosNegativosEx(){
        super("Algun/os valores son iguales a cero o negativos");
    }
}
