import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutExample {
 public static void main(String[] args) {
 // Create a JFrame
 JFrame frame = new JFrame("Card Layout Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 200);
 // Create a JPanel with CardLayout
 JPanel cardPanel = new JPanel();
 CardLayout cardLayout = new CardLayout();
 cardPanel.setLayout(cardLayout);
 // Create buttons for different cards
 JButton button1 = new JButton("Card 1");
 JButton button2 = new JButton("Card 2");
 JButton button3 = new JButton("Card 3");
 // Add action listeners to buttons
 button1.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 cardLayout.show(cardPanel, "Card 2");
 }
 });
 button2.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 cardLayout.show(cardPanel, "Card 3");
 }
 });
 button3.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 cardLayout.show(cardPanel, "Card 1");
 }
 });
 // Add buttons to cardPanel with unique names
 cardPanel.add(button1, "Card 1");
 cardPanel.add(button2, "Card 2");
 cardPanel.add(button3, "Card 3");
 // Add the cardPanel to the frame
 frame.add(cardPanel);
 // Display the frame
 frame.setVisible(true);
 }
}