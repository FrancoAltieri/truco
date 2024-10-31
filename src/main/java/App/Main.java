package App;
import Model.Carta;
import Model.Espada;
import Model.Baston;
import Model.Copa;
import Model.Oro;
import Model.Juego;
import Model.Jugador;
import java.util.ArrayList;
public class Main {
    public static void comenzarJuego(Juego juego){
        while(!juego.juegoTerminado()){
            int i = 0;
            if(i % 2 == 0){
                juego.JugarTurno(juego.jugadores.get(0));
            }
            else{
                juego.jugarTurno(juego.jugadores.get(1));
            }
        }
    }
    public static ArrayList<Jugador> crearJugadores(){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Jugador jugador1 = new Jugador("Vuol");
        Jugador jugador2 = new Jugador("Mgjmh");
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        return jugadores;
    }
    public static ArrayList<Carta> crearCartas(){
        ArrayList<Carta> mazo = new ArrayList<Carta>();

        Carta unoEspada = new Espada(1);
        Carta dosEspada = new Espada(2);
        Carta tresEspada = new Espada(3);
        Carta cuatroEspada = new Espada(4);
        Carta cincoEspada = new Espada(5);
        Carta seisEspada = new Espada(6);
        Carta sieteEspada = new Espada(7);
        Carta diezEspada = new Espada(10);
        Carta onceEspada = new Espada(11);
        Carta doceEspada = new Espada(12);

        Carta unoBasto = new Baston(1);
        Carta dosBasto = new Baston(2);
        Carta tresBasto = new Baston(3);
        Carta cuatroBasto = new Baston(4);
        Carta cincoBasto = new Baston(5);
        Carta seisBasto = new Baston(6);
        Carta sieteBasto = new Baston(7);
        Carta diezBasto = new Baston(10);
        Carta onceBasto = new Baston(11);
        Carta doceBasto = new Baston(12);

        Carta unoCopa = new Copa(1);
        Carta dosCopa = new Copa(2);
        Carta tresCopa = new Copa(3);
        Carta cuatroCopa = new Copa(4);
        Carta cincoCopa = new Copa(5);
        Carta seisCopa = new Copa(6);
        Carta sieteCopa = new Copa(7);
        Carta diezCopa = new Copa(10);
        Carta onceCopa = new Copa(11);
        Carta doceCopa = new Copa(12);

        Carta unoOro = new Oro(1);
        Carta dosOro = new Oro(2);
        Carta tresOro = new Oro(3);
        Carta cuatroOro = new Oro(4);
        Carta cincoOro = new Oro(5);
        Carta seisOro = new Oro(6);
        Carta sieteOro = new Oro(7);
        Carta diezOro = new Oro(10);
        Carta onceOro = new Oro(11);
        Carta doceOro = new Oro(12);

        mazo.add(unoEspada);
        mazo.add(dosEspada);
        mazo.add(tresEspada);
        mazo.add(cuatroEspada);
        mazo.add(cincoEspada);
        mazo.add(seisEspada);
        mazo.add(sieteEspada);
        mazo.add(diezEspada);
        mazo.add(onceEspada);
        mazo.add(doceEspada);

        mazo.add(unoBasto);
        mazo.add(dosBasto);
        mazo.add(tresBasto);
        mazo.add(cuatroBasto);
        mazo.add(cincoBasto);
        mazo.add(seisBasto);
        mazo.add(sieteBasto);
        mazo.add(diezBasto);
        mazo.add(onceBasto);
        mazo.add(doceBasto);

        mazo.add(unoCopa);
        mazo.add(dosCopa);
        mazo.add(tresCopa);
        mazo.add(cuatroCopa);
        mazo.add(cincoCopa);
        mazo.add(seisCopa);
        mazo.add(sieteCopa);
        mazo.add(diezCopa);
        mazo.add(onceCopa);
        mazo.add(doceCopa);

        mazo.add(unoOro);
        mazo.add(dosOro);
        mazo.add(tresOro);
        mazo.add(cuatroOro);
        mazo.add(cincoOro);
        mazo.add(seisOro);
        mazo.add(sieteOro);
        mazo.add(diezOro);
        mazo.add(onceOro);
        mazo.add(doceOro);

        return mazo;
    }
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = crearJugadores();
        ArrayList<Carta> cartas = crearCartas();
        Juego juego = new Juego(jugadores,cartas);
        comenzarJuego(juego);
    }
}