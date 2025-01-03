package Model;
import java.util.ArrayList;
import java.util.Collections;
public class Juego {
    private Equipo equipoUno;
    private Equipo equipoDos;
    private ArrayList <Carta> mazoCartas;
    private AdministradorDePuntos puntaje;
    private AdministradorDeTurnos turnos;
    private AdministradorDeRondas ronda;
    public Juego(Equipo equipoUno,Equipo equipoDos,ArrayList<Carta> mazoCartas,AdministradorDeTurnos turnos,AdministradorDePuntos puntaje){
        this.equipoUno = equipoUno;
        this.equipoDos = equipoDos;
        this.mazoCartas = mazoCartas;
        this.turnos = turnos;
        this.puntaje = puntaje;
    }
    public void mostrarCartas(Jugador jugador){
        for(int i = 0 ; i < jugador.cantidadCartas(); i++){
            Carta carta = jugador.obtenerCarta(i);
            carta.mostrarCarta(i+1);
        }
    }
    public boolean juegoTerminado(){
        boolean terminado = false;
        if(puntaje.hayGanador()){
            Equipo ganador = puntaje.determinarGanador();
            terminado = true;
        }
        return terminado;
    }
    private void asignarCartas(Equipo equipo){
        for(int i = 0 ; i < equipo.cantidadJugadores() ; i++){
            for(int j = 0 ; j < 3 ; j++){
                Carta carta = this.mazoCartas.get(0);
                equipo.repartirCartas(carta,i);
                this.mazoCartas.remove(0);
            }
        }
    }
    public void repartirCartas(){
        Collections.shuffle(this.mazoCartas);
        this.asignarCartas(this.equipoUno);
        this.asignarCartas(this.equipoDos);
    }
    private void jugarTurno(Jugador jugador){
        this.mostrarCartas(jugador);
        Carta carta = jugador.usarCarta(3);
        if(this.equipoUno.contieneJugador(jugador)){

        }
        else if(this.equipoDos.contieneJugador(jugador)){

        }
    }
    public void jugarJuego(){
        this.repartirCartas();
        while(this.ronda.nohayaganadorRonda()){
            Jugador jugador = this.turnos.turnoDeJugador();
            this.jugarTurno(jugador);
        }
    }
}
