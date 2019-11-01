package Model;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.Timer;

// The following class is the world builder, that incorporates the the entire frame 
public class World extends JPanel implements ActionListener {

//// The Following imports the TrafficLight Class
//        private final TrafficLight trafficLight;
//        TrafficLight trafficLight;
//    TrafficLight trafficLight = new TrafficLight(240, 100, "v");
//    private TrafficLight trafficLight = new TrafficLight();


    //    Traffic loops, allowing the cars to move across the screen
    private Timer tm = new Timer(5, this);
    //    The following is a timer allowing the cars to move at a specific velocity
    private double x = 0, velX = 0.25;
    private Timer tmCar = new Timer(5, this);
    private double y = 0, velY = 0.25;

//    public World(TrafficLight trafficLight) {
//        this.trafficLight = trafficLight;
//    }


    //    This constructor is what paints the visual images within the frame
    public void paint(Graphics g) {
//        TrafficLight trafficLight = new TrafficLight(240, 100, "v");
        super.paint(g);
//      The following is using Java Swing imports to build the GUI for the road and intersection
        g.setColor(Color.BLACK);
        g.fillRect(0, 160, 600, 60);
        g.setColor(Color.BLACK);
        g.fillRect(260, 0, 60, 400);
        g.setColor(Color.WHITE);
        g.drawLine(0, 190, 260, 190);
        g.setColor(Color.WHITE);
        g.drawLine(320, 190, 600, 190);
        g.setColor(Color.WHITE);
        g.drawLine(260, 190, 260, 160);
        g.setColor(Color.WHITE);
        g.drawLine(290, 0, 290, 160);
        g.setColor(Color.WHITE);
        g.drawLine(290, 220, 290, 400);
        g.setColor(Color.WHITE);
        g.drawLine(320, 160, 290, 160);
        g.setColor(Color.WHITE);
        g.drawLine(320, 220, 320, 190);
        g.setColor(Color.WHITE);
        g.drawLine(290, 220, 260, 220);
//        trafficLight.drawLight();
//        add(trafficLight);
        g.setColor(Color.GRAY);
        g.fillRect(240, 100, 20, 60);
        g.setColor(Color.RED);
        g.fillOval(240, 100, 20, 20);
        g.setColor(Color.YELLOW);
        g.fillOval(240, 120, 20, 20);
        g.setColor(Color.GREEN);
        g.fillOval(240, 140, 20, 20);
////      Using the BufferedImage, is allowing me to import the Vehicles
        File input = new File("Resources\\Car.png");
        BufferedImage image = null;
        try {
            image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(image, (int) x, 160, 60, 30, null);

        File inputCar = new File("Resources\\CarTwo.png");
        BufferedImage Car = null;
        try {
            Car = ImageIO.read(inputCar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(Car, 290, (int) y, 30, 60, null);

        tm.start();
        tmCar.start();
    }

//    private void add(TrafficLight trafficLight) {
//    }

    private void moveLeft() {
        velX = -1.5;
        velY = 0;
    }

    private void moveRight() {
        velX = 1.5;
        velY = 0;
    }

    private void moveUp() {
        velX = 0;
        velY = -1.5;
    }

    private void moveDown() {
        velX = 0;
        velY = 1.5;
    }

    // This action, is where the cars are being moved across the x and y coordinates 
    public void actionPerformed(ActionEvent e) {
        do {
            if (x < 0 || x > 550)
                velX = -velX;

//            moveLeft();
//            moveRight();
            x = x + velX;
            repaint();
        }
        while (x > 550);
        repaint();

        do {
            if (y < 0 || y > 350)
                velY = -velY;
//            moveUp();
//            moveDown();
            y = y + velY;
            repaint();
        }
        while (x > 350);
        repaint();
    }
}
