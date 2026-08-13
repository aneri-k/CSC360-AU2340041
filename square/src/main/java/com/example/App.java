package com.example;

import javax.swing.*;
import java.awt.*;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        // Make the line thicker
        g2.setStroke(new BasicStroke(5));

        // Make the square pink
        g2.setColor(Color.PINK);

        // Square size
        int size = 200;

        // Calculate position to center the square
        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        // Draw hollow square
        g2.drawRect(x, y, size, size);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square");

        App panel = new App();
        frame.add(panel);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}