package tonypsr;

public class InsufficientBalanceException extends Exception {
    private double amount, balance;
    InsufficientBalanceException(double x, double y)
    {
        balance = x;
        amount =y;
    }
    public String toString()
    {
        return"InsufficientBalanceException: " + balance +" < " + amount;
    }
}
