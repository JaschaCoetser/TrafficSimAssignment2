package Model;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.geom.Ellipse2D;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;

import static java.lang.Thread.sleep;

// The following class is the TrafficLight class, this class is supposed to start and stop the set vehicles.
public class TrafficLight extends JPanel implements ActionListener {
    String col;
    int x, y;
    private Object Graphics;

// This default constructor is setting the positions that the traffic class is finding to make its decision on

    TrafficLight(int x, int y, String dir) {
        this.x = x;
        this.y = y;
        this.col = "red";
    }


    // The following is drawing the above TrafficLight
    void drawLight() {

        java.awt.Graphics g = null;
        assert false;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(this.x, this.y, 20, 60);
        if (this.col.equals("red")) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.GRAY);
        }
        g.fillOval(this.x + 15, this.y + 15, 20, 20);
    }

    // The following constructor is setting a timer for the TrafficLight colors
    private void timer() {
        try {
            sleep(10);
        } catch (Exception ignored) {

        }
    }


    public void actionPerformed(ActionEvent e) {

    }
}

