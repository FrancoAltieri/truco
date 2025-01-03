package App;
import Model.Carta;
import Model.Juego;
import Model.Jugador;
import java.util.ArrayList;
import Model.Equipo;
import Model.AdministradorDeTurnos;
import Model.AdministradorDePuntos;
import java.util.Collections;
public class Main {
    public static void comenzarJuego(Juego juego){
        while(!juego.juegoTerminado()){
            juego.jugarJuego();
        }
    }
    public static ArrayList<Jugador> crearJugadores(String nombre){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Jugador jugador1 = new Jugador(nombre);
        jugadores.add(jugador1);
        return jugadores;
    }
    public static ArrayList<Jugador> crearEquipo(String nombre){
        ArrayList<Jugador> jugadores = crearJugadores(nombre);
        return jugadores;
    }
    public static void crearCartas(ArrayList<Carta> mazo,String tipoCarta){
        Carta carta;
        int j = 0;
        for(int i = 0; i < 10; i++){
            if(j >= 7)
                j += 3;
            carta = new Carta(j+1,tipoCarta);
            mazo.add(carta);
            j++;
        }
    }
    public static ArrayList<Carta> crearCartas(){
        ArrayList<Carta> mazo = new ArrayList<Carta>();
        crearCartas(mazo,"Espada");
        crearCartas(mazo,"Oro");
        crearCartas(mazo,"Copa");
        crearCartas(mazo,"Basto");
        Collections.shuffle(mazo);
        return mazo;
    }
    public static void main(String[] args) {

        ArrayList<Jugador> equipoUno = crearEquipo("Vuol");
        ArrayList<Jugador> equipoDos = crearEquipo("Mgjmh120");

        Equipo equipo1 = new Equipo(equipoUno);
        Equipo equipo2 = new Equipo(equipoDos);

        AdministradorDePuntos adminDePuntos = new AdministradorDePuntos(15,equipo1,equipo2);
        AdministradorDeTurnos adminDeTurnos = new AdministradorDeTurnos();

        adminDeTurnos.armarRonda(equipoUno,equipoDos);
        adminDeTurnos.armarColaDeTurnos();

        ArrayList<Carta> cartas = crearCartas();

        Juego juego = new Juego(equipo1,equipo2,cartas,adminDeTurnos,adminDePuntos);

        comenzarJuego(juego);
    }
}