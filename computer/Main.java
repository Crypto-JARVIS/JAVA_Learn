package computer;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case thecase = new Case("22B","Dell","650w",dimensions);
        Monitor themonitor = new Monitor("27iB", "Acer", 27, new Resolution(1920,1080));
        Motherboard themotherboard = new Motherboard("Atx-120", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(thecase, themonitor, themotherboard);

        thePC.getMonitor().drawpixelat(1500, 1200, "red");
        thePC.getMotherboard().loadprogram("Windows 10");
        thePC.getTheCase().presspowerbutton();
    }
}