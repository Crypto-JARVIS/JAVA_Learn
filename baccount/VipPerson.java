package baccount;
public class VipPerson
{
    private String name;
    private double credit_limit;
    private String emailad;

    public VipPerson()
    {
        this("Default name", 50000.00, "default@email.com");
    }

    public VipPerson(String name, double credit_limit)
    {
        this(name, credit_limit, "unknown@gmail.com");
    }

    public VipPerson(String name, double credit_limit, String emailad)
    {
        this.name = name;
        this.credit_limit = credit_limit;
        this.emailad = emailad;
    }

    public String getName()
    {
        return name;
    }

    public double getCredit_Limit()
    {
        return credit_limit;
    }

    public String getEmailad()
    {
        return emailad;
    }
}