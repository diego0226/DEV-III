package PracticasGuiadas.practica3.AbstractFactory;

import PracticasGuiadas.practica3.AbstractFactory.Fabricas.GameBoyItemFactory;
import PracticasGuiadas.practica3.AbstractFactory.Fabricas.NintendoDSItemFactory;
import PracticasGuiadas.practica3.AbstractFactory.GameBoy.GameBoyMoneda;
import PracticasGuiadas.practica3.AbstractFactory.GameBoy.GameboyBloqueInterrogante;
import PracticasGuiadas.practica3.AbstractFactory.Nintendo.NintendoDSBloqueInterrogante;
import PracticasGuiadas.practica3.AbstractFactory.Nintendo.NintendoDSMoneda;

public class Main {
    public static void main(String[] args) {
        NintendoDSItemFactory nintendoFactory = new NintendoDSItemFactory();
        GameBoyItemFactory gameBoyFactory = new GameBoyItemFactory();

        NintendoDSMoneda nintendoMoneda = nintendoFactory.createMoneda(10);
        NintendoDSBloqueInterrogante bloqueNintendo = nintendoFactory.createBloqueInterrogante("Nintendo");
        System.out.println("<<< Nintendo >>>");
        System.out.println("Moneda de nintendo: " + nintendoMoneda);
        System.out.println("Bloque de nintendo: " + bloqueNintendo);

        GameBoyMoneda gameBoyMoneda = gameBoyFactory.createMoneda(5);
        GameboyBloqueInterrogante bloqueGameBoy = gameBoyFactory.createBloqueInterrogante("GameBoy");
        System.out.println("<<< GameBoy >>>");
        System.out.println("Moneda de gameBoy: " + gameBoyMoneda);
        System.out.println("Bloque de gameBoy: " + bloqueGameBoy);
    }
    
}
