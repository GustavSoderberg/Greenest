package Model;

// CarnivorousPlant class implementing Plant interface for carnivorous plants
public class CarnivorousPlant implements Plant
{
    private final String name;
    private final double height;

    // Constructor for CarnivorousPlant
    public CarnivorousPlant(String name, double height)
    {
        this.name = name;
        this.height = height;
    }

    // Calculate liquid requirement for carnivorous plants
    @Override
    public double calculateLiquidRequirement()
    {
        return 0.1 + (0.2 * height); // Calculation for protein drink requirement based on height
    }

    // Retrieve preferred liquid type for carnivorous plants
    @Override
    public LiquidType getPreferredLiquid()
    {
        return LiquidType.PROTEIN_DRINK;
    }

    // Get the name of the carnivorous plant
    @Override
    public String getName()
    {
        return name;
    }
}
