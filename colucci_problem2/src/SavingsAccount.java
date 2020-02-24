public class SavingsAccount {
	 //variable annual interest rate
    static private double annualInterestRate;
    private double savingBalance;

    //constructor method
    public SavingsAccount()
    {
        this.savingBalance=0;
    }
    //Constructor method
    public SavingsAccount(double savingBalance)
    {
            this.savingBalance=savingBalance;
    }
    //saving balance
    public double getSavingBalance()
    {
            return this.savingBalance;
    }
    public double[] getMonthsSavingBalance(int total_months)
    {
              double[] monthlyI_month=new double[total_months];
            double monthlyI;
            for(int i=0;i<total_months;i++)
            {
               monthlyI= (double)(this.savingBalance*annualInterestRate/12);
               this.savingBalance+=monthlyI;
               monthlyI_month[i]=this.savingBalance;
           }
            return monthlyI_month;
    }
    // Modify interest rate
    public static void modifyInterestRate(double newInterestRate)
    {
            annualInterestRate=newInterestRate;
    }
    //calculate monthly interest
    public void calculateMonthlyInterest()
    {
            double monthlyI;
            monthlyI= (double)(this.savingBalance*annualInterestRate/12);
            this.savingBalance+=monthlyI;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
