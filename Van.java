public class Van extends Vehicles
{
    private final double RATE = 2500;
    private final double EXCESS = 500;

    public Van ()
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
        stringBuilder.append("Vehicle Type: Van");
        stringBuilder.append("\nRate: ");
        stringBuilder.append(RATE);
        stringBuilder.append("\nExcess: ");
        stringBuilder.append(EXCESS);
        stringBuilder.append("\n");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }
}
