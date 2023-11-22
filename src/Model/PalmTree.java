package Model;

// PalmTree class implementing Plant interface for palm trees
public class PalmTree implements Plant
{
    private final String name;
    private final double height;

    // Constructor for PalmTree
    public PalmTree(String name, double height)
    {
        this.name = name;
        this.height = height;
    }

    // Calculate liquid requirement for palm trees
    @Override
    public double calculateLiquidRequirement()
    {
        return 0.5 * height; // Calculation for tap water requirement based on height
    }

    // Retrieve preferred liquid type for palm trees
    @Override
    public LiquidType getPreferredLiquid()
    {
        return LiquidType.TAP_WATER;
    }

    // Get the name of the palm tree
    @Override
    public String getName()
    {
        return name;
    }
}
