package Model;
import java.util.ArrayList;
public class Truco {
    private ArrayList <Jugador> jugadores;
    private ArrayList <Carta> mazoCartas;
    public Truco(ArrayList<Jugador>jugadores,ArrayList<Carta>cartas){
        this.jugadores = jugadores;
        this.mazoCartas = cartas;
    }
    public void mostrarCartas(Jugador jugador){
        for(int i = 0 ; i < jugador.cantidadCartas(); i++){
            Carta carta = jugador.obtenerCarta(i);
            System.out.println("Carta "+(i+1)+": " + carta.getValor() + " de " + carta.tipoCarta());
        }
    }

}
