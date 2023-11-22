package View;

import ViewModel.PlantHotelViewModel;
import javax.swing.JOptionPane;

public class PlantHotelView
{
    public static void main(String[] args)
    {
        PlantHotelView view = new PlantHotelView(); // Create an instance of the PlantHotelView
        PlantHotelViewModel viewModel = new PlantHotelViewModel(view); // Create an instance of the PlantHotelViewModel

        viewModel.processPlantSelection(); // Start the method for plant selection
    }

    // Method to prompt the user for the plant name
    public String promptUserForPlantName()
    {
        return JOptionPane.showInputDialog(null, "Which plant should get liquid?", "Plant Selection", JOptionPane.QUESTION_MESSAGE);
    }

    // Method to display the liquid requirement message
    public void displayLiquidRequirement(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Liquid Requirement", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to display an error message
    public void displayError(String errorMessage)
    {
        JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
