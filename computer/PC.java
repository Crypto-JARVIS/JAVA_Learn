package computer;

public class PC
{
    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard)
    {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerup()
    {
        thecase.presspowerbutton();
        drawlogo();
    }
    public void drawlogo()
    {
        monitor.drawpixelat(1200, 50, "red");
    }
}