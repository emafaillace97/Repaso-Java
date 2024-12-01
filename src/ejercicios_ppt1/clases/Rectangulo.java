package ejercicios_ppt1.clases;

public class Rectangulo {

    private int alto, ancho, posX, posY;

    public Rectangulo(int ancho, int alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(int ancho, int alto, int posX, int posY){
        this.ancho = ancho;
        this.alto = alto;
        this.posX = posX;
        this.posY = posY;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String toString(){
        return String.format("Rectangulo:\tANCHO: %d cm - ALTO: %d cm - X = %d - Y = %d", this.ancho, this.alto, this.posX, this.posY);
    }

    /*
    Calcula el area del rectangulo
     */
    public int calcularArea(){
        return this.ancho * this.alto;
    }

    /*
    Desplaza el rectangulo dentro del plano XY
     */
    public void mover(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    /*
    Verifica si un punto esta contenido dentro del plano XY
     */
    public boolean contienePunto(int x, int y){
        boolean estaEnX = (x >= this.posX) && (x <= (this.posX + this.ancho));
        boolean estaEnY = (y >= this.posY) && (y <= (this.posY + this.alto));
        return estaEnX && estaEnY;
    }
}
