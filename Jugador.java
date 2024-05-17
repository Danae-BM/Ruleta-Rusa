public class Jugador {

    private int id;
    private String nombre;
    private boolean vivo;

    public Jugador(int id){
        this.id=id;
        this.nombre= "jugador" + id;
        this.vivo=true;
    }

    public boolean dispararBala(Revolver r ){

        System.out.println("El "+ nombre +" se apunta con la pistola");
        if (r.disparar()){
            this.vivo=false; //El jugador muere
            System.out.println("El " + nombre +" a MUERTO....");
        } else {
            System.out.println("El " + nombre +" a SAFADO... por ahora...");

        }
        return vivo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public boolean isVivo(){
        return vivo;
    }

    public void setVivo(boolean vivo){
        this.vivo=vivo;
    }
}
