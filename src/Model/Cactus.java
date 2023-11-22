package Model;

// Cactus class implementing Plant interface for cacti
public class Cactus implements Plant
{
    private final String name;
    private final double height;

    // Constructor for Cactus
    public Cactus(String name, double height)
    {
        this.name = name;
        this.height = height;
    }

    // Calculate liquid requirement for cacti
    @Override
    public double calculateLiquidRequirement()
    {
        return 0.02; // Cactus mineral water requirement is always 2 cl (0.02 liters)
    }

    // Retrieve preferred liquid type for cacti
    @Override
    public LiquidType getPreferredLiquid()
    {
        return LiquidType.MINERAL_WATER;
    }

    // Get the name of the cactus
    @Override
    public String getName()
    {
        return name;
    }
}
