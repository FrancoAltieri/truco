package Model;
import java.util.ArrayList;
public class Juego {
    private ArrayList <Jugador> jugadores;
    private ArrayList <Carta> mazoCartas;
    private administradorPuntos puntaje;
    public Juego(ArrayList<Jugador>jugadores, ArrayList<Carta>cartas){
        this.jugadores = jugadores;
        this.mazoCartas = cartas;
    }
    public void mostrarCartas(Jugador jugador){
        for(int i = 0 ; i < jugador.cantidadCartas(); i++){
            Carta carta = jugador.obtenerCarta(i);
            System.out.println("Carta "+(i+1)+": " + carta.getValor() + " de " + carta.tipoCarta());
        }
    }
    public boolean juegoTerminado(){
        boolean terminado = false;
        if(puntaje.hayGanador()){
            terminado = true;
        }
        return terminado;
    }
    public void jugarTurno(Jugador jugador){

    }
}
