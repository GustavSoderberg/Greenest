package ViewModel;

import Model.*;
import View.PlantHotelView;

public class PlantHotelViewModel
{
    private final PlantHotelView view;

    // Constructor that receives an instance of PlantHotelView
    public PlantHotelViewModel(PlantHotelView view)
    {
        this.view = view;
    }

    // Method to process plant selection
    public void processPlantSelection()
    {
        String plantName = view.promptUserForPlantName(); // Prompt user for the plant name

        Plant plant = getPlantByName(plantName); // Get the plant object based on the provided name
        if (plant != null)
        {
            double requirement = plant.calculateLiquidRequirement(); // Calculate the liquid requirement for the plant
            LiquidType liquidType = plant.getPreferredLiquid(); // Get the preferred liquid type for the plant

            // Prepare the message to display the liquid requirement for the plant
            String message = "The plant " + plant.getName() + " should receive " + requirement + " liters of " + liquidType.toString();
            view.displayLiquidRequirement(message); // Display the liquid requirement message
        } else
        {
            view.displayError("Plant not found!"); // Display an error message if the plant is not found
        }
    }

    // Method to get a plant by its name
    private Plant getPlantByName(String name)
    {
        return switch (name.toLowerCase())
        {
            case "igge" -> new Cactus("Igge", 0.2); // Create a Cactus plant named Igge with a specific liquid requirement
            case "laura" -> new PalmTree("Laura", 5.0); // Create a PalmTree plant named Laura with a specific liquid requirement
            case "meatloaf" -> new CarnivorousPlant("Meatloaf", 0.7); // Create a CarnivorousPlant named Meatloaf with a specific liquid requirement
            case "olof" -> new PalmTree("Olof", 1.0); // Create a PalmTree plant named Olof with a specific liquid requirement

            case "alex" -> new PremiumCactus("Alex", 1.0, "gold"); // Create a PremiumCactus plant named Alex
            default -> null; // Return null if the plant name is not found
        };
    }
}
