package Packages.BuiltIn;
// import java.awt.*;  provide basic framework for building GUI
import javax.swing.*; // advance gui based component

public class GUIPackage {
    public static void main(String[] args) {
        // using JFrame from javax.swing package to create a GUI
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked"));
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
