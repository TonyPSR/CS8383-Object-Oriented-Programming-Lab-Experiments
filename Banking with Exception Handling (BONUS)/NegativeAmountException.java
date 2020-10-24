package tonypsr;

public class NegativeAmountException extends Exception{
    private double amount;
    NegativeAmountException(double x)
    {
        amount =x;
    }
    public String toString()
    {
        return"NegativeAmountException: " + amount + " < 0";
    }
}
