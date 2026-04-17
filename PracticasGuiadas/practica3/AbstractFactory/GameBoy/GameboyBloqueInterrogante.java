package PracticasGuiadas.practica3.AbstractFactory.GameBoy;

import PracticasGuiadas.practica3.AbstractFactory.BloqueInterrogante;

public class GameboyBloqueInterrogante extends BloqueInterrogante{

    public GameboyBloqueInterrogante(String valor) {
        super(valor);
    }

    @Override
    public String toString() {
        return "GameboyBloqueInterrogante [" + super.getValor() + "]";
    }

    
    
}
