package GoF.Strategy;

import GoF.Strategy.Game.Ax;
import GoF.Strategy.Game.GameCharacter;
import GoF.Strategy.Game.Knife;
import GoF.Strategy.Game.Sword;

public class Main {
    public static void main(String[] args) {
        Ainterface ainterface = new AinterfaceImpl();

        // 통로
        //ainterface.funcA();

        //AObj aObj = new AObj();
        //aObj.funcAA();

        GameCharacter character = new GameCharacter();
        character.attack();

        character.setWeapon(new Knife());
        character.attack();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }
}
