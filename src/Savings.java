import javax.swing.text.html.MinimalHTMLWriter;

public class Savings extends Account
{
    private int minBalance;

    public Savings()
    {}

    public Savings(String no, int bal, int minBal)
    {
        super(no, bal);
        setMinBalance(minBal);
    }

    public void setMinBalance(int minBal)
    {
        minBalance = minBal;
    }

    public int getMinBalance()
    {
        return minBalance;
    }

    public int calculateInterest(int rate)
    {
        if(getBalance() < getMinBalance())
            return 0;
        return getBalance()*rate/100;    
    }

    public String toString()
    {
        return super.toString() + " and a minimum balance of " +getMinBalance();
    }

    public static void main(String[] args)
    {
        Savings s1 = new Savings("555-0155", 100000, 5000);
        System.out.println(s1);
    }
}
