package Model;

import java.util.*;

public class AdministradorDeTurnos {
    private Queue <Jugador> turnos;
    private List <Jugador> ronda;
    int cantidadRondas;

    public AdministradorDeTurnos(){
        this.turnos = new LinkedList<Jugador>();
        this.ronda = new LinkedList<Jugador>();
    }
    public void armarColaDeTurnos(){
        for(int i = 0 ; i < this.ronda.size() ; i++){
            this.turnos.add(this.ronda.get(i));
        }
    }
    public void armarRonda(ArrayList<Jugador> equipoUno,ArrayList<Jugador> equipoDos){
        for(int i = 0 ; i < equipoUno.size() ; i++){
            this.ronda.add(equipoUno.get(i));
            this.ronda.add(equipoDos.get(i));
        }
    }
    public void rearmarRonda(){
        Jugador jugador = this.ronda.get(0);
        this.ronda.add(this.ronda.size(),jugador);
    }
    public Jugador turnoDeJugador(){
        Jugador jugador = this.turnos.remove();
        this.turnos.add(jugador);
        return jugador;
    }
}
