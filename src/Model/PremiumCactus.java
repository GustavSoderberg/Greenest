package Model;

import javax.swing.*;

// Cactus class implementing Plant interface for cacti
public class PremiumCactus extends Cactus
{

    String color;

    public PremiumCactus(String name, double height, String color) {
        super(name, height);

        this.color = color;
    }

    public void say() {

        String message = "Don't forget that I am " + this.getName() + ", a premium Cactus made out of " + this.color;
        JOptionPane.showMessageDialog(null, message, "I am made out of" + this.color, JOptionPane.INFORMATION_MESSAGE);

    }

}
