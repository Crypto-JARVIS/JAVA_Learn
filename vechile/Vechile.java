package vechile;

public class Vechile
{
    private String name;
    private String size;
    private int currentvelocity;
    private int curentdirection;

    public Vechile(String name,String size)
    {
        this.name = name;
        this.size = size;
        this.currentvelocity = 0;
        this.curentdirection = 0;
    }

    public void steer(int direction)
    {
        this.curentdirection = direction;
        System.out.println("Vechile.steer() Steering at "+curentdirection+" degrees"); 
    }
    public void move(int velocity,int direction)
    {
        this.currentvelocity = velocity;
        this.curentdirection = direction;
        System.out.println("Vechile.move() Moving at "+currentvelocity+" in direction "+curentdirection);
    }

    public String getName()
    {
        return name;
    }
    public String getSize()
    {
        return size;
    }
    public int getCurrentVelocity()
    {
        return currentvelocity;
    }
    public int getCurrentDirection()
    {
        return curentdirection;
    }

    public void stop()
    {
        this.currentvelocity = 0;
    }
}