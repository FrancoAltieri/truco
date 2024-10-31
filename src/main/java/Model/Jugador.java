package Model;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Carta> cartas;
    private int puntaje;
    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntaje = 0;
        this.cartas = new ArrayList<Carta>();
    }
    public void usarCarta(int posicionCarta){
        cartas.remove(cartas.get(posicionCarta));
    }
    public int cantidadCartas(){
        return this.cartas.size();
    }
    public Carta obtenerCarta(int posicionCarta){
        return this.cartas.get(posicionCarta);
    }
    public boolean envidoHabilitado(){
        Carta carta1 = this.obtenerCarta(0);
        Carta carta2 = this.obtenerCarta(1);
        Carta carta3 = this.obtenerCarta(2);
        boolean habilitado = false;
        if(carta1.tipoCarta() == carta2.tipoCarta() || carta1.tipoCarta() == carta3.tipoCarta() || carta2.tipoCarta() == carta3.tipoCarta())
            habilitado = true;
        return habilitado;
    }

}
