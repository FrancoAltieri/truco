package Model;

public class administradorPuntos {
    private int puntajeTeamUno;
    private int puntajeTeamDos;
    private int puntajeMaximo;

    public void setPuntajeTeamUno(int valor){
        this.puntajeTeamUno = valor;
    }
    public void setPUntajeTeamDos(int valor){
        this.puntajeTeamDos = valor;
    }
    public int getPuntajeTeamUno(){
        return this.puntajeTeamUno;
    }
    public int getPuntajeTeamDos(){
        return this.puntajeTeamDos;
    }

    public boolean hayGanador(){
        return (this.puntajeTeamUno >=puntajeMaximo || this.puntajeTeamDos >= puntajeMaximo);
    }

}
