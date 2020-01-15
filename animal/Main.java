package animal;

public class Main
{
    public static void main(String args[])
    {
        Animal animal = new Animal("Animal",1,1,5,5);
        animal.getBody();

        Dog dog = new Dog("Jack", 8, 20, 2, 4, 1, 20, "Long Silky");
        dog.eat();
        dog.walk();
        dog.run();
        

        Fish fish = new Fish("Goldy", 2, 10, 10, 2, 3);
        fish.swim(10);
        fish.rest();
    }
}