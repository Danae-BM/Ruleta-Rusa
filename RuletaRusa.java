public class RuletaRusa {
    public static void main(String[] args){
        Juego juego = new Juego(2);
                while (!juego.finJuego()){
                    juego.ronda();
                }
        System.out.printf("El juego a terminado");
    }
}
