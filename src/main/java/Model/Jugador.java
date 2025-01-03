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
    public String getNombre(){
        return this.nombre;
    }
    public Carta usarCarta(int posicionCarta){
        return cartas.remove(posicionCarta - 1);
    }
    public int cantidadCartas(){
        return this.cartas.size();
    }
    public Carta obtenerCarta(int posicionCarta){
        return this.cartas.get(posicionCarta);
    }
    public void agregarCarta(Carta carta){
        this.cartas.add(carta);
    }
}
