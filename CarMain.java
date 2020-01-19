class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car-> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public boolean getEngine()
    {
        return engine;
    }
    public int getWheels()
    {
        return wheels;
    }
}

class Lamborghini extends Car 
{
    public Lamborghini(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String accelerate()
    {
        return "Lamborghini -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "Lamborghini -> brake()";
    }

    @Override
    public String startEngine()
    {
        return "Lamborghini -> startEngine()";
    }
}

class Ferrari extends Car 
{
    public Ferrari(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String accelerate()
    {
        return "Ferrari -> accelerate()";
    }

    @Override
    public String brake()
    {
        return "Ferrari -> brake()";
    }

    @Override
    public String startEngine()
    {
        return "Ferrari -> startEngine()";
    }
}

class AstonMartin extends Car 
{
    public AstonMartin(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String accelerate()
    {
        return getClass().getSimpleName()+" -> accelerate()";
    }

    @Override
    public String brake()
    {
        return getClass().getSimpleName()+" -> brake()";
    }

    @Override
    public String startEngine()
    {
        return getClass().getSimpleName()+" -> startEngine()";
    }
}



public class CarMain
{
    public static void main(String[] args)
    {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Lamborghini lambo = new Lamborghini(8, "Aventadoor");
        System.out.println(lambo.startEngine());
        System.out.println(lambo.accelerate());
        System.out.println(lambo.brake());

        Ferrari ferro = new Ferrari(8, "ferro");
        System.out.println(ferro.startEngine());
        System.out.println(ferro.accelerate());
        System.out.println(ferro.brake());

        AstonMartin Asto = new AstonMartin(8, "AM");
        System.out.println(Asto.startEngine());
        System.out.println(Asto.accelerate());
        System.out.println(Asto.brake());
    }
}   