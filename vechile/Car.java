package vechile;

public class Car extends Vechile
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) 
    {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int gears) 
    {
        this.gears = gears;
        System.out.println("Car.set.currentgear changed to "+this.gears+" gear.");
    }
    
    public void changeVelocity(int speed,int direction)
    {
        System.out.println("car.changeVelocity velocity "+speed+" direction "+direction);
        move(speed, direction);
    }

    public int getWheels() {
        return wheels;
    }
    public int getDoors() {
        return doors;
    }
    public boolean getisManual() {
        return isManual;
    }
    public int getCurrentGear() {
        return currentGear;
    }
}