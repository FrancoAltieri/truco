package Model;

public class Carta {
    private int valor;
    private String palo;
    public Carta(int valor,String tipoCarta){
        this.valor = valor;
        this.palo = tipoCarta;
    }
    public int getValor(){
        return this.valor;
    }
    public boolean tieneMismoPalo(Carta carta){
        return this.palo.equals(carta.palo);
    }
    public String getTipoCarta(){
        return this.palo;
    }
    void mostrarCarta(int numeroCarta){
        System.out.println("carta " + numeroCarta + ": " + this.valor + " de " + this.palo);
    }
/*
    * Calcula que carta es mejor que la otra
    * Si la carta del equipo Uno es mejor que la del equipo Dos retorna 1
    * Si la carta del equipo Dos es mejor que la del equipo Uno retorna -1
    * Si hay empate entonces retorna 0
 */
    public int esMejorCarta(Carta uno,Carta dos){
        int puntajeCartaUno = uno.calcularPuntaje();
        int puntajeCartaDos = dos.calcularPuntaje();
        if(puntajeCartaUno > puntajeCartaDos){
            return 1;
        }
        else if(puntajeCartaDos > puntajeCartaUno){
            return -1;
        }
        else return 0;
    }
    /*
        * Calcula el puntaje de una Carta atraves de un sistema Jerarquico(quizas usar una variable que posea al jerarquia al crear la carta sea mejor)
     */
    public int calcularPuntaje(){
        switch(this.valor){
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                if(this.palo.equals("Basto") || this.palo.equals("Copa")){
                    return 3;
                }
                else if(this.palo.equals("Oro")){
                    return 10;
                }
                else{
                    return 11;
                }
            case 10:
                return 4;
            case 11:
                return 5;
            case 12:
                return 6;
            case 1:
                if(this.palo.equals("Oro") || this.palo.equals("Copa")){
                    return 7;
                }
                else if(this.palo.equals("Basto")){
                    return 12;
                }
                else{
                    return 13;
                }
            case 2:
                return 8;
            case 3:
                return 9;
        }
        return -1;
    }
}
