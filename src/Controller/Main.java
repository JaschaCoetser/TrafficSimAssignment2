package Controller;

import Model.World;

import javax.swing.*;

// The Following Class is the controller of the program, what is needed to be run
public class Main {
//    private static Object TrafficLight;

    public static void main(String[] args) {
//        World t = new World((Model.TrafficLight) TrafficLight);

//        The following imports the World class into the JFrame, drawing the visible program.
        World t = new World();
        JFrame jf = new JFrame();
        jf.setTitle("TrafficSim");
        jf.setSize(600, 400);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
//        TrafficLight a = new TrafficLight();
//        jf.add(a);
    }
}
