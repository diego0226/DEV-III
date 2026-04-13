package PracticasGuiadas.practica2.Singleton;

public class Main {
    public static void main(String[] args) {
        GameConfig config = GameConfig.getInstance();
        config.setDificulty("medium");
        config.setEnemySpeed(5);
        config.setLives(3);
        

        EnemySystem enemy = new EnemySystem();
        PlayerSystem player = new PlayerSystem();

        enemy.show();
        player.show();
        System.out.println(config.toString());
    }
}
