package computer;

public class Case
{
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersupply, Dimensions dimensions)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void presspowerbutton()
    {
        System.out.println("Power Button Pressed");
    }

    public String getModel()
    {
        return model;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getPowerSupply()
    {
        return powersupply;
    }
    public Dimensions getDimensions()
    {
        return dimensions;
    }
}