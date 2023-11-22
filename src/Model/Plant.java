package Model;

// Plant interface representing a plant in the hotel
public interface Plant
{
    double calculateLiquidRequirement();
    LiquidType getPreferredLiquid();
    String getName();
}
