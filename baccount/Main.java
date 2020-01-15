package baccount;
public class Main
{
    public static void main(String args[])
    {
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("BOB",25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100, "tim12@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailad());

        Account BOB = new Account();
        System.out.println(BOB.getAccount_Number());
        System.out.println(BOB.getBalance());

        BOB.withdrawl(100.0);

        BOB.deposit(50.0);
        BOB.withdrawl(100.0);

        BOB.deposit(51.0);
        BOB.withdrawl(100.0);

        Account Tim = new Account("Tim", "tim@email.com", "12345");
        System.out.println("Account Number : "+ Tim.getAccount_Number()+ " , Name : "+ Tim.getCustomer_Name()+ " , Email : "+ Tim.getEmail()+ " , Phone : "+ Tim.getPhone_No()+ " , Balance : "+ Tim.getBalance());

    }
}