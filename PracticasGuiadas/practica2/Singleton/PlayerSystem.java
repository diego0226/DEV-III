package PracticasGuiadas.practica2.Singleton;

public class PlayerSystem {
    private GameConfig config;

    public PlayerSystem(){
        config = GameConfig.getInstance();
    }

    public void show(){
        System.out.println("Player lives: " + config.getLives());
    }
    
}
