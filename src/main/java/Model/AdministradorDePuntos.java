package Model;

public class AdministradorDePuntos {
    private Equipo equipoUno;
    private Equipo equipoDos;
    private int puntajeMaximo;

    public AdministradorDePuntos(int puntaje,Equipo uno,Equipo dos){
        this.puntajeMaximo = puntaje;
        this.equipoUno = uno;
        this.equipoDos = dos;
    }
    public void sumarPuntos(int puntos,Equipo equipo){
        equipo.sumarPuntaje(puntos);
    }
    public boolean hayGanador(){
        return (this.equipoUno.tienePuntajeMaximo(puntajeMaximo) || this.equipoDos.tienePuntajeMaximo(puntajeMaximo));
    }
    public Equipo determinarGanador(){
        if(equipoUno.tienePuntajeMaximo(puntajeMaximo)){
            return equipoUno;
        }
        else if(equipoDos.tienePuntajeMaximo(puntajeMaximo)){
            return equipoDos;
        }
        return null;
    }
}
