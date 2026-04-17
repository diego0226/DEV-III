package PracticasGuiadas.practica3.AbstractFactory;

public class BloqueInterrogante {
    private String valor;

    public BloqueInterrogante(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "BloqueInterrogante [valor=" + valor + "]";
    }

    
}
