package animal;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public int getEyes()
    {
        return eyes;
    }
    public int getLegs()
    {
        return legs;
    }
    public int getTail()
    {
        return tail;
    }
    public int getTeeth()
    {
        return teeth;
    }
    public String getCoat()
    {
        return coat;
    }

    public void chew()
    {
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() 
    {
        // TODO Auto-generated method stub
        System.out.println("Dog.eat() method is called");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println("Walk is called");
        super.move(5);
    }
    public void run()
    {
        System.out.println("run is called");
        move(10);
    }

    private void moveLegs(int speed)
    {
        System.out.println("Dog MoveLegs is called");
    }
    @Override
    public void move(int speed) {
        // TODO Auto-generated method stub
        System.out.println("Dog move called");
        moveLegs(speed);
        super.move(speed);
    }
}