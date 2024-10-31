package Model;

public abstract class Carta {
    private int valor;
    public Carta(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return this.valor;
    }
    public abstract String tipoCarta();
}
