package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class MapPanel extends JFrame {
    public MapPanel() {
        this.setTitle("Waste Management Optimization System Project");
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Welcome to the Waste Management Optimization System Project"));
        panel.add(new JLabel("Status here"));
        panel.add(new JTextArea("Routes"));

        this.add(panel);
        this.setVisible(true);
    }
}
 