package PruebasJugador;
import Model.Carta;
import Model.Jugador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test01 {
    @Test
    void CreoUnJugadorSatisfactoriamente(){
        Jugador jugador = new Jugador("Vuol");
        assertEquals(jugador.getNombre(),"Vuol");
    }
    @Test
    void prueboJugadorConTresCartas(){
        Carta carta1 = new Carta(5,"Espada");
        Carta carta2 = new Carta(1,"Basto");
        Carta carta3 = new Carta(6,"Copa");
        Jugador jugador = new Jugador("Vuol");
        jugador.agregarCarta(carta1);
        jugador.agregarCarta(carta2);
        jugador.agregarCarta(carta3);
        assertEquals(jugador.cantidadCartas(),3);
    }
    @Test
    void prueboJugadorConTresCartasYEliminoUna(){
        Carta carta1 = new Carta(5,"Espada");
        Carta carta2 = new Carta(1,"Basto");
        Carta carta3 = new Carta(6,"Copa");
        Jugador jugador = new Jugador("Vuol");
        jugador.agregarCarta(carta1);
        jugador.agregarCarta(carta2);
        jugador.agregarCarta(carta3);
        jugador.usarCarta(2);
        assertEquals(jugador.cantidadCartas(),2);
    }
}
