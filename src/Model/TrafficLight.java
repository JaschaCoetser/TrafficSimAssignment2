package Model;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import static java.lang.Thread.sleep;


public class TrafficLight extends JPanel implements ActionListener {
    private void timer() {
        try {
            sleep(10);
        } catch (Exception ignored) {

        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < 5; i++) {
//            g.setColor(Color.GRAY);
//            g.fillRect(240, 100, 20,60);
//
//            timer();
//            g.setColor(Color.RED);
//            g.fillOval(240, 100,20,20);
//            timer();
//            g.setColor(Color.GRAY);
//            g.fillOval(240, 100,20,20);
//
//            timer();
//            g.setColor(Color.YELLOW);
//            g.fillOval(240, 120,20,20);
//            timer();
//            g.setColor(Color.GRAY);
//            g.fillOval(240, 120,20,20);
//
//            timer();
//            g.setColor(Color.GREEN);
//            g.fillOval(240, 140,20,20);
//            timer();
//            g.setColor(Color.GRAY);
//            g.fillOval(240, 140,20,20);

        }
    }

    public void actionPerformed(ActionEvent e) {

    }
}

