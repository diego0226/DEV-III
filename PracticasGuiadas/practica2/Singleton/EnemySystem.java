package PracticasGuiadas.practica2.Singleton;

public class EnemySystem {
    private GameConfig config;
    public EnemySystem(){
        config = GameConfig.getInstance();
    }

    public void show(){
        System.out.println("Enemy speed: " + config.getEnemySpeed());
    }
    
}
