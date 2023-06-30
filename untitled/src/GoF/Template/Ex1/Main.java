package GoF.Template.Ex1;

import GoF.Template.Ex1.dp.AbstGameConnectHelper;
import GoF.Template.Ex1.dp.DefaultGameConnectHelper;

public class Main {
    public static void main(String[] args) {
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();

        helper.requestConnection("아이디 암호 등 접속 정보");


    }
}
