package GoF.Strategy.Game;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("나이프 공격");
    }
}
