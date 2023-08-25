import javax.swing.*;
import java.awt.*;
public class FlowLayoutExample {
 public static void main(String[] args) {
 // Create a JFrame
 JFrame frame = new JFrame("Flow Layout Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 200);
 // Create a panel with FlowLayout
 JPanel panel = new JPanel();
 panel.setLayout(new FlowLayout());
 // Add components to the panel
 JButton button1 = new JButton("Button 1");
 JButton button2 = new JButton("Button 2");
 JButton button3 = new JButton("Button 3");
 JButton button4 = new JButton("Button 4");
 panel.add(button1);
 panel.add(button2);
 panel.add(button3);
 panel.add(button4);
 // Add the panel to the frame
 frame.add(panel);
 // Display the frame
 frame.setVisible(true);
 }
}