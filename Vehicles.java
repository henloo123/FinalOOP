public abstract class Vehicles
{
    private String color;
    private String plateNumber;
    private int numberOfSeats;
    private String model;
    private boolean isAvailable;
    private boolean isAutomatic;

    public Vehicles()
    {
        
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setPlateNumber(String plateNumber)
    {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber()
    {
        return this.plateNumber;
    }

    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return this.model;
    }

    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }

    public boolean getIsAvailable()
    {
        return this.isAvailable;
    }

    public void setIsAutomatic(boolean isAutomatic)
    {
        this.isAutomatic = isAutomatic;
    }

    public boolean getIsAutomatic()
    {
        return this.isAutomatic;
    }

    public abstract void editVehicleInfo();

    @Override
    public String toString()
    {
        return "Color: " + getColor() + "\nPlate Number: " + getPlateNumber() + "\nModel: " + getModel() + "\nis Available: " + getIsAvailable() + "\nis Automatic: " + getIsAutomatic();
    }
}
