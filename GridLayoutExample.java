import javax.swing.*;
import java.awt.*;
public class GridLayoutExample {
 public static void main(String[] args) {
 // Create a JFrame
 JFrame frame = new JFrame("Grid Layout Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 200);
 // Create a panel with GridLayout
 JPanel panel = new JPanel();
 panel.setLayout(new GridLayout(3, 3));
 // Add buttons to the panel
 for (int i = 1; i <= 9; i++) {
 JButton button = new JButton("Button " + i);
 panel.add(button);
 }
 // Add the panel to the frame
 frame.add(panel);
 // Display the frame
 frame.setVisible(true);
 }
}
