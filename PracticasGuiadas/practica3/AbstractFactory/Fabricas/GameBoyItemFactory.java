package PracticasGuiadas.practica3.AbstractFactory.Fabricas;

import PracticasGuiadas.practica3.AbstractFactory.GameBoy.GameBoyMoneda;
import PracticasGuiadas.practica3.AbstractFactory.GameBoy.GameboyBloqueInterrogante;

public class GameBoyItemFactory implements AbstractFactory{

    @Override
    public GameBoyMoneda createMoneda(int valor) {
        return new GameBoyMoneda(valor);
    }

    @Override
    public GameboyBloqueInterrogante createBloqueInterrogante(String valor) {
        return new GameboyBloqueInterrogante(valor);
    }
    
}
