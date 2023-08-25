import javax.swing.*;
import java.awt.*;
public class GridBagLayoutExample  {
 public static void main(String[] args) {
 // Create a JFrame
 JFrame frame = new JFrame("GridBag Layout Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(400, 300);
 // Create a JPanel with GridBagLayout
 JPanel panel = new JPanel();
 GridBagLayout gridBagLayout = new GridBagLayout();
 panel.setLayout(gridBagLayout);
 // Create GridBagConstraints for layout configuration
 GridBagConstraints constraints = new GridBagConstraints();
 // Create and add components with GridBagConstraints
 JButton button1 = new JButton("Button 1");
 constraints.gridx = 0; // Column 0
 constraints.gridy = 0; // Row 0
 panel.add(button1, constraints);
 JButton button2 = new JButton("Button 2");
 constraints.gridx = 1; // Column 1
 constraints.gridy = 0; // Row 0
 panel.add(button2, constraints);
 JButton button3 = new JButton("Button 3");
 constraints.gridx = 0; // Column 0
 constraints.gridy = 1; // Row 1
 constraints.gridwidth = 2; // Span 2 columns
 panel.add(button3, constraints);
 // Add the panel to the frame
 frame.add(panel);
 // Display the frame
 frame.setVisible(true);
 }
}
