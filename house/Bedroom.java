package house;

public class Bedroom
{
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Celling celling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name,Wall wall1,Wall wall2,Wall wall3,Wall wall4,Celling celling,Bed bed,Lamp lamp)
    {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.celling = celling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public String getname()
    {
        return name;
    }
    public Lamp getLamp()
    {
        return lamp;
    }
    public void makeBed()
    {
        System.out.println("Bedroom -> MakingBed");
        bed.make();
    }
    public Wall getWall1()
    {
        return wall1;
    }
    public Wall getWall2()
    {
        return wall2;
    }
    public Wall getWall3()
    {
        return wall3;
    }
    public Wall getWall4()
    {
        return wall4;
    }
    public Celling getCelling()
    {
        return celling;
    }
}