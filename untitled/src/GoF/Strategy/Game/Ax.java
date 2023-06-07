package GoF.Strategy.Game;

public class Ax implements Weapon {
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
