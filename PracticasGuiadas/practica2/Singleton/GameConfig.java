package PracticasGuiadas.practica2.Singleton;

public class GameConfig {
    private String dificulty;
    private int lives;
    private int enemySpeed;
    private static GameConfig instance;

    private GameConfig(){
        dificulty = "easy";
        lives = 5;
        enemySpeed = 1;
    }

    public static GameConfig getInstance(){
        if (instance == null) {
            instance = new GameConfig();
        }

        return instance;
    }

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getEnemySpeed() {
        return enemySpeed;
    }

    public void setEnemySpeed(int enemySpeed) {
        this.enemySpeed = enemySpeed;
    }

    @Override
    public String toString() {
        return "GameConfig [dificulty=" + dificulty + ", lives=" + lives + ", enemySpeed=" + enemySpeed + "]";
    }
}
