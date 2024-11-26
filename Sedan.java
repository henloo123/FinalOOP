public class Sedan extends Vehicles
{
    private final double RATE = 1800;
    private final double EXCESS = 200;

    public Sedan ()
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
        stringBuilder.append("Vehicle Type: Sedan");
        stringBuilder.append("\nRate: ");
        stringBuilder.append(RATE);
        stringBuilder.append("\nExcess: ");
        stringBuilder.append(EXCESS);
        stringBuilder.append("\n");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
