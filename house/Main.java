package house;

public class Main
{
    public static void main(String[] args)
    {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");
        Celling celling = new Celling(12,"Red");
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", true, 75);
        Bedroom bedroom = new Bedroom("JV's Room",wall1, wall2, wall3, wall4, celling, bed, lamp);

        bedroom.getname();
        bedroom.makeBed();
        bedroom.getLamp().turnon();
        System.out.println(bedroom.getWall1().getDirection());
        System.out.println(bedroom.getCelling().getHeight());
    }
}