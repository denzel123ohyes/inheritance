public abstract class Account 
{
    public abstract int calculateInterest(int rate);

    private String accNo;
    private int balance;

    public Account()
    {}

    public Account(String no, int bal)
    {
        setAccNo(no);
        setBalance(bal);
    }

    public void setAccNo(String no)
    {
        accNo = no;
    }

    public String getAccNo()
    {
        return accNo;
    }

    public void setBalance(int bal)
    {
        this.balance = bal;
    }

    public int getBalance()
    {
        return balance;
    }

    public String toString()
    {
        return "Account Number: " +getAccNo()+ " has a balance of " +getBalance();
    }
}
