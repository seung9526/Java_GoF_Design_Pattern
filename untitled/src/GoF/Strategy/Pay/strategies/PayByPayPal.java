package GoF.Strategy.Pay.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("test", "test@test.com");
        DATA_BASE.put("qwer", "qwer@qwer.com");
    }
    @Override
    public void collectPaymentDetails() {
        try{
            while (!signedIn) {
                System.out.println("Enter the user's email : ");
                email = READER.readLine();
                System.out.println(" Enter the password : ");
                password = READER.readLine();
                if (verity()) {
                    System.out.println("Data verification has been successful. ");
                } else {
                    System.out.println(" is not email or password!");
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private boolean verity() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if(signedIn){
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }
}
