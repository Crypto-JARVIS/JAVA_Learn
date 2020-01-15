import java.util.*;
class Box
{
    double width;
    double height;
    double depth;

    Box(double width,double height,double depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        return width*height*depth;
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox1 = new Box(10,20,20);

        double vol;

        Scanner v = new Scanner(System.in);

        System.out.print("Enter the Width : ");
        double w = v.nextDouble();
        System.out.print("Enter the Height : ");
        double h = v.nextDouble();
        System.out.print("Enter the Depth : ");
        double d = v.nextDouble();

        Box mybox2 = new Box(w,d,h);

        v.close();
        
        vol = mybox1.volume();
        System.out.println("Volume is : "+ vol);

        vol = mybox2.volume();
        System.out.println("Volume is : "+ vol);
    }
}