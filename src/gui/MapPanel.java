package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
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
        JLabel label = new JLabel();
        JButton button = new JButton("Optimize Routes");


        panel.add(new JLabel("Welcome to the Waste Management Optimization System Project"));
        panel.add(new JLabel("Status here"));
        panel.add(new JTextArea("Routes"));

        

        panel.setLayout(new BorderLayout());
        panel.setLayout(new FlowLayout());
        panel.setLayout(new GridLayout(2, 1));

        //panel.add();

        this.add(panel);
        this.setVisible(true);
    }
}
 