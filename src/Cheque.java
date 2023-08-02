public class Cheque extends Account
{
    private int overdraftLimit;

    public Cheque()
    {}

    public Cheque(String no, int bal, int lim)
    {
        super(no, bal);
        setOverdraftLim(lim);
    }

    public void setOverdraftLim(int lim)
    {
        overdraftLimit = lim;
    }

    public int getOverdraftLimit()
    {
        return overdraftLimit;
    }

    public int calculateInterest(int rate)
    {
        if (getBalance() < getOverdraftLimit())
            return getBalance()*4*rate/100;
        if (getBalance() < 0)
            return getBalance()*2*rate/100;
        return getBalance()*rate/100;         
    }

    public String toString()
    {
        return super.toString() +" and an overdraft limit of " +getOverdraftLimit();
    }
    public static void main(String[] args)
    {
        Cheque c1 = new Cheque("123-557-473", -1000,-50000);
        System.out.println(c1);
    }
}
