import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class World extends JPanel implements ActionListener{
    Timer tm = new Timer(5, this);
    double x = 0, velX = 0.25;
    Timer tmCar = new Timer(5,this);
    double y = 0, velY = 0.25;
//    final BufferedImage image = ImageIcon(new File("C:\\Users\\coets\\Car.png"));

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 160, 600, 60);
        g.setColor(Color.BLACK);
        g.fillRect(260, 0, 60, 400);
        g.drawLine(0, 190,600,190);
        g.setColor(Color.WHITE);
        g.drawLine(0, 190,600,190);
        g.setColor(Color.WHITE);
        g.drawLine(290, 0,290,400);
        g.setColor(Color.WHITE);
        g.drawLine(290, 0,290,400);
        File input = new File("C:\\Users\\coets\\Car.png");
        BufferedImage image = null;
        try {
            image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image, (int) x, 160, 60, 30, null);

        File inputCar = new File("C:\\Users\\coets\\CarTwo.png");
        BufferedImage Car = null;
        try {
            Car = ImageIO.read(inputCar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(Car, 290, (int) y, 30, 60, null);

        tm.start();
    }

    public static void main(String[] args) {
        World t = new World();
        JFrame jf = new JFrame();
        jf.setTitle("TrafficSim");
        jf.setSize(600, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
    }

    public void actionPerformed(ActionEvent e) {
        if (x < 0 || x > 550)
            velX = -velX;
        x = x + velX;
        repaint();

        if (y < 0 || y > 350)
            velY = -velY;
        y = y + velY;
        repaint();

    }
}
