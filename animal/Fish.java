package animal;

public class Fish extends Animal
{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name,int size,int weight,int gills,int eyes,int fins)
    {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public int getGills()
    {
        return gills;
    }
    public int getEyes()
    {
        return eyes;
    }
    public int getFins()
    {
        return fins;
    }

    public void rest()
    {
        System.out.println("fish in rest");
    }
    private void moveMuscle()
    {
        System.out.println("muscle move");
    }
    private void moveBackFin()
    {
        System.out.println("backfin moved");
    }
    public void swim(int speed)
    {
        moveMuscle();
        moveBackFin();
        super.move(speed);
    }
}