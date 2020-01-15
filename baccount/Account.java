package baccount;
public class Account
{
    private String account_number;
    private double balance;
    private String customer_name;
    private String email;
    private String phone_no;

    public Account()
    {
        this("56789", 2.50, "Default name", "Default email", "Default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String account_number, double balance, String customer_name, String email, String phone_no)
    {
        this.account_number = account_number;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_no = phone_no;
    }

    public Account(String customer_name, String email, String phone_no)
    {
        this("9999", 100.55, customer_name, email, phone_no);
    }

    public void deposit(double damt)
    {
        this.balance += damt;
        System.out.println("Deposite of "+damt + "made. New amount is "+this.balance);
    }

    public void withdrawl(double wtd)
    {
        if(this.balance - wtd < 0)
        {
            System.out.println("Only "+this.balance +" available. Withdrawl not processed");
        }
        else
        {
            this.balance -= wtd;
            System.out.println("Withdrawl of "+wtd +" processed. Remaining balance is "+this.balance);
        }
    }

    public String getAccount_Number()
    {
        return account_number;
    }
    public void setAccount_Number(String account_number)
    {
        this.account_number = account_number;
    }

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getCustomer_Name()
    {
        return customer_name;
    }
    public void setCustomer_Numer(String customer_name)
    {
        this.customer_name = customer_name;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone_No()
    {
        return phone_no;
    }
    public void setPhone_No(String phone_no)
    {
        this.phone_no = phone_no;
    }
}