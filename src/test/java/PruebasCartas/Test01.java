package PruebasCartas;
import Model.Carta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Test01 {
    @Test
    void prueboCrearCarta(){
        Carta carta = new Carta(10,"Espada");
        assertEquals(carta.getTipoCarta(),"Espada");
    }
}
