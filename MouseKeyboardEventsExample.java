import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseKeyboardEventsExample {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Mouse and Keyboard Events Example");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(400, 300);
 JPanel panel = new JPanel();
 JLabel label = new JLabel("No Event");
 panel.addMouseListener(new MouseAdapter() {
 public void mouseClicked(MouseEvent e) {
 label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
 }
 });
 panel.addKeyListener(new KeyAdapter() {
 public void keyPressed(KeyEvent e) {
 label.setText("Key Pressed: " + e.getKeyChar());
 }
 });
 panel.setFocusable(true); // Enable keyboard events for the panel
 panel.add(label);
 frame.add(panel);
 frame.setVisible(true);
 // Request focus so that the panel can receive keyboard events
 panel.requestFocus();
 }
}