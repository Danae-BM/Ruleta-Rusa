public class Revolver {

    private int posicionBalaActual;
    private int posicionBala;

    private int maximaPosicion=6;
    private int inicioPosicion=1;

    public Revolver(){
        posicionBalaActual= metodos.generadorNumerosAleatorios(1,6);
        posicionBala= metodos.generadorNumerosAleatorios(1,6);
    }

    public boolean disparar(){
        boolean exito = false;
        if (posicionBalaActual==posicionBala){
            exito= true;

        }
        siguienteBala();
        return exito;
    }

    public void siguienteBala(){
        if (posicionBalaActual==maximaPosicion){
            posicionBalaActual= inicioPosicion;
        } else {
            posicionBalaActual++;
        }
}
  public  String toString(){
        return "Posicion de Bala Actual: " + posicionBalaActual +", Posicion Bala: " + posicionBala;
  }

}

