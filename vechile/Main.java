package vechile;

public class Main
{
    public static void main(String[] args)
    {
        Lambo lambo = new Lambo(36);
        
        lambo.accelerate(30);
        lambo.steer(45);
        lambo.accelerate(20);
        lambo.accelerate(-42);
        System.out.println(lambo.getisManual());
    }
}