package computer;

public class Monitor
{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeresolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeresolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeresolution = nativeresolution;
    }

    public void drawpixelat(int x,int y,String color)
    {
        System.out.println("Drawing pixel at "+x+" , "+y+" in color "+color);
    }

    public String getModel()
    {
        return model;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public int getSize()
    {
        return size;
    }
    public Resolution getNativeResolution()
    {
        return nativeresolution;
    }
}