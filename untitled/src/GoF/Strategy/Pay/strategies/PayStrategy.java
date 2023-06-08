package GoF.Strategy.Pay.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
