import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample {
 public static void main(String[] args) {
 // Create a JFrame
 JFrame frame = new JFrame("Border Layout Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(400, 300);
 // Create buttons for each border position
 JButton northButton = new JButton("North");
 JButton southButton = new JButton("South");
 JButton eastButton = new JButton("East");
 JButton westButton = new JButton("West");
 JButton centerButton = new JButton("Center");
 // Set up the BorderLayout
 frame.setLayout(new BorderLayout());
 // Add buttons to different border positions
 frame.add(northButton, BorderLayout.NORTH);
 frame.add(southButton, BorderLayout.SOUTH);
 frame.add(eastButton, BorderLayout.EAST);
 frame.add(westButton, BorderLayout.WEST);
 frame.add(centerButton, BorderLayout.CENTER);
 // Display the frame
 frame.setVisible(true);
 }
}