public class MiniVan extends Vehicles
{
    private final double RATE = 2000;
    private final double EXCESS = 300;

    public MiniVan ()
    {

    }

    public double getRate()
    {
        return this.RATE;
    }

    public double getExcess()
    {
        return this.EXCESS;
    }

    @Override
    public void editVehicleInfo()
    {

    }

    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vehicle Type: Mini Van");
        stringBuilder.append("\nRate: ");
        stringBuilder.append(RATE);
        stringBuilder.append("\nExcess: ");
        stringBuilder.append(EXCESS);
        stringBuilder.append("\n");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
