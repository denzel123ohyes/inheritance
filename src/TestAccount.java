public class TestAccount 
{
    public static void main(String[] args)
    {
        Account accS1 = new Savings("123-456-789", 500, 450);
        Account accC1 = new Cheque("987-654-321", -500, -10000);
        System.out.println("accS1: " +accS1);
        System.out.println("The interest for " +accS1.getAccNo()+ "is: " +accS1.calculateInterest(10));
        System.out.println("The interest for " +accC1.getAccNo()+ "is: " +accC1.calculateInterest(10));

    }
}
