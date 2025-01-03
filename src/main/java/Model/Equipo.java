package Model;
import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> equipo;
    private int puntaje;
    private ArrayList<Carta> pozoCarta;
    public Equipo(ArrayList<Jugador> equipo){
        this.equipo = equipo;
        this.puntaje = 0;
    }
    public void sumarPuntaje(int puntos){
        this.puntaje += puntos;
    }
    public boolean tienePuntajeMaximo(int puntajemaximo){
        return (this.puntaje >= puntajemaximo);
    }
    public int cantidadJugadores(){
        return this.equipo.size();
    }
    public void repartirCartas(Carta carta,int indice){
        this.equipo.get(indice).agregarCarta(carta);
    }
    public boolean contieneJugador(Jugador jugador){
        return this.equipo.contains(jugador);
    }
}
